package String;

import java.util.Scanner;

public class RemoveVowel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s2;
		String s1 = s.nextLine();
		s2=s1.replaceAll("[aeiouEIOU]","");
		System.out.print(s2);
	}

}
