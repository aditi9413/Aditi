package PatternSearching;

import java.util.Scanner;

public class NaiveSearching {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
        String txt=s.nextLine();
        String patr=s.nextLine();
        NaiveSearching n = new NaiveSearching();
        n.naive(txt,patr);
        }
public static void naive(String t , String p){
	int m=p.length();
	int n = t.length();
	for(int i =0;i<n-m;i++){
		for(int j=0;j<m;j++){
			if(t.charAt(i+j)!=p.charAt(j)){
				break;
			}
			if (j == m)
		      System.out.println("Pattern found at index="+i);
			}
	}
}
}
