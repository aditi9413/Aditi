package Arrays;

import java.util.Scanner;

public class MissingInteger {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i =0 ; i<n ; i++){
			a[i] = s.nextInt();
		}
		System.out.println("The Missing Element="+MissingNum(a,n));
}
public static int MissingNum(int a[],int n){
	int x1=a[0];
	int x2=1;
	for(int i=1;i<n;i++){
		x1=x1^a[i];
	}
	for(int i=2;i<=n+1;i++){
		x2=x2^i;
	}
	return(x1^x2);
}

}
