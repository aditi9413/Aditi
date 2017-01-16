package Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class CycleOfDirectedGraph {
   
	private static int V;
	private static LinkedList<Integer> adj[];
	CycleOfDirectedGraph(int v){
		V=v;
		adj=new LinkedList[V];
		for(int i =0;i<v;i++){
			adj[i]=new LinkedList();
		}
	}
	public static void addEdge(int v, int w){
		adj[v].add(w);
		adj[w].add(v);
	}
	public static boolean isCyclic(){
		boolean[] visited = new boolean[V];
		boolean[] recStack= new boolean[V];
		for(int i =0;i<V;i++){
			visited[i]=false;
			recStack[i]=false;
		}
		for(int u =0;u<V;u++)
				if(isCyclicUtil(u,visited,recStack))
					return true;
		
		return false;
	}
	public static boolean isCyclicUtil(int v , boolean visited[], boolean recStack[]){
		if(visited[v]==false){
		visited[v]=true;
		recStack[v]=true;
		Iterator<Integer> i = adj[v].iterator();
		while(i.hasNext()){
			int n  = i.next();
			if(!visited[n]&& isCyclicUtil(n,visited,recStack)){
				return true;
			}
			else if(recStack[n]){
				return true;
			}
		}
		}
		recStack[v]=false;
		return false;
	}
	public static void main(String[] args) {
		CycleOfDirectedGraph g = new CycleOfDirectedGraph(4);
		 g.addEdge(0, 1);
		    g.addEdge(0, 2);
		    g.addEdge(1, 2);
		    g.addEdge(2, 0);
		    g.addEdge(2, 3);
		    g.addEdge(3, 3);
	   
	 
        if (g.isCyclic()==false)
        { System.out.println("Graph contains cycle");}
        else
            System.out.println("Graph doesn't contains cycle");
	}

}
