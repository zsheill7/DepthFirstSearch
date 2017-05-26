package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

import DepthFirstSearch.Vertex;

public class App {
	
	
	public static void main(String[] args) {
	
		Vertex vertex1 = new Vertex("1");
		Vertex vertex2 = new Vertex("2");
		Vertex vertex3 = new Vertex("3");
		Vertex vertex4 = new Vertex("4");
		Vertex vertex5 = new Vertex("5");
		
		List<Vertex> list = new ArrayList<>();
		
		vertex1.addNeighbor(vertex2);
		vertex1.addNeighbor(vertex4);
		vertex4.addNeighbor(vertex5);
		vertex2.addNeighbor(vertex3);
		
		list.add(vertex1);
		list.add(vertex2);
		list.add(vertex3);
		list.add(vertex4);
		list.add(vertex5);
		
		DFS dfs = new DFS();
		dfs.dfs(list);

		
	}
}
