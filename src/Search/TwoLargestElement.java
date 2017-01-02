package Search;

import java.util.Scanner;

public class TwoLargestElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int a[]=new int [n];
        for(int i =0;i<n;i++){
        	a[i]=s.nextInt();
        }
        TwoLargestElement ob = new TwoLargestElement();	
        ob.print2Largest(a, n);

	}
	public static void print2Largest(int arr[], int arr_size)
	{
	    int i, first, second;
	    if (arr_size < 2)
	    {
	        System.out.println(" Invalid Input ");
	    }
	    first = second = Integer.MIN_VALUE;
	    for (i = 0; i < arr_size ; i ++)
	    {
	        if (arr[i]>first)
	        {
	            second = first;
	            first = arr[i];
	        }
	        else if (arr[i]>second && arr[i] != first)
	            second = arr[i];
	    }
	    if (second == Integer.MIN_VALUE)
	        System.out.println("There is no second Largest element\n");
	    else
	        System.out.println("The largest element is="+first+" and second largest element is="+second);
	}
}
