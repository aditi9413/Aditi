package String;

import java.util.Scanner;

public class PrintUniqueCharacter {
	static StringBuffer s1=new StringBuffer();
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int i =0;
		int j=0;
		int k = s.nextInt();
		while(i<str.length()){
			char ch = str.charAt(i);
			m1(ch);
			i++;
		}
        System.out.println(""+s1);
	}
    public static void m1 (char ch){
    	int i =0;
    	boolean b = false;
    	while(i<s1.length()){
    		char ch1=s1.charAt(i);
    		if(ch1==ch){
    			b=true; 
    			break;
    			}
    		i++;
    	}
    	if(b==false){
    		s1.append(ch);
}
}
    }
