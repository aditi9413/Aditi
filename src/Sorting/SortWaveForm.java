package Sorting;

import java.util.Scanner;

public class SortWaveForm {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int a[]=new int [n];
        for(int i =0;i<n;i++){
        	a[i]=s.nextInt();
        }
        SortWaveForm o=new SortWaveForm();
        o.SortWave(a,n);
        for(int i =0;i<n;i++){
        	System.out.print(" "+a[i]);
        }
}
    public static void SortWave(int a[], int n){
	  for(int i=0;i<n;i+=2){
		  if(i>0&&a[i-1]>a[i]){
			  int temp=a[i-1];
			  a[i-1]=a[i];
			  a[i]=temp;
		  }
		  else if(i<n-10&&a[i]<a[i+1]){
			  int temp=a[i];
			  a[i]=a[i+1];
			  a[i+1]=temp;
		  }
	  }
}
}
