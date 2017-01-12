package Difficult;

import java.util.Scanner;

public class MinimumCost {
	static Scanner s = new Scanner (System.in);
	static int n = s.nextInt();
	static int maze [][]= new int [n][n];
	public static void main(String[] args) {
		for(int i=0;i<n;i++){
			 for(int j=0;j<n;j++){
				 maze[i][j]=s.nextInt();
			 }
		 }
		MinimumCost c = new MinimumCost();
		System.out.println("Minimum Cost="+c.CalculateCost(maze));
		}
public static int CalculateCost(int maze[][]){
	if(maze[0][0]==0)
	System.out.println("no solution");
		int c=calculate(maze,0,0);
		return c;
}
public static boolean isSafe(int maze[][], int x, int y)
{
    return (x >= 0 && x < n && y >= 0 &&
            y < n && maze[x][y] == 1);
}
public static int calculate(int maze[][],int x , int y){
	int cost=0;
	if(x==n-1&&y==n-1)
	return cost;
	if(isSafe(maze,x,y)==true){
		if(maze[x][y+1]==1){
			x++;
			calculate(maze,x,y);
		}
		else if(maze[x][y+1]==1){
			y++;
			cost++;
			calculate(maze,x,y);
		}
	}
	return cost;
}
}
