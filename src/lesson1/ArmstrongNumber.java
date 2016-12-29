package lesson1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		 int temp ,rem;
		 int num=100;
		 int count=0;
	System.out.println("List of Armstrong Numbers between (100 - 999):");
	while(count!=999){
			temp =num;
			int sum=0;
			while(temp>0){
				rem = temp % 10;
	            temp = rem * rem * rem;
	            sum = temp + sum;
	            temp = temp / 10;
			}
			if ( num == sum){
				System.out.println("Armstrong Number" + sum);
	}
			count++;
			num++;
	}
}
}
