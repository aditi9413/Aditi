package lesson1;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		DecimalToBinary db = new DecimalToBinary();
		db.DecToBin(num);
}
void DecToBin(int number){
	int binary[]= new int[25];
	int index=0;
	while(number>0)
	{
		binary[index++]=number%2;
		number=number/2;
		}
		for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
		}
	
}
}
