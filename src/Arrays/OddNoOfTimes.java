package Arrays;

import java.util.Scanner;

public class OddNoOfTimes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i =0 ; i<n ; i++){
			a[i] = s.nextInt();
		}
		System.out.println("The Element Occuring Odd Number Of Times="+getoccurence(a,n));
}
  public static int getoccurence(int a[], int n){
	  int res=0;
	  int i;
	  for(i=0;i<n;i++){
		  res=res^a[i];
	  }
	  return res;
  }
}
