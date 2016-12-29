package lesson1;

public class Armstrong {

	public static void main(String[] args) {
				 int temp2,temp1 ,rem,n=0,result=0;
			System.out.println("List of Armstrong Numbers between (100 - 999):");
			for(int i = 100; i < 999; ++i)
		    {
		        temp2 = i;
		        temp1 = i;
		        while (temp1 != 0)
		        {
		            temp1 /= 10;
		            ++n;
		        }
		        while (temp2 != 0)
		        {
		            rem = temp2 % 10;
		            result += (int)Math.pow(rem, n);
		            temp2 /= 10;
		        }
		        if (result == i) {
		            System.out.println(i);
		        }
		        n = 0;
		        result = 0;
			}
		}
		
	}

