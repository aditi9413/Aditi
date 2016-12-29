package String;

public class SearchingSubString {

	public static void main(String[] args) {
		String str = " i am in delhi";
		int intIndex = str.indexOf("elh");
		if(intIndex == -1){
			System.out.println("No");
		}
		else 
			System.out.println("Yes");
	}

}
