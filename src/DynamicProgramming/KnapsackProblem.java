package DynamicProgramming;
import java.util.*;
public class KnapsackProblem {

	public static void main(String[] args)throws java.lang.Exception {
  Scanner s = new Scanner(System.in);
  int W = s.nextInt();
  int n = s.nextInt();
   int wt[]= new int [n];
   int val[]=new int[n];
   for(int i =0;i<n;i++){
	   wt[i]=s.nextInt();
   }
   for(int i =0;i<n;i++){
	   val[i]=s.nextInt();
   }
   System.out.print(knapsack(W,wt,val,n));
	}
	static int max(int a, int b) { return (a > b)? a : b; }
	public static int knapsack(int W,int wt[],int val[],int n){
		int i,j;
	    int K[][] = new int[n+1][W+1];
	    for(i=0;i<=n;i++){
	    	for(j=0;j<=W;j++){
	    		if(i==0||j==0){
	    			K[i][j]=0;
	    		}
	    		else if(j<wt[i-1]){
	    			K[i][j]=K[i-1][j];
	    		}
	    		else{
	    			 K[i][j] = max(val[i-1] + K[i-1][j-wt[i-1]],  K[i-1][j]);
	    		}
	    	}
	    }
	return K[n][W];	
	}
}
