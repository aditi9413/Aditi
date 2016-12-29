package CollectionFarmework;

import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		Vector v = new Vector(10,5);
		System.out.println("Capacity=" + v.capacity());
		for(int i = 0; i<10 ; i++){
			v.addElement(i);
		}
		System.out.println("Capacity=" + v.capacity());
		v.addElement("m");
		System.out.println("Capacity=" + v.capacity());
		System.out.println(v);

	}

}
