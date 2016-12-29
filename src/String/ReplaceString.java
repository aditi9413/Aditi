package String;

public class ReplaceString {

	public static void main(String[] args) {
		String str = "This is a JAVA and JAVA";
		System.out.println((str.replace("JAVA", "C")));
        System.out.println(str.replaceFirst("JAVA", "C++"));
        System.out.println(str.replace("a","the"));
        System.out.println(str.replaceFirst("a", "the"));
	}

}
