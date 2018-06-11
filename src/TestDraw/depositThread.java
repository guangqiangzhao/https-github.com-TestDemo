package TestDraw;

public class depositThread implements Runnable{  
    private Account account;  
    private double depositAmount;  
       
    public depositThread(Account account, double depositAmount) {  
        super();  
        this.account = account;  
        this.depositAmount = depositAmount;  
   }  
  
 
    public void run() {  
    for(int i=0;i<100;i++){  
         account.deposit(depositAmount);  
      }  
    }  
  
}  
