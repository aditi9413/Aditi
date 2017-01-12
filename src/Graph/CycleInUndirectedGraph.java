package Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class CycleInUndirectedGraph {
	private static int V;
	private static LinkedList<Integer> adj[];
	CycleInUndirectedGraph(int v){
		V=v;
		adj=new LinkedList[V];
		for(int i =0;i<v;i++){
			adj[i]=new LinkedList();
		}
	}
	public static void addEdge(int v, int w){
		adj[v].add(w);
	}
	public static boolean isCyclicUtil(int v , boolean visited[], int parent){
		visited[v]=true;
		Iterator<Integer> i = adj[v].iterator();
		while(i.hasNext()){
			int n = i.next();
			if(!visited[n])
				if(isCyclicUtil(n,visited,v))
				return true;
				else if(n!=parent)
					return true;
		}
		return false;
	}
	public static boolean isCyclic(){
		boolean[] visited = new boolean[V];
		for(int i =0;i<V;i++){
			visited[i]=true;
		}
		for(int u =0;u<V;u++)
			if(!visited[u])
				if(isCyclicUtil(u,visited,-1))
					return true;
		
		return false;
	}
	public static void main(String[] args) {
		 CycleInUndirectedGraph g1 = new CycleInUndirectedGraph(5);
	        g1.addEdge(1, 0);
	        g1.addEdge(0, 2);
	        g1.addEdge(2, 0);
	        g1.addEdge(0, 3);
	        g1.addEdge(3, 4);
	        if (g1.isCyclic())
	            System.out.println("Graph contains cycle");
	        else
	            System.out.println("Graph doesn't contains cycle");
	 
	        CycleInUndirectedGraph g2 = new CycleInUndirectedGraph(3);
	        g2.addEdge(0, 1);
	        g2.addEdge(1, 2);
	        if (g2.isCyclic())
	            System.out.println("Graph contains cycle");
	        else
	            System.out.println("Graph doesn't contains cycle");
	}

}
