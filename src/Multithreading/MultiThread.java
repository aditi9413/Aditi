package Multithreading;

class MyRunnable implements Runnable{
	public void run( ){
	 Thread Th = new Thread();
	 Th.currentThread();
	 System.out.println("run( ) of Myrunnable executing in = " + Th.getName() + " thread");
	 for(int i =0 ; i<10; i++){
		 System.out.println("run: " +i);
		 try{
			 Thread.sleep(1000);
		 }catch(Exception e){}
	 }
	 System.out.println("Run is completed");
	}
}
public class MultiThread {

	public static void main(String[] args) {
		Thread T = Thread.currentThread();
		System.out.println("main () executing in = " + T.getName() + " thread");
		MyRunnable r = new MyRunnable( );
		r.run();
		 System.out.println("Control is back in main thread");
		 Thread t = new Thread(r);
		 t.setName("user");
		 t.start();
		 for(int i =10; i>0; i--){
			 System.out.println("main: " +i);
			 try{
				 Thread.sleep(1000);
			 }catch(Exception e){}
		 }
		 System.out.println("Main is completed");
}
}
