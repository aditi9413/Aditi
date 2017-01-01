package Arrays;

import java.util.Scanner;

public class SmallestMissingNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i =0 ; i<n ; i++){
			a[i] = s.nextInt();
		}
		System.out.println("The Smallest Missing Element="+findSmallestMissing(a,0,n-1));

	}
	public static int findSmallestMissing(int a[], int s, int e) 
    {
        if (s >e)
            return e + 1;
        if (s != a[s])
            return s;
        int mid = (s+ e) / 2;
         if (a[mid] > mid)
            return findSmallestMissing(a, s, mid);
        else
            return findSmallestMissing(a, mid + 1,e);
    }
}
