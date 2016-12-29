package Multithreading;
class Printer1{
	public void printline(char ch){
		for(int i =1 ; i< 30; i++){
			System.out.println(ch);
			try{
				Thread.sleep(1000);
			}catch (Exception e){}}
			for(int i =1 ; i< 30; i++){
				System.out.print(ch);
				System.out.println();}
	}
	}
class StarPrinter1 extends Thread{
	Printer1 p;
	public StarPrinter1(Printer1 p){
		this.p=p;
	}
	public void run(){
		synchronized (p){
		System.out.println("StarPrinter has been launched");;
		p.printline('*');}
	}
}
class HashPrinter1 extends Thread{
	Printer1 p;
	public HashPrinter1(Printer1 p){
		this.p=p;
	}
	public void run(){
		synchronized(p){
		System.out.println("StarPrinter has been launched");;
		p.printline('#');}
	}
}
public class SynDemoStatement {

	public static void main(String[] args) {
		System.out.println("Creating Printer...");
		Printer1 p = new Printer1 ();
		System.out.println("Creating Two Threads");
		StarPrinter1 sp = new StarPrinter1 (p);
		HashPrinter1 hp = new HashPrinter1 (p);
		System.out.println("Launching Two Threads");
        sp.start();
        hp.start();

	}

}
