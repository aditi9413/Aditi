package String;

import java.util.Scanner;

public class SwapString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2=s.nextLine();
        SwapString a= new SwapString();
        a.Swap(str1,str2);
	}
    public static void Swap(String s1, String s2){
    	String temp=s1;
    	s1=s2;
    	s2=temp;
    	System.out.print(s1+" "+s2);
    }
}
