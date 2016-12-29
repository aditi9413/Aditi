package Multithreading;
class Thread2 extends Thread{
	public void run( ){
		Thread th = new Thread();
	 Thread.currentThread();
	 System.out.println("run( ) of Myrunnable executing in = " + th.getName() + " thread");
	 for(int i =0 ; i<5; i++){
		 System.out.println("run: " +i);
		 try{
			 Thread.sleep(1000);
		 }catch(Exception e){}
	 }
	 System.out.println("Run is completed");
	}
}
public class JoinDemo {
		public static void main(String[] args)throws InterruptedException{
			Thread2 t = new Thread2();
	        t.start();
	        t.join(10000);
	        for(int i =0 ; i<5; i++){
	   		 System.out.println("main: " +i);
	   	 }
	   	 System.out.println("Main is completed");

	}

}
