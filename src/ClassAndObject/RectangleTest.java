package ClassAndObject;
class Rectangle{
	private int l,b;
	public void display(){
		System.out.println("Length=" +l);
		System.out.println("Breadth="+b);
		}
	public int area(){
		return l*b;
	}
	public void setdimension(int x , int y){
		l=x;
		b=y;
	}
}
public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.setdimension(5,7);
		
	}

}
