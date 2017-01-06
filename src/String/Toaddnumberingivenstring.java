package String;

import java.util.Scanner;

//String=9,99,9,99 output=216
public class Toaddnumberingivenstring {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.next();
		int sum=0;
		String []s1=str.split(",");
		int i =0;
		Integer[]a=new Integer[s1.length];
		  for(String s2:s1){
	    a[i]=Integer.parseInt(s2);
         sum=sum+a[i];
	}
		  System.out.println(sum);
}
	}
