package DynamicProgramming;

import java.util.Scanner;

public class EggDroppingProblem {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
        int egg = s.nextInt();
        int floor=s.nextInt();
        System.out.println("From Which floor="+EggFloor(egg,floor));
	}
  public static int EggFloor(int e, int f){
	  int i,j,k;
	  int c=0;
	  int ef[][]= new int[e+1][f+1];
	  for (i = 1; i <= e; i++)
      {
          ef[i][1] = 1;
          ef[i][0] = 0;
      }   
	  for(j=0;j<=f;j++){
		  ef[1][j]=j;
	  }
	  for(i=2;i<=e;i++){
		  for(j=2;j<=f;j++){
			  ef[i][j] = Integer.MAX_VALUE;
			  for(k=1;k<=j;k++){
					 c=1+Math.max(ef[i-1][k-1],ef[i][j-k]);
					 if (c<ef[i][j]){
						 ef[i][j] = c;
					 }
			  }
		  }
	  }
	  return ef[e][f];
  }
  }
