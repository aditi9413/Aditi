package lesson1;

import java.util.Scanner;

public class lovelycoupleornot {
	public static int gcd(int a, int b)
	{
	    if (a == b)
	        return a;
	    if (a > b)
	        return gcd(a-b, b);
	    return gcd(a, b-a);
	}
	public static int lcm(int a, int b)
	{
	    return (a*b)/gcd(a, b);
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int flag=0;
		int count=0;
		int A= s.nextInt();
		int B = s.nextInt();
        int lcm= lcm(A,B);
        for(int i=1;i<=lcm;i++){
        	if(lcm%i==0){
        		for(int j=2;j<=i/2;j++){
        			if(i%j==0){
        				flag=1;
        			   break;
        			   }
        		}
        		if(flag==0){
        			count++;
        		}
        	}
        }
        if(count>2){
        	System.out.println("yes");}
        	else
        		System.out.println("no");	
	}

}
