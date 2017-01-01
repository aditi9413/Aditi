package Sorting;

import java.util.Scanner;

public class Sort0s1s2s {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int a[]=new int [n];
        for(int i =0;i<n;i++){
        	a[i]=s.nextInt();
        }
        Sort0s1s2s o=new Sort0s1s2s();
        o.Sort(a,n);
        for(int i =0;i<n;i++){
        	System.out.print(" "+a[i]);
        }
}
public static void Sort(int a[],int n){
	int l=0;
	int r=n-1;
	int mid=0;
	while(mid<=r){
		switch(a[mid]){
		case 0: int temp=a[l];
		         a[l]=a[mid];
		         a[mid]=temp;
		         l++;
		         mid++;
		         break;
		case 1:  mid++;
		         break;
		case 2:  temp = a[mid];
                 a[mid] = a[r];
                 a[r] = temp;
                 r--;
		          break;
		}
	}
}

}
