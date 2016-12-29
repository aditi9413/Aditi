package String;

import java.util.Scanner;

public class CaseChangerExceptFirst {

	public static void main(String[] args) {
		String msg = "ThIs is a strIng";
		StringBuilder result = new StringBuilder (msg);
		for(int i = 1;i< result.length();i++){
		char ch = msg.charAt(i);
		if(msg.charAt(i)==' '){
			i=i+1;
		}
		else if (Character.isLowerCase(ch)) {
	        result.setCharAt(i, Character.toUpperCase(ch));
	    } else {
	        result.setCharAt(i, Character.toLowerCase(ch));}
}
	System.out.println(result);	
}
}