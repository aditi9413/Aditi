package Multithreading;
class MyRunnable1 extends Thread{
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
public class MultithreadingIndirect {

	public static void main(String[] args) {
		Thread T = Thread.currentThread();
		System.out.println("main () executing in = " + T.getName() + " thread");
		MyRunnable1 r = new MyRunnable1( );
		r.run();
		 System.out.println("Control is back in main thread");
		 r.setName("user");
		 r.start();
		 for(int i =10; i>=0; i--){
			 System.out.println("main: " +i);
			 try{
				 Thread.sleep(1000);
			 }catch(Exception e){}
		 }
		 System.out.println("Main is completed");
}
}
