package DynamicProgramming;

import java.util.Scanner;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int a[]=new int[100];
		for(int i=0;i<n;i++){
			a[i] = s.nextInt();	
		}
		System.out.println("Length of longest increasing subsequence="+lis(a,n));
   }
	static int max(int a, int b) { return (a > b)? a : b; }
  public static int lis(int a[],int n){
	  int i,j;
	  int l[]=new int[n];
	  int max=0;
	  for(i=0;i<n;i++){
		  l[i]=1;
	  }
	  for(i =1;i<n;i++){
		 for(j=0;j<i;j++){
			 if(a[i]>a[j]){
				 l[i]=max(l[i],1+l[j]);
			 }
		 }
	  }
	  for ( i = 0; i < n; i++ ){
          if ( max < l[i] )
             max = l[i];}

        return max;
  }
}
