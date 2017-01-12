package Tree;

import java.util.Scanner;

public class sumatKthLevel {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String str = s.nextLine();
		char s1[]=str.toCharArray();
		int k = s.nextInt();
		int ans= 0;
	   sum_at_level(s1,k,0,ans,0,str.length()-1);

	}
public static void  sum_at_level(char s[] ,int k,int level,int ans,int start,int end){
	
	if(end-start+1<=2)
    	return;
    else if(level==k){
        ans = ans + s[start+1]-48;
    
    }
    else if(start+2<end){
        int t =0,i=0;
        for(i = start+2;i<=end;i++){
            if(s[i]=='(')
            ++t;
            if(s[i]==')')
            --t;
            if(t==0)
            break;
        }
        sum_at_level(s,k,level+1, ans , start+2 ,i );
        if(i+1<end)
        sum_at_level(s,k,level+1,ans,i+1,end-1);
}
    System.out.println(""+ans);
}
}
