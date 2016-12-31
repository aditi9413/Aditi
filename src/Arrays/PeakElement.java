package Arrays;

import java.util.Scanner;

public class PeakElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i =0 ; i<n ; i++){
			a[i] = s.nextInt();
		}
		System.out.println(" The index of Peak Element="+peakElement(a,n));
}
public static int peakElement(int a[], int n){
	return findPeak(a,0,n-1,n);
}
public static int findPeak(int a[], int low ,int high , int n){
	int mid=low + (high - low)/2;
	if(mid==0||a[mid-1]<=a[mid]&& mid==(n-1)||a[mid+1]<=a[mid]){
		return mid;
	}
	else if(mid>0&&a[mid-1]>a[mid]){
		return findPeak(a,low,mid-1,n);
	}
	else
		return findPeak(a,mid+1,high,n);
}
}
