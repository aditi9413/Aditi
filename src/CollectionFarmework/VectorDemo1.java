package CollectionFarmework;

import java.util.*;

public class VectorDemo1 {

	public static void main(String[] args) {
		Vector v = new Vector();
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
