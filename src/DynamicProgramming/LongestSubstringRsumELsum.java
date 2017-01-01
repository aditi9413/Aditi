package DynamicProgramming;

import java.util.Scanner;

public class LongestSubstringRsumELsum {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String str = s.nextLine();
		System.out.println("Length of longest substring whose right string sum equal to left string sum="+findLength(str));
     }
	public static int findLength(String s){
		int m = s.length();
		char[] str=s.toCharArray();
		int res=0;
		for(int i =0;i<=m-2;i++){
		   int l=i,r=i+1;
		   int lsum=0;
		   int rsum=0;
		   while(r<m&&l>=0){
			   lsum=lsum+str[l]-'0';
			   rsum=rsum+str[r]-'0';
			   if(lsum==rsum){
				  res=Math.max(res, r-l+1);
				  l--;
				  r++;
			   }
		   }
		}
		return res;
	}

}
