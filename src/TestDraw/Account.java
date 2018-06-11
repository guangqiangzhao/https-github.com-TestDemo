package TestDraw;

public class Account {    
    private String accountNo;    
    private double balance;    
    //标识账户中是否有存款的旗标    
    private boolean flag=false;    
        
    public Account() {    
        super();    
    }    
    
    public Account(String accountNo, double balance) {    
        super();    
        this.accountNo = accountNo;    
        this.balance = balance;    
    }     
        
    public synchronized void draw (double drawAmount){    
            
        try {    
              if(!flag){    
              this.wait();    
             }else {    
                 //取钱    
                 System.out.println(Thread.currentThread().getName()+" 取钱:"+drawAmount);    
                 balance=balance-drawAmount;    
                 System.out.println("余额 : "+balance);    
                 //将标识账户是否已有存款的标志设为false    
                 flag=false;    
                 //唤醒其它线程    
                 this.notifyAll();           
             }    
            } catch (Exception e) {    
                e.printStackTrace();    
        }    
    }    
        
       
   public synchronized void deposit(double depositAmount){    
      try {    
              if(flag){    
                this.wait();    
              }    
              else{    
                  System.out.println(Thread.currentThread().getName()+"存钱"+depositAmount);    
                  balance=balance+depositAmount;    
                  System.out.println("账户余额为："+balance);    
                  flag=true;    
                  //唤醒其它线程    
                  this.notifyAll();    
              }    
        } catch (Exception e) {    
           // TODO: handle exception    
            e.printStackTrace();    
        }    
   }    
} 
