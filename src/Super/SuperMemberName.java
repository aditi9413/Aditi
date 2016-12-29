package Super;

class Common{
	int l,b;
	public Common(int x,int y){
		l=x;
		b=y;
	}
	public void display(){
		System.out.println("Length=" + l);
		System.out.println("Breadth=" +b);
	}
}
class Rectangle extends Common{
	public Rectangle(int x ,int y){super(x,y);}
	public int area(){
		return l*b;
		}
		public int perimeter(){
			return 2*(l+b);
		}
	}
class Cuboid extends Common{
	int l ;
	public Cuboid(int x , int y, int z){
		super(x,y);
		l=z;
	}
	public void display(){
		super.display();
		System.out.println("Height=" +l);
	}
	int volume(){
		return super.l*b*l;  //super with data member is used
		}
}
public class SuperMemberName {

	public static void main(String[] args) {
		 Rectangle r = new Rectangle(9,4);
		   Cuboid c = new Cuboid(6,9,6);
		   r.display();
		   c.display();
		   System.out.println("Area of rectangle=" +r.area());
		   System.out.println("Perimeter of Rectangle=" + r.perimeter());
		   System.out.println("Volume Of Cuboid=" + c.volume());	

	}

}
