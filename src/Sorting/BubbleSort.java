package Sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int a[ ] = { 3,9, 8 ,2 ,6,1};
		BubbleSort(a,6);
		Printarray (a, 6);
 }
  static void BubbleSort( int a[ ] , int n){
	  for(int i=0; i < n; i++){  
          for(int j=1; j < (n-i); j++){  
                   if(a[j-1] > a[j]){  
                         int temp = a[j-1];  
                          a[j-1] = a[j];  
                          a[j] = temp;  
			  }
          }
          }
	   }
	   static void Printarray( int a[ ] , int size){
	  for( int i=0 ; i< size; i++){
		  System.out.print(a[i]);
	  }
	   }
}
