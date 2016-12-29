package String;

public class RemoveChar {

	public static void main(String[] args) {
	    String str = "This is a JAVA";
	    System.out.println(removeCharAt(str,8));
	    	}
  static String  removeCharAt( String s, int p){
	  return s.substring(0, p) + s.substring(p+1);
  }
}
