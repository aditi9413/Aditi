package PatternSearching;

import java.util.Scanner;

public class KMPsearch {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
        String txt=s.next();
        String patr=s.next();
        KMPsearch k = new KMPsearch();
        k.KMP(txt,patr);
	}
   public static void KMP(String T, String P){
	   int n=T.length();
	   int m = P.length();
	   int lps[] = new int[m];
	   int j =0;
	   int i =0;
	   computePrefix(lps,m,P);
	   while(i<n){
		   if(T.charAt(i)==P.charAt(j)){
			   i++;
			   j++;
		   }
		   if(j==m){
			   System.out.println("Pattern found"+" At index"+(i-j));
			   j=lps[j-1];
		   }
		   else if(i<n&&T.charAt(i)!=P.charAt(j)){
			   if(j!=0){
				   j=lps[j-1];
				  }
				  else{
					  j=i+1;  
			   }
		   }
	   }
   }
   public static void computePrefix(int lps[],int m , String P){
	  int j=0;
	  int i=1;
	  lps[0]=0;
	  while(i<m){
		  if(P.charAt(j)==P.charAt(i)){
			  j++;
			  lps[i]=j;
			  i++;
		  }
		  else{
			  if(j!=0){
				  j=lps[j-1];
			  }
			  else{
				  lps[i]=j;
				  i++;
			  }
		  }
		  
	  }
   }
}
