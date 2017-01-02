package Arrays;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int a[]=new int [n];
		for(int i =0;i<n;i++){
			a[i]=s.nextInt();}
		RemoveDuplicateElement x = new RemoveDuplicateElement();
		x.RemoveDuplicate(a,n);
}
	public static void RemoveDuplicate(int a[], int n){
		 LinkedHashSet<Integer> l = new LinkedHashSet<>();
	        for(int i=0;i<n;i++)
	            l.add(a[i]);
	        for(Integer y : l)
	            System.out.print(y);
	    }
	}
