package Multithreading;
class Thread4 extends Thread{
	static Thread mt;
	public void run( ){
		try{
			 mt.join();
		 }catch(InterruptedException e){}
	 
	 for(int i =0 ; i<5; i++){
		  System.out.println("run: " +i);}	 
	 System.out.println("Run is completed");
	}
}

public class JoinDeadlock {

	public static void main(String[] args)throws InterruptedException {
		Thread4.mt=Thread.currentThread();
		Thread4 t = new Thread4();
		t.start();
		t.join();
		for(int i =0 ; i<5; i++){
	   		 System.out.println("main: " +i);
	   		try{
				 Thread.sleep(1000);
			 }catch(Exception e){}
	   	 }
	   	 System.out.println("Main is completed");

	}

}
