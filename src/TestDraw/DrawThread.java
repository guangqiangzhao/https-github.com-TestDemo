package TestDraw;

public class DrawThread implements Runnable {  
	   
    private Account account;  
    private double drawAmount;  
      
      
    public DrawThread(Account account, double drawAmount) {  
        super();  
        this.account = account;  
        this.drawAmount = drawAmount;  
    }  
  
   public void run() {  
        for(int i=0;i<100;i++){  
           account.draw(drawAmount);      
        }  
    }  
} 
