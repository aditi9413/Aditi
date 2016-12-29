package lesson1;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in);
		System.out.println("Enter some number");
		int a = scan.nextInt();
		System.out.println("The entered value is");
		System.out.print(a);
		Scanner scan1 = new Scanner( System.in);
		System.out.println("Enter some string");
		String s = scan1.nextLine();
		System.out.println("The entered value is");
		System.out.print(s);
	}

}
