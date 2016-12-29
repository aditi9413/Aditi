package Constructors;
class AB{
	int a,b;
	public AB(int a, int b){
		this.a=a; 
		this.b=b;
	}
	void display(){
		System.out.println(a);
		System.out.println(b);
	}
}
public class ThisWord {

	public static void main(String[] args) {
		AB x = new AB(5,6);
		x.display();

	}

}
