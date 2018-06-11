package TestDraw;

public class Account {    
    private String accountNo;    
    private double balance;    
    //��ʶ�˻����Ƿ��д������    
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
                 //ȡǮ    
                 System.out.println(Thread.currentThread().getName()+" ȡǮ:"+drawAmount);    
                 balance=balance-drawAmount;    
                 System.out.println("��� : "+balance);    
                 //����ʶ�˻��Ƿ����д��ı�־��Ϊfalse    
                 flag=false;    
                 //���������߳�    
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
                  System.out.println(Thread.currentThread().getName()+"��Ǯ"+depositAmount);    
                  balance=balance+depositAmount;    
                  System.out.println("�˻����Ϊ��"+balance);    
                  flag=true;    
                  //���������߳�    
                  this.notifyAll();    
              }    
        } catch (Exception e) {    
           // TODO: handle exception    
            e.printStackTrace();    
        }    
   }    
} 
