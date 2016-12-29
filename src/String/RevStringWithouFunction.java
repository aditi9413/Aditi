package String;

public class RevStringWithouFunction {

	public static void main(String[] args) {
		String str = " This is INDIA";
		String reverse = "";
		for(int i = str.length() - 1 ; i>= 0 ; i--){
			reverse+= str.charAt(i);
		}
      System.out.println("Reverse String=" + reverse);
	}

}
