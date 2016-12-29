package CollectionFarmework;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
        l.add("Aditi");
        l.add("30");
        l.add("Nish");
        System.out.println(l);
        System.out.println("Size of list=" + l.size());
        l.addFirst("love");
        l.addLast("80");
        System.out.println(l);
        System.out.println("Size of list=" + l.size());
        l.getFirst();
        l.getLast();
        l.remove(3);
        l.set(2, "40");
        l.removeLast();
        System.out.println(l);
        System.out.println("Size of list=" + l.size());
        
        
	}

}
