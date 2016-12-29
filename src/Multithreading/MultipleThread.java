package Multithreading;
class NewThread extends Thread{
	public void run( ){
	 Thread Th = new Thread();
	 Th.currentThread();
	 System.out.println("run( ) of Myrunnable executing in = " + Th.getName() + " thread");
	 for(int i =0 ; i<5; i++){
		 System.out.println("run: " +i);
		 try{
			 Thread.sleep(1000);
		 }catch(Exception e){}
	 }
	 System.out.println("Run is completed");
	}
}

public class MultipleThread {

	public static void main(String[] args) {
		Thread T = Thread.currentThread();
		System.out.println("main () executing in = " + T.getName() + " thread");
		NewThread r1 = new NewThread( );
		r1.run();
		 r1.setName("user1");
		 NewThread r2 = new NewThread( );
		 r2.run();
		 r2.setName("user2");
		 NewThread r3 = new NewThread( );
		 r3.run();
		 r3.setName("user3");
			 try{
				 Thread.sleep(1000);
			 }catch(Exception e){}
		 System.out.println("Main is completed");
}}
