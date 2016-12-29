package Multithreading;
class Thread3 extends Thread{
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
public class JoinDemo2 {

	public static void main(String[] args) {
		Thread3.mt=Thread.currentThread();
		Thread3 t = new Thread3();
		t.start();
		for(int i =0 ; i<5; i++){
	   		 System.out.println("main: " +i);
	   		try{
				 Thread.sleep(1000);
			 }catch(Exception e){}
	   	 }
	   	 System.out.println("Main is completed");

	}

}
