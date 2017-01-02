package lesson1;

import java.util.Scanner;

public class NumberBinaryRepresentationPalindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		String b = Integer.toBinaryString(x);
		NumberBinaryRepresentationPalindrome ob = new NumberBinaryRepresentationPalindrome();
	    ob.CheckPalindrome(b);
	}
	public static void CheckPalindrome(String b){
	int l = 0;
    int h = b.length() - 1;
    while (h > l)
    {
        if (b.charAt(l) != b.charAt(h))
        {
            System.out.println("Not Palindrome"+b);
            l++;
            h--;
        }
    }
    System.out.println("palindrome="+b);
}
 
}
