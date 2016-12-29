package String;

public class PalindromeCheck {

	public static void main(String[] args) {
		String msg = "nmjihklo";
         String reverse ="";
         for(int i = msg.length()-1; i>=0; i--){
        	 reverse+=msg.charAt(i);
         }
		if(reverse.equalsIgnoreCase(msg)){
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
	}

}