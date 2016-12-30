package Arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i =0 ; i<n ; i++){
			a[i] = s.nextInt();
		}
		 printArray(a, n);
	     rvereseArray(a, 0, n-1);
	        System.out.println("Reversed array is ");
	     printArray(a, n);

	}
	 static void rvereseArray(int arr[], int start, int end)
	    {
	        int temp;
	        if (start >= end)
	            return;
	        temp = arr[start];
	        arr[start] = arr[end];
	        arr[end] = temp;
	        rvereseArray(arr, start+1, end-1);
	    }
	    static void printArray(int arr[], int size)
	    {
	        for (int i=0; i < size; i++)
	            System.out.print(arr[i] + " ");
	        System.out.println("");
	    }
}
