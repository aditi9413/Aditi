package Multithreading;
class Thread1 extends Thread{
	public void run( ){
		Thread th = new Thread();
	 Thread.currentThread();
	 System.out.println("run( ) of Myrunnable executing in = " + th.getName() + " thread");
	 for(int i =0 ; i<5; i++){
		 System.out.println("run: " +i);
		 try{
			 Thread.yield();
		 }catch(Exception e){}
	 }
	 System.out.println("Run is completed");
	}
}
public class YieldDemo {

	public static void main(String[] args) {
		Thread1 t = new Thread1();
        t.start();
        for(int i =0 ; i<5; i++){
   		 System.out.println("main: " +i);
   	 }
   	 System.out.println("Main is completed");
	}

}
