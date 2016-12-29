package String;

public class CountNumberOfWord {

	public static void main(String[] args) {
		int count=1;
		String str = "This is a string";
		for(int i = 0; i< str.length(); i++){
			char ch = str.charAt(i);
			if(str.charAt(i)==' ' && (str.charAt(i+1) != ' ')){
				count++;
			}
		}
 System.out.println("The number of words=" + count);
	}

}
