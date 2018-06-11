package TestDraw;

public  class TestDraw {  
	
     public static void main(String[] args) {  
           //创建一个账户  
         Account account=new Account();  
         new Thread(new DrawThread(account, 800),"取钱者").start();  
         new Thread(new depositThread(account, 800),"存款者甲").start();  
         new Thread(new depositThread(account, 800),"存款者乙").start();  
         new Thread(new depositThread(account, 800),"存款者丙").start();  
   
     }  
   
 }

