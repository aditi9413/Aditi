package lesson1;

import java.util.Scanner;

public class FibonacciGenerator {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Fibonacci Generator number upto whic series nust be printed");
		int n=s.nextInt();
		for ( int i = 1 ; i <= n ; i++ )
		   {
       System.out.print( FibonacciGenerator(i) + " ");
       }		
	}
static int FibonacciGenerator( int n){
	if (n==1|| n==2){
		return 1;
	}
	else 
		return (FibonacciGenerator (n-1)+FibonacciGenerator (n-2));
}
}
