package Sorting;

import java.util.Scanner;

public class SegregateEvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int a[]=new int [n];
        for(int i =0;i<n;i++){
        	a[i]=s.nextInt();
        }
        SegregateEvenOdd eo=new SegregateEvenOdd();
        eo.SegregateEO(a,n);
        for(int i =0;i<n;i++){
        	System.out.print(" "+a[i]);
        }
	}
	public static void SegregateEO(int a[], int n){
		int l=0;
		int r=n-1;
		while(l<r){
			while(a[l]%2==0&&l<r)
				l++;
			while(a[r]%2==1&&l<r)
				r--;
			if(l<r){
				int temp=a[l];
				a[l]=a[r];
				a[r]=temp;
				l++;
				r--;
			}
		}
		
	}
}


