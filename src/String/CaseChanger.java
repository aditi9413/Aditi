package String;

public class CaseChanger {

	public static void main(String[] args) {
		String msg = "This is a String";
		StringBuilder result = new StringBuilder (msg);
		for(int i = 0;i< result.length();i++){
		char ch = msg.charAt(i);
		if (Character.isLowerCase(ch)) {
	        result.setCharAt(i, Character.toUpperCase(ch));
	    } else {
	        result.setCharAt(i, Character.toLowerCase(ch));}
}
	System.out.println(result);	
}
}