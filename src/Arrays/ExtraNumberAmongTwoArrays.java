package Arrays;

import java.util.Scanner;

public class ExtraNumberAmongTwoArrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		int b[] = new int[n+1];
		for(int i =0 ; i<n ; i++){
			a[i] = s.nextInt();
		}
		for(int i =0 ; i<=n ; i++){
			b[i] = s.nextInt();
		}
		System.out.println("The extra number is="+extranum(a,b,n,n+1));
	}
	public static int extranum(int a[],int b[],int n,int m){
		  int res=0;
		  int i;
		  for(i=0;i<n;i++){
			  res=res^a[i];
		  }
		  for(i=0;i<m;i++){
			  res=res^b[i];
		  }
		  return res;
	  }
}
