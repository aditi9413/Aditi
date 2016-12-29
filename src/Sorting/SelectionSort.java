package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
			int a[ ] = { 3,9, 8 ,2 ,6,1};
			SelectionSort(a,6);
			Printarray (a, 6);
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