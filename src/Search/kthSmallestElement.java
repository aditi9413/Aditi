package Search;

import java.util.Scanner;

public class kthSmallestElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int a[]=new int [n];
        for(int i =0;i<n;i++){
        	a[i]=s.nextInt();
        }
        int k =s.nextInt();
        kthSmallestElement ob = new kthSmallestElement();
        System.out.println("K'th smallest element is "+ob.kthSmallest(a, 0, n-1, k));
	}
	public static int kthSmallest(int arr[],int l,int r, int k)
	    {
	        if (k > 0 && k <= r - l + 1)
	        {
	            int pos = randomPartition(arr, l, r);
	            if (pos-l == k-1)
	                return arr[pos];
	            if (pos-l > k-1)
	                return kthSmallest(arr, l, pos-1, k);
	            return kthSmallest(arr, pos+1, r, k-pos+l-1);
	        }
	        return Integer.MAX_VALUE;
	    }
	public static void swap(int arr[], int i, int j)
	    {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
public static int partition(int arr[], int l, int r)
	    {
	        int x = arr[r], i = l;
	        for (int j = l; j <= r - 1; j++)
	        {
	            if (arr[j] <= x)
	            {
	                swap(arr, i, j);
	                i++;
	            }
	        }
	        swap(arr, i, r);
	        return i;
	    }
public static int randomPartition(int arr[], int l, int r)
	    {
	        int n = r-l+1;
	        int pivot = (int)(Math.random()) % n;
	        swap(arr, l + pivot, r);
	        return partition(arr, l, r);
	    }
	 
}
