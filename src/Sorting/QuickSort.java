package Sorting;

public class QuickSort {

	public static void main(String[] args)  {
		int a[ ] = { 3,9, 8 ,2 ,6,1};
		int n=a.length;
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
	
