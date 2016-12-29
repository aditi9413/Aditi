package Search;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		int a[]={1,5,7,8,9,3,2};
		System.out.println("Key To Search");
		Scanner s = new Scanner(System.in);
		int searchkey = s.nextInt();
		System.out.println("Key=" + searchkey +"Found at" + binarysearch(a,searchkey));
}
static int binarysearch(int a[],int key){
	int start=0;
	int end=a.length-1;
	while(start<=end){
		int mid=(start+end)/2;
		if(key == a[mid]){
			return mid;}
		if(key<a[mid]){
			end=mid-1;}
		else{
			start=mid+1;}
		}
	return -1;
       
		}
}

