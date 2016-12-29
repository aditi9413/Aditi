package lesson1;
import java.io.*;
public class ReverseArray {

	public static void main(String[] args) {
	int a[ ]={1 , 2 ,3 ,4 ,5, 6};
	printArray(a, 6);
	reverseArray(a,0,5);
	System.out.println("Reversed Array Is=");
	printArray(a,6);
	}
	
	static void printArray( int a[],int size){
		for(int i=0;i<size;i++){
			System.out.println(a[i] + " ");
		}
	}
  static  void reverseArray(int a[], int start, int end){
	   int temp;
	   if (start >= end)
           return;
       temp = a[start];
       a[start] = a[end];
       a[end] = temp;
       reverseArray(a, start+1, end-1);
   }
}
