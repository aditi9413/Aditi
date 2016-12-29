package DynamicProgramming;

import java.util.Scanner;

public class LongestCommonSubString {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String s1 = s.next();
		String s2 = s.next();
        System.out.println(lcs(s1,s2));
}
	public static int lcs(String s1, String s2){
		int m= s1.length();
		int n = s2.length();
		int result=0;
		int L[][]=new int [m+1][n+1];
		for(int i =0;i<=m;i++){
			for(int j = 0; j<=n;j++){
				if(i==0||j==0){
					L[i][j]=0;
				}
				else if(s1.charAt(i-1)==s2.charAt(j-1)){
					L[i][j]=L[i-1][j-1]+1;
					result=Math.max(result, L[i][j]);
				}
				else
					L[i][j]=0;
            }
			}
		return result;
		}
}
