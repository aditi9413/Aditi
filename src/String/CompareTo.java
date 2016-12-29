package String;

public class CompareTo {

	public static void main(String[] args) {
		 String str = "Hello World";
	      String Str1 = "hello world";
	Object s = str;
	System.out.println(str.compareTo(Str1));
	System.out.println(str.compareToIgnoreCase(Str1));
	System.out.println(str.compareTo(s.toString()));
		
	}

}
