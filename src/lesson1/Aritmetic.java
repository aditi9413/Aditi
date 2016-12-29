package lesson1;

import java.util.Scanner;

public class Aritmetic {

	public static void main(String[] args) {
		Scanner s = new Scanner( System.in);
		System.out.println("Enter The two values");
		int x = s.nextInt();
		int y = s.nextInt();
		int answer = x+y;
		System.out.println("The sum Of Two Values=" + answer);

		Scanner s1 = new Scanner( System.in);
		System.out.println("Enter The two values");
		int a = s1.nextInt();
		int b= s1.nextInt();
		int answer1 = a*b;
		System.out.println("The multiply Of Two Values=" + answer1);
		
		Scanner s2 = new Scanner( System.in);
		System.out.println("Enter The two values");
		double p = s2.nextDouble();
		double q= s2.nextDouble();
		double answer3 = p/q;
		System.out.println("The multiply Of Two Values=" + answer3);
		
		Scanner sc = new Scanner( System.in);
		char g = sc.next().charAt(0);
		System.out.println("G: "+g); 
	}

}
