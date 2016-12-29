package CollectionFarmework;

import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		Stack s = new Stack();
        s.push("A");
        s.push("b");
        s.push("C");
        System.out.println("The Top Of Element="+ s.peek());
        System.out.println(s);
        System.out.println(s.search("A"));
        System.out.println(s.search("Z"));
	}

}
