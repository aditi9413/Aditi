package String;

import java.util.*;
import java.util.Scanner;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		RemoveDuplicateCharacter a = new RemoveDuplicateCharacter();
		a.RemoveCharacter(str);
}
	public static void RemoveCharacter(String str){
		 LinkedHashSet<Character> lhs = new LinkedHashSet<>();
	        for(int i=0;i<str.length();i++)
	            lhs.add(str.charAt(i));
	        for(Character ch : lhs)
	            System.out.print(ch);
	    }
	}

