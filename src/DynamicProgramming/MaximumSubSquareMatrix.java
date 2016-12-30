package DynamicProgramming;

import java.util.Scanner;

public class MaximumSubSquareMatrix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int m= s.nextInt();
        int a[][]= new int[n][m];
        for(int i =0;i<n;i++){
        	for(int j =0;j<m;j++){
        		a[i][j]=s.nextInt();
        	}
        }
        System.out.println("Maximum Size Sub Matrix="+MaxSubSquare(a,m,n));
	}
	public static int min(int a,int b, int c){
        int l = Math.min(a, b);
        return Math.min(l, c);
    }
  public static int MaxSubSquare(int a[][],int n ,int m){
	  int res[][]=new int[n][m];
	  int i,j;
	  int max=0;
	  for(i=0;i<n;i++){
		  res[i][0]=a[i][0];
		  if(res[i][0]==1)
			  max=1;
	  }
	  for(j=0;j<m;j++){
		  res[0][j]=a[0][j];
		  if(res[0][j]==1)
			  max=1;
	  }
	  for(i=1;i<n;i++){
		  for(j=1;j<m;j++){
			  int t= min(res[i-1][j],res[i-1][j-1],res[i][j-1]);
			  res[i][j]=1+t;
			  if(res[i][j]>max){
				  max=res[i][j];
			  }
		  }
	  }
	  return max;
  }
}
