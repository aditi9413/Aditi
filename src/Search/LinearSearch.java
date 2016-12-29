package Search;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]={1,5,7,8,9,3,2};
		System.out.println("Key To Search");
		Scanner s = new Scanner(System.in);
		int searchkey = s.nextInt();
		System.out.println("Key=" + searchkey +"Found at" + linearsearch(a,searchkey));
}
static int linearsearch(int a[],int key){
	int n=a.length;
	for(int i=0 ;i<n;i++){
		if(key==a[i])
			return i;
	}
return -1;
}
}
