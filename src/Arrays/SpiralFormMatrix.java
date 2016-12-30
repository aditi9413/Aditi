package Arrays;

import java.util.Scanner;

public class SpiralFormMatrix {

	public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	int r=s.nextInt();
	int c = s.nextInt();
	int a [][]=new int [r][c];
	for(int i =0;i<r;i++){
		for(int j =0 ; j<c;j++){
			a[i][j]=s.nextInt();
		}
	}
	spiralPrint(r,c,a);
	}
	public static void spiralPrint(int m, int n, int a[][])
	{
	    int i, k = 0, l = 0;
	 
	    /*  k - starting row index
	        m - ending row index
	        l - starting column index
	        n - ending column index
	        i - iterator
	    */
	 
	    while (k < m && l < n)
	    {
	        for (i = k; i < m; ++i)
	        {
	            System.out.println(" "+a[i][l]);
	        }
	        l++;
	        for (i = l; i < n; ++i)
	        {
	            System.out.println(" "+a[m-1][i]);
	        }
	        m--;
	        if ( l < n)
	        {
	            for (i = m-1; i >= k; --i)
	            {
	                System.out.println(" "+a[i][n-1]);
	            }
	            n--;
	        }
	        if (k<m)
	        {
	            for (i = n-1; i >= l; --i)
	            {
	                System.out.println(" "+a[k][i]);
	            }
	            k++;    
	        }        
	    }
	}
}
