package lesson1;

public class NoOfDashes {

	public static void main(String[] args) {
		int arr[]={6,2,5,5,4,5,6,3,7,6};
		String s = "0123456789";
		for(int i =0;i<s.length();i++){
			char current=s.charAt(i);
			System.out.println(current+" "+arr[(int)current-48]);
		}
	}
}
