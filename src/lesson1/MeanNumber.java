package lesson1;

import java.util.Scanner;

public class MeanNumber {

	public static void main(String[] args) {
		int num;
		int sum=0;
		int count=0;
		Scanner s = new Scanner ( System.in);
		while(s.hasNextInt()){
			num = s.nextInt();
			sum+=num;
			count++;
		}
		int mean= sum / count;
		System.out.println("Mean=" + mean);
        
	}

}
