package Sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int a[]=new int [n];
        for(int i =0;i<n;i++){
        	a[i]=s.nextInt();
        }
			SelectionSort(a,n);
			Printarray (a, n);
	}
 static void SelectionSort(int a[], int n){
	 for(int i=0;i<n;i++){
   int max = i;
   for(int j =i+1; j<n;j++){
	   if(a[j]<a[max]){
		   max=j;
	   }
	   int temp = a[max];
	   a[max]=a[i];
	   a[i]=temp;
   }
   }
 }
 static void Printarray( int a[ ] , int size){
	  for( int i=0 ; i< size; i++){
		  System.out.print(a[i]);
	  }
}
}