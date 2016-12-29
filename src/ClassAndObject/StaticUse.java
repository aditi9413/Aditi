package ClassAndObject;
class Ticket{
	int number;
	static int counter;
	static{
		counter=0;
	}
	public Ticket(){
		number=++counter;
	}
	public void show(){
		System.out.println("It is a ticket number = " +number);
	}
	public static int getcounter(){
		return counter;
	}
}
public class StaticUse {

	public static void main(String[] args) {
		System.out.println("Creating tickets");;
		Ticket t1 = new Ticket();
		Ticket t2 = new Ticket();
		System.out.println("No of Tickets CREATED= " + Ticket.getcounter());
		System.out.println("Ticket Discription");
		t1.show();
		t2.show();

	}

}
