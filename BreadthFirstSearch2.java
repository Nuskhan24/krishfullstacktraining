package fibonacci_sequence;
import java.util.*;
public class BreadthFirstSearch2 {
	
	private LinkedList<Integer>adj[];
	
	public BreadthFirstSearch2(int v) {
		adj=new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList<Integer>();
		}
	}
	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	public int bfs(int source, int destination) {
		boolean vis[]=new boolean[adj.length];
		int parent[]= new int[adj.length];
		Queue<Integer> q=new LinkedList<>();
		
		q.add(source);
		parent[source]=-1;
		vis[source]=true;
		
		while(!q.isEmpty()) {
			int cur=q.poll();
			if(cur==destination) break;
			
			for(int neighbor:adj[cur]) {
				if(!vis[neighbor]) {
					vis[neighbor]=true;
					q.add(neighbor);
					parent[neighbor]=cur;
				}
			}
		}
		int cur=destination;
		int distance=0;
		while(parent[cur]!=-1) {
			System.out.println(cur+ " -> ");
			cur=parent[cur];
			distance++;
		}
		return distance;
		
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of vertices and edges: ");
		int v=sc.nextInt();
		int e=sc.nextInt();
		
		BreadthFirstSearch2 breadthfirstsearch2 = new BreadthFirstSearch2(v);
		System.out.print("Enter "+e+" edges");
		for(int i=0;i<e;i++) {
			int source=sc.nextInt();
			int destination =sc.nextInt();
			breadthfirstsearch2.addEdge(source,destination);
		}
		System.out.print("Enter source destination:");
		int source=sc.nextInt();
		int destination =sc.nextInt();
		
		int distance =breadthfirstsearch2.bfs(source, destination);
		System.out.println("min distance is " +distance);
		sc.close();
		
		
	}

}
