package Arrays;

import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i =0 ; i<n ; i++){
			a[i] = s.nextInt();
		}
        int cand= findcandidate(a,n);
        if(isMajority(a,n,cand)){
        System.out.println(" " + cand + " ");}
            else
         System.out.println("No Majority Element");
        }
     public static int findcandidate(int a[],int n){
    	 int maj_index=0;
    	 int count=1;
    	 int i;
    	 for(i=1;i<n;i++){
    		 if(a[maj_index]==a[i]){
    			 count++;
    		 }
    		 else count--;
    		 if(count==0){
    			 maj_index=i;
    			 count=1;
    		 }
    	 }
    	 return a[maj_index];
     }
     public static boolean isMajority(int a[], int n, int c){
    	 int count=0;
    	 int i ;
    	 for(i=0;i<n;i++){
    		 if(c==a[i]){
    			 count++;
    		 }
    		 }
    		 if(count>n/2){
    			 return true;
    		 }
    		 else
    			 return false;
    		 }
         }
