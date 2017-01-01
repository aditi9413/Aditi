package Sorting;

import java.util.Scanner;

public class Segregate01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int a[]=new int [n];
        for(int i =0;i<n;i++){
        	a[i]=s.nextInt();
        }
        Segregate01 x=new Segregate01();
        x.Segregate(a,n);
        for(int i =0;i<n;i++){
        	System.out.print(" "+a[i]);
        }
	}
	public static void Segregate(int a[], int n){
		int l=0;
		int r=n-1;
		while(l<r){
			while(a[l]==0&&l<r)
				l++;
			while(a[r]==1&&l<r)
				r--;
			if(l<r){
				a[l]=0;
				a[r]=1;
				l++;
				r--;
			}
		}
		
	}

}
