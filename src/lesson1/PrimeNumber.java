package lesson1;

import java.util.Scanner;

public class PrimeNumber {
	static boolean PrimeNumber( int num ){
        int sqrt = (int) Math.sqrt(num) + 1;
		for (int i= 2; i < sqrt ; i++)
		{ 
		if(num%i==0){
			return false;
		}
	}
return true;
}
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int num = s.nextInt();
		PrimeNumber P = new PrimeNumber();
		if (P.PrimeNumber(num))
		{
			System.out.println("Prime Number");	
		}
		else 
			System.out.println("Not Prime Number");
		}

}
