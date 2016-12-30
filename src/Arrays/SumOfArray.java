package Arrays;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		int sum=0;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i =0 ; i<n ; i++){
			a[i] = s.nextInt();
		}
		for(int i =0 ; i<n ; i++){
			sum= sum+a[i];
		}
     System.out.println(sum);
	}

}
