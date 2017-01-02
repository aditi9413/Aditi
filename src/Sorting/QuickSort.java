package Sorting;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args)  {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int a[]=new int [n];
        for(int i =0;i<n;i++){
        	a[i]=s.nextInt();
        }
		  QuickSort ob = new QuickSort();
	        ob.QuickSort(a, 0, n-1);
		Printarray (a, n);
	}
 static void QuickSort( int a[], int low, int high){
	 if(low<high){
		 int p = partition(a,low,high);
		 QuickSort(a,low,p-1);
		 QuickSort(a,p+1,high);
	 }
 }
 static int partition(int a [], int low, int high){
	 int p = a[high];
	int  i=(low-1);
	for(int j=low;j<=high-1;j++){
		if ( a[j]<=p){
			i++;
			swap(a,i,j);
		}
	}
		swap(a,i+1,high);
		return( i+1);
	}
	static void swap(int a[],int i,int j){
		 int temp =a[i];
		 a[i]=a[j];
		 a[j]=temp;
		 }
	static void Printarray( int a[ ] , int size){
		  for( int i=0 ; i< size; i++){
			  System.out.print(a[i]);
	 }
	}
}
	
