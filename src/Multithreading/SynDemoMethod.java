package Multithreading;
class Printer2{
	public synchronized void printline(char ch){
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
class StarPrinter2 extends Thread{
	Printer2 p;
	public StarPrinter2(Printer2 p){
		this.p= p;
	}
	public void run(){
		System.out.println("StarPrinter has been launched");;
		p.printline('*');
	}
}
class HashPrinter2 extends Thread{
	Printer2 p;
	public HashPrinter2(Printer2 p){
		this.p=p;
	}
	public void run(){
		System.out.println("StarPrinter has been launched");;
		p.printline('#');
	}
}
public class SynDemoMethod {

	public static void main(String[] args) {
		System.out.println("Creating Printer...");
		Printer2 p = new Printer2 ();
		System.out.println("Creating Two Threads");
		StarPrinter2 sp = new StarPrinter2 (p);
		HashPrinter2 hp = new HashPrinter2 (p);
		System.out.println("Launching Two Threads");
        sp.start();
        hp.start();

	}

}

