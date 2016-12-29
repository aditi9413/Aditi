package Multithreading;
class MyThread extends Thread{
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
public class PriorityDemo {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		System.out.println("Main Thread Priority=" +Thread.currentThread().getPriority());
        System.out.println("Child thread Priority= " + t.getPriority());
        t.setPriority(10);
        System.out.println("New Child thread Priority= " + t.getPriority());
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
