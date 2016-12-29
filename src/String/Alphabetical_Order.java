package String;
import java.util.Scanner;
public class Alphabetical_Order {
	public static void main(String[] args) 
    {
		        String temp;
		        Scanner s = new Scanner(System.in);
		       System.out.println("Enter number of names you want to enter:");
		        int n = s.nextInt();
		        String names[] = new String[n];
		        Scanner s1 = new Scanner(System.in);
		        for (int p =0; p< n; p++)
		        { names[p] = s1.nextLine();
		        }
		        for (int i = 0; i < n; i++) 
		        {
		            for (int j = i + 1; j < n; j++) 
		            {
		                if (names[i].compareTo(names[j])>0) 
		                {
		                    temp = names[i];
		                    names[i] = names[j];
		                    names[j] = temp;
		                }
		            }
		        }
		        System.out.print("Names in Sorted Order:");
		        for (int k = 0; k< n - 1; k++) 
		        {
		            System.out.print(names[k] + ",");
		        }
		        System.out.print(names[n - 1]);
		    }
		}


