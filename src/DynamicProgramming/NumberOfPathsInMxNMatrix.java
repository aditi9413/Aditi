package DynamicProgramming;

import java.util.Scanner;

public class NumberOfPathsInMxNMatrix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int m= s.nextInt();
      System.out.println(("Number Of Ways="+CountPath(n,m)));
	}
  public static int CountPath(int n , int m){
	  int a[][]= new int[n][m];
	  int i,j;
	  for(i=0;i<n;i++){
		  a[i][0]=1;
	  }
	  for(i=0;i<m;i++){
		  a[0][i]=1;
	  }
	  for(i=1;i<n;i++){
		  for(j=1;j<m;j++){
			  a[i][j]=a[i-1][j]+a[i][j-1];
		  }
	  }
	  return a[n-1][m-1];
  }
}
