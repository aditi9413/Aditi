package inheritance;
class A{
	public A(){
		System.out.println("In A");
	}
}
class B extends A{
	public B(){
		System.out.println("In B");
	}
}
class C extends B{
	public C(){
		System.out.println("In C");
	}
}
public class MethodOverride {

	public static void main(String[] args) {
		A x = new A();
		B y = new B();
		C z = new C();
	}

}
