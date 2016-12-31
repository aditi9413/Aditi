package PatternSearching;

import java.util.Scanner;

public class WildCardPatternMatching {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
        String patr = s.next();
        System.out.println("Pattern and  String Match="+(isWildCardMatch(str,patr)));
      
	}
	public static boolean isWildCardMatch(String str, String patr){
		char[] s = str.toCharArray();
		char[] p = patr.toCharArray();
		int w=0;
		boolean isFirst= true;
		for(int i =0;i<p.length;i++){
			if(p[i]=='*'){
				p[w++]=p[i];
				isFirst=false;
			}
			else{
				p[w++]=p[i];
				isFirst=true;
			}
		}
		boolean t[][]=new boolean[s.length+1][w+1];
		if(w>0&&p[0]=='*'){
			t[0][1]=true;
		}
		t[0][0]=true;
		for(int i =1;i<t.length;i++){
			for(int j = 1;i<t[0].length;i++){
				if(p[j-1]=='?'||s[i-1]==p[j-1]){
					t[i][j]=t[i-1][j-1];
				}
				else if(p[j-1]=='*'){
		
					t[i][j]=t[i-1][j]||t[i][j-1];
				}
				
			}
		}
		return t[s.length][w];
	}

}
