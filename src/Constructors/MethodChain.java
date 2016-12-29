package Constructors;
class Swapper{
	int a,b;
	public Swapper(int a, int b){
		this.a=a;
		this.b=b;
	}
	public Swapper Swapper( ){
		int c = this.a;
		this.a=this.b;
		this.b= c;
		return this;
	}
	public Swapper display(){
		System.out.println("a=" +this.a);
		System.out.println("b=" +this.b);
		return this;
	}
}
public class MethodChain {

	public static void main(String[] args) {
		
		Swapper x = new Swapper(2,5);
		x.display().Swapper().display();
		new Swapper(5,6).display().Swapper().display();
	}

}
