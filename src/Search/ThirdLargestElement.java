package Search;

import java.util.Scanner;

public class ThirdLargestElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int a[]=new int [n];
        for(int i =0;i<n;i++){
        	a[i]=s.nextInt();
        }
        ThirdLargestElement ob = new ThirdLargestElement();	
        ob.thirdLargest(a, n);

	}
	public static void thirdLargest(int arr[], int arr_size)
	{
	    if (arr_size < 3)
	    {
	        System.out.println(" Invalid Input ");
	    }
	    int first = arr[0], second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
	    for (int i = 1; i < arr_size ; i ++)
	    {
	        if (arr[i] > first)
	        {
	            third  = second;
	            second = first;
	            first  = arr[i];
	        }
	        else if (arr[i] > second)
	        {
	            third = second;
	            second = arr[i];
	        }
	        else if (arr[i] > third)
	            third = arr[i];
	    }
	 
	    System.out.println("The third Largest element is="+third);
	}
}
