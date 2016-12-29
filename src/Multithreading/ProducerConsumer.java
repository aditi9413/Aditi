package Multithreading;
class Buffer{
	private int value;
	public synchronized void produce(int v){
		value = v;
		System.out.println("Value is produced");}
	public synchronized void consumer(){
		System.out.println("Value is consumed");}	
}
class Producer extends Thread{
	Buffer b;
	public Producer(Buffer b){
		this.b=b;
	}
	public void run(){
		for(int i=0;i<10;i++){
			b.produce(i);
		}
	}
}
class Consumer extends Thread{
	Buffer b;
	public Consumer(Buffer b){
		this.b=b;
	}
	public void run(){
		for(int i=0;i<10;i++){
			b.consumer();
		}
	}
}
public class ProducerConsumer {

	public static void main(String[] args) {
		Buffer b = new Buffer();
		System.out.print("Creating Producer and consumer");
		Producer p = new Producer(b);
		Consumer c = new Consumer(b);
		p.start();
		c.start();

	}

}
