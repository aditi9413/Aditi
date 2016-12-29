package DynamicProgramming;

import java.util.Scanner;

public class LongestPalindromicSubsequence {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String s1 = s.next();
        System.out.println("Longest Palindromic Subsequence="+lps(s1));
	}
public static int lps(String s1){
	int n = s1.length();
	int l[][]=new int[n][n];
	int i,j,cl;
	 for (i = 0; i < n; i++)
         l[i][i] = 1;
	 for (cl=2; cl<=n; cl++)
     {
	for(i=0;i<n-cl+1;i++){
		 j = i+cl-1;
         if (s1.charAt(i) == s1.charAt(j) && cl == 2)
            l[i][j] = 2;
         else if(s1.charAt(i)==s1.charAt(j)){
				l[i][j]=l[i+1][j-1]+2;
			}
			else
				l[i][j]=Math.max(l[i+1][j], l[i][j-1]);
		}
	}
	
	return l[0][n-1];
}
}
