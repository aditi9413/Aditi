package Arrays;

import java.util.Scanner;

public class LeaderElements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i =0 ; i<n ; i++){
			a[i] = s.nextInt();
		}
		printLeader(a,n);
	}
  public static void printLeader(int a[],int n){
	  int max=a[n-1];
	  System.out.println("The leaders are");
	  System.out.print(max+" ");
	  for(int i = n-2;i>=0;i--){
		 if(max<a[i]){
			 max=a[i];
			 System.out.print(max+" ");	 
		 }
	  }
  }
  }

