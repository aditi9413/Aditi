package lesson1;

import java.util.Scanner;

public class ReverseNumber {
	public int reverse(int number){
		  int reverse = 0;
		  while(number > 0){
			 reverse =( reverse*10) +(number%10);
			 number= number/10;
		  }
		  return reverse;
	 }
	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 int number = s.nextInt();
	 ReverseNumber n =new  ReverseNumber();
	 System.out.println("RESULT=" + n.reverse(number));
	 

	}

}
