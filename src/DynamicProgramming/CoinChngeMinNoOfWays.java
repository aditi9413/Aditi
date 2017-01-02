package DynamicProgramming;
import java.util.Scanner;

public class CoinChngeMinNoOfWays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int total=s.nextInt();
		int coin[]=new int[n];
		for(int i =0 ; i<n;i++){
			coin[i]=s.nextInt();	
		}
    System.out.println("Number of Ways="+CoinExchnge(coin,total,n));
}
	 public static int CoinExchnge(int c[], int total, int n){
	    	int i,j;
	    	int T[][]=new int[total+1][n+1];
	    	for(i=0;i<=n;i++){
	    		T[0][i]=1;
	    	}
	    	for(i=1;i<=total+1;i++){
	    		for(j=1;j<=n;j++){
	    			if(j>=c[i]){
	    				T[i][j]= (T[i-1][j]+ T[i][j-c[i]]);
	    			}
	    			else{
	    				T[i][j]=T[i-1][j];
	    			}
	    		}
	    	}
	    	return T[n][total];
	    }

}
