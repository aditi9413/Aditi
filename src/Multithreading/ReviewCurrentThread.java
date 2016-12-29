package Multithreading;

public class ReviewCurrentThread {

	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println("Current thread=" + t.getName());
		t.setName("User");
		System.out.println("After name change thread=" + t.getName());
		try{
			for(int i = 1; i<=5; i++){
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e){}
		System.out.println("Main ended");
	}

}
