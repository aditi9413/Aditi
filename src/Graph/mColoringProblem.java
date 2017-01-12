package Graph;

import java.util.Scanner;

public class mColoringProblem {
  private static int V;
  private static int color[];
  
	public static void main(String[] args) {
		mColoringProblem g= new mColoringProblem();
		Scanner s = new Scanner(System.in);
		V=s.nextInt();
		int graph[][]= new int[V][V];
		for(int i =0;i<V;i++){
			for(int j =0;j<V;j++){
				graph[i][j]=s.nextInt();
			}
		}
		int m = s.nextInt();
		g.graphColoring(graph,m);
}
public static boolean graphColoring(int graph[][],int m){
	color= new int[V];
	for(int i =0;i<V;i++){
		color[i]=0;
	}
	if(!graphColoringUtil(graph,m,color,0)){
		System.out.println("No Solution");
		return false;}
	printSol(color);
	return true;
}
public static boolean graphColoringUtil(int graph[][], int m , int color[],int v){
	if(v==V){
		return true;
	}
	for(int c = 1 ;c<=m ; c++){
		if(isSafe(v,graph,color,c)){
			color[v]=c;
		if(graphColoringUtil(graph,m,color,v+1))
			return true;
		color[v]=0;
	}
		}
	return false;
}
public static boolean isSafe(int v,int graph[][],int color[], int c){
	for(int i =0;i<V;i++){
		if (graph[v][i]==1&&c==color[i]){
			return false;
		}
	}
	return true;
}
public static void printSol(int color[]){
	for(int i =0;i<V;i++){
		System.out.print(" "+color[i]);
	}
}
}
