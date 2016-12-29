package String;

public class SearchLastString {

	public static void main(String[] args) {
		String str = " Hi My name Is ADITI";
		int lastindex = str.lastIndexOf("name");
		if(lastindex==-1){
			System.out.println("Not Found");
		}
		else 
		{
			System.out.println("Found at index=" + lastindex);
		}
	}

}
