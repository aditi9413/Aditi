package lesson1;

public class SumOfPrime {

	public static void main(String[] args) {
		int number=2;
		int sum=0;
		int count=0;
		while(count<1000){
			if(IsPrime(number)){
				sum+=number;
				count++;
			}
			number++;
		}
		System.out.println(sum);
	}
static boolean IsPrime(int n){
	int sqrt=(int) Math.sqrt(n)+1;
	for (int i= 2; i < sqrt ; i++)
	{ 
	if(n%i==0){
		return false;
	}
}
	return true;
}
}
