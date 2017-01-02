package Arrays;

import java.util.Scanner;


public class SumClosestTwoPair {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int a[]=new int [n];
        for(int i =0;i<n;i++){
        	a[i]=s.nextInt();
        }
        int x= s.nextInt();
        SumClosestTwoPair o=new SumClosestTwoPair();
        o.FindClosest(a,n,x);
	}
  public static void FindClosest(int a[], int n,int x){
	  int rl=0,rr=0;
	  int l = 0, r = n-1, diff = Integer.MAX_VALUE;
      while (r > l)
      {
          if (Math.abs(a[l] + a[r] - x) < diff)
          {
             rl = l;
             rr = r;
             diff = Math.abs(a[l] + a[r] - x);
          }
          if (a[l] + a[r] > x)
             r--;
          else
             l++;
      }

  System.out.println(" The closest pair is "+a[rl]+" and "+ a[rr]);
  }
  }
