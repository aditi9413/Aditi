package CollectionFarmework;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
	ArrayList l = new ArrayList();
	l.add("A");
	l.add("1");
	l.add("B");
	l.add("2");
	l.add("null");
	System.out.println(l);
	 System.out.println("Size of list=" + l.size());
     l.remove(2);
     System.out.println(l);
     System.out.println("Size of list=" + l.size());
     l.add(2, "A");
     l.add("C");
     System.out.println(l);
     System.out.println("Size of list=" + l.size());
     if(l.contains("A")){
    	 System.out.println("Element Found");}
    	 else
    		 System.out.println("Element Not Found");
     }
     
	}

