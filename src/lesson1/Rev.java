package lesson1;
import java.util.*;
public class Rev {

	public static void main(String[] args) {
		int rev=0;
		int temp;
	      Scanner s = new Scanner(System.in);
	      int a=s.nextInt();
	      int b= s.nextInt();
	      for(int i=a+1;i<b;i++){
	          temp=i;
	          while(temp!=0){
	              rev=(rev*10)+(temp%10);
	              temp=temp/10;
	          }
	          if(i==rev){
	              System.out.println("Reverse Number="+rev);
	          }
	          rev=0;
	      }

	}

}
