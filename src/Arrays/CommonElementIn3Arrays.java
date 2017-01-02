package Arrays;

import java.util.Scanner;

public class CommonElementIn3Arrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
        int a[]=new int [n1];
        int b[]=new int [n2];
        int c[]=new int [n3];
        for(int i =0;i<n1;i++){
        	a[i]=s.nextInt();
        }
        for(int i =0;i<n2;i++){
        	b[i]=s.nextInt();
        }
        for(int i =0;i<n3;i++){
        	c[i]=s.nextInt();
        }
        CommonElementIn3Arrays x = new CommonElementIn3Arrays();
        x.FindCommonElement(a,b,c,n1,n2,n3);
	}
  public static void FindCommonElement(int a[],int b[],int c[],int n1,int n2,int n3){
	  int i=0,j=0,k=0;
	  while(i<n1&&j<n2&&k<n3){
		  if(a[i]==a[j]&&b[j]==c[k]){
			  System.out.println(" "+a[i]);
			  i++;
			  j++;
			  k++;
		  }
		  else if(a[i]<b[j]){
			  i++;
		  }
		  else if(b[j]<c[k]){
			  j++;
		  }
		  else
			  k++;
	  }
  }
}
