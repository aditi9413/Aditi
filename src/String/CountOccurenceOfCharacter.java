package String;

public class CountOccurenceOfCharacter {

	public static void main(String[] args) {
		int count=0;
		String str = "This is a string";
		for(int i = 0; i< str.length(); i++){
			char ch = str.charAt(i);
			if(str.charAt(i)=='i'){
				count++;
			}
		}
 System.out.println("The number of occurence of i=" + count);

	}

}
