package com.dsa.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {

	private int V;
	
	private LinkedList<Integer> adj[];
	
	public Graph(int v){
		V=v;
		adj = new LinkedList[V];
		for(int i=0;i<V;i++)
			adj[i] = new LinkedList<>();
	}
	
	public void addEdge(int v,int w){
		adj[v].add(w);
	}
	public void topologicalSortutil(int v,Boolean visited[], Stack stack){
		visited[v]=true;
		Integer i;
		Iterator<Integer> it= adj[v].iterator();
		while(it.hasNext()){
			i= it.next();
			if(!visited[i]){
				topologicalSortutil(i, visited, stack);
			}
		}
		stack.push(new Integer(v));
	}
	
	public void topologicalSort(){
		
		Stack stack = new Stack();
		Boolean visited[] = new Boolean[V];
		for(int i=0;i<V;i++){
			visited[i]=false;
		}
		for(int i=0;i<V;i++){
			if(visited[i]==false){
				topologicalSortutil(i,visited,stack);
			}
		}
		while(stack.empty()==false){
			System.out.println(stack.pop()+" ");
		}
		
	}
	
	public static void main(String[] args) {
		Graph g = new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
 
        System.out.println("Following is a Topological " +
                           "sort of the given graph");
        g.topologicalSort();
	}
}
