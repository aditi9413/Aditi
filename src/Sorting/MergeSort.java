package Sorting;

public class MergeSort {

	public static void main(String[] args) {
		int a[ ] = { 3,9, 8 ,2 ,6,1};
		int n=a.length;
		  MergeSort ob = new MergeSort();
	        ob.Merge(a, 0, n-1);
		    Printarray (a, n);

	}
static void Merge(int a[],int r,int l){
	if(r<l){
		int m=(r+l)/2;
		Merge(a,r,m);
		Merge(a,m+1,l);
		MergeSort(a,l,m,r);
	}
}
static void MergeSort(int a[], int r,int m, int l){
	int n1=m-l+1;
	int n2=r-m;
	int L[] = new int [n1];
    int R[] = new int [n2];

    for (int i=0; i<n1; ++i)
        L[i] = a[l + i];
    for (int j=0; j<n2; ++j)
        R[j] = a[m + 1+ j];
 int i = 0, j = 0;
 int k = l;
    while (i < n1 && j < n2)
    {
        if (L[i] <= R[j])
        {
            a[k] = L[i];
            i++;
        }
        else
        {
            a[k] = R[j];
            j++;
        }
        k++;
    }
    while (i < n1)
    {
        a[k] = L[i];
        i++;
        k++;
    }
    while (j < n2)
    {
        a[k] = R[j];
        j++;
        k++;
    }
}
static void Printarray( int a[ ] , int size){
	  for( int i=0 ; i< size; i++){
		  System.out.print(a[i]);
}
}
}

