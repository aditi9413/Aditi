package DynamicProgramming;

import java.util.Scanner;

public class EditDistance {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String s1 = s.next();
		String s2 = s.next();
        System.out.println("Number of operations="+EditDistance(s1,s2));
}
	static int min(int x,int y,int z)
    {
        if (x < y && x <z) return x;
        if (y < x && y < z) return y;
        else return z;}
public static int EditDistance(String s1,String s2){
	int m=s1.length();
	int n=s2.length();
	int dis[][]=new int [m+1][n+1];
	int i,j;
	for(i=0;i<=m;i++){
		for(j=0;j<=n;j++){
		if(i==0)
			dis[i][j]=j;
		else if(j==0){
			dis[i][j]=i;
		}
		else if(s1.charAt(i-1)==s2.charAt(j-1)){
			dis[i][j]=dis[i-1][j-1];
		}
		else {
			dis[i][j]= 1+min(dis[i-1][j],
			       dis[i-1][j-1],
			       dis[i][j-1]);
		}
		}
	}
	return dis[m][n];
}
}
