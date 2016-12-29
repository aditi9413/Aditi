package Multithreading;
class NewThread1 extends Thread{
	String name;
	 Thread Th = new Thread();
	NewThread1( String n){
		name=n;
		Th = new Thread(this,name);
		System.out.println("New thread =" +Th );
}
	public void run( ){
	 for(int i =0 ; i<5; i++){
		 System.out.println("run: " +i);
		 try{
			 Thread.sleep(1000);
		 }catch(Exception e){
			 System.out.println("Interrupted = " +name);
			 Th.start();
		 }
	 }
	 System.out.println("Exciting=" + name);
	}
}

public class ToCheckThreadAlive {

	public static void main(String[] args) {
		NewThread1 r1 = new NewThread1( "User 1");
		 NewThread1 r2 = new NewThread1("User 2" );
		 NewThread1 r3 = new NewThread1("User 3" );
		 System.out.println("User 1 is alive=" + r1.Th.isAlive());
		 System.out.println("User 2 is alive=" + r2.Th.isAlive());
		 System.out.println("User 3 is alive=" + r3.Th.isAlive());
			 try{
				 System.out.println("Waiting For Threads to complete");
				 r1.Th.join();
				 r2.Th.join();
				 r3.Th.join();
				 Thread.sleep(1000);
			 }catch(Exception e){
				 System.out.println("Main is completed");
			 }
			 System.out.println("User 1 is alive=" + r1.isAlive());
			 System.out.println("User 2 is alive=" + r2.isAlive());
			 System.out.println("User 3 is alive=" + r3.isAlive());
			 System.out.println("Main is exiting");
	}

}
