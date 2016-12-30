package DynamicProgramming;

import java.util.Scanner;

public class MaximumSumSequence {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
        int n =s.nextInt();
        int a[]= new int[n];
        for(int i =0;i<n;i++){
        	a[i]=s.nextInt();
        }
        System.out.println("Maximum Sum Sequence="+MaxSum(a,n));
	}
	public static int MaxSum(int a[],int n){
		int t[]= new int[n];
		int i,j;
		for(i=0;i<n;i++){
			t[i]=a[i];
		}
		for(i=1;i<n;i++){
		    for(j=1;j<i;j++){
		    	if(a[j]<a[i]){
		    		t[i]=Math.max(t[i], t[j]+a[i]);
		    	}
		    }
		}
		int max=t[0];
		for(i=0;i<n;i++){
			if(t[i]>max)
			max=t[i];
		}
		return max;
	}

}
