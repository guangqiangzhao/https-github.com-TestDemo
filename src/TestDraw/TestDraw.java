package TestDraw;

public  class TestDraw {  
	
     public static void main(String[] args) {  
           //����һ���˻�  
         Account account=new Account();  
         new Thread(new DrawThread(account, 800),"ȡǮ��").start();  
         new Thread(new depositThread(account, 800),"����߼�").start();  
         new Thread(new depositThread(account, 800),"�������").start();  
         new Thread(new depositThread(account, 800),"����߱�").start();  
   
     }  
   
 }

