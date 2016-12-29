package CollectionFarmework;

import java.util.*;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        System.out.println(l);
        ListIterator ltr = l.listIterator();
        while(ltr.hasNext()){
        	String s = (String)ltr.next();
        	if(s.equals("B")){
        		ltr.remove();}
        		else if(s.equals("C")){
        		ltr.add("E");	
        		}
        		else if (s.equals("D")){
        			ltr.add("J");
        	}
        		else if (s.equals("A")){
        			ltr.set("N");
        		}
        }
        
        System.out.println(l);
	}

}
