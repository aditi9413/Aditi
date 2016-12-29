package Constructors;
class AbC{
	int a,b;
	public AbC(){
		this(2,3);
	System.out.println("In Default");
	}
	public AbC(int a){
		this(a,3);
		System.out.println("In one parametrized constructer");
	}
	public AbC(int a , int b){
		this.a=a;
		this.b=b;
		System.out.println("In two parametrized constructer");
	}
	public void display(){
		System.out.println("a=" +this.a);
		System.out.println("b=" +this.b);
	}
}
public class ConstructorChain {

	public static void main(String[] args) {
		AbC x = new AbC();
		x.display();
		AbC y = new AbC(5);
		y.display();
		AbC z = new AbC(10,20);
		z.display();
}

}
