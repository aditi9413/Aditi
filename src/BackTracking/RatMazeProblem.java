package BackTracking;

import java.util.Scanner;

public class RatMazeProblem {
	static Scanner s = new Scanner (System.in);
	static int n = s.nextInt();
	static int maze [][]= new int [n][n];
	 
	public static void main(String[] args){
		for(int i=0;i<n;i++){
			 for(int j=0;j<n;j++){
				 maze[i][j]=s.nextInt();
			 }
		 }
		RatMazeProblem rat = new RatMazeProblem();
		rat.solveMaze(maze);
			
	}
 public static boolean solveMaze(int maze[][]){
	 int sol [][]= new int[n][n];
	 for(int i=0;i<n;i++){
		 for(int j=0;j<n;j++){
			 sol[i][j]=0;
			 System.out.println();
		 }
	 }
	 if(solveMazeCheck(maze,0,0,sol)==false){
		 System.out.println("No");
		 return false;
	 }
	 printsol(sol);
	 return true;
 }
public static void printsol(int sol[][])
 {
     for (int i = 0; i < n; i++)
     {
         for (int j = 0; j < n; j++)
             System.out.print(" " + sol[i][j] +
                              " ");
         System.out.println();
     }
 }
public static boolean isSafe(int maze[][], int x, int y)
 {
     return (x >= 0 && x < n && y >= 0 &&
             y < n && maze[x][y] == 1);
 }
 public static boolean solveMazeCheck(int maze[][],int x, int y, int sol[][]){
	 if(x==n-1&&y==n-1){
		 sol[x][y]=1;
		 return true;
	 }
	 if(isSafe(maze,x,y)==true){
		 sol[x][y]=1;
		 if(solveMazeCheck(maze,x+1,y,sol)==true)
			 return true;
		 if(solveMazeCheck(maze,x,y+1,sol)==true)
			 return true;
		 sol[x][y] = 0;
         return false;
	 }
	 return false;
 }
}
