package Multithreading;
class Printer{
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
class StarPrinter extends Thread{
	Printer p;
	public StarPrinter(Printer p){
		this.p=p;
	}
	public void run(){
		System.out.println("StarPrinter has been launched");;
		p.printline('*');
	}
}
class HashPrinter extends Thread{
	Printer p;
	public HashPrinter(Printer p){
		this.p=p;
	}
	public void run(){
		System.out.println("StarPrinter has been launched");;
		p.printline('#');
	}
}
public class SynDemo {

	public static void main(String[] args) {
		System.out.println("Creating Printer...");
		Printer p = new Printer ();
		System.out.println("Creating Two Threads");
		StarPrinter sp = new StarPrinter (p);
		HashPrinter hp = new HashPrinter (p);
		System.out.println("Launching Two Threads");
        sp.start();
        hp.start();
	}
}

