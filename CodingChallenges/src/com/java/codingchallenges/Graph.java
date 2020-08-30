package com.java.codingchallenges;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	
	private Queue<Node> queue;
	public static class Node{
		private int id;
		boolean visited;
		LinkedList<Node> neighbours;
		Node(int id){
			this.id=id;
			this.neighbours = new LinkedList<>();
		}
		public void addneighbours(Node neighbourNode) {
			this.neighbours.add(0,neighbourNode);
		}
		public List<Node> getNeighbours() {
			return neighbours;
		}
		public void setNeighbours(LinkedList<Node> neighbours) {
			this.neighbours = neighbours;
		}
	}

	
	public Graph()
	{
		queue = new LinkedList<Node>();
	}
	
	//DFS
	public void dfs(Node startNode) {
		Stack<Node> stack = new Stack<>();
		stack.push(startNode);
		startNode.visited=true;
		while(!stack.isEmpty()) {
			Node node = stack.pop();
			System.out.println(node.id+" ");
			for(Node child: node.neighbours) {
				if(child !=null && !child.visited) {
					stack.push(child);
					child.visited=true;
				}
			}
		}
	}
	
	//BFS
	public void bfs(Node startNode) {
		//add start node to queue
		queue.add(startNode);
		startNode.visited=true;
		while(!queue.isEmpty()) {
			//Pull the node from queue
			Node node = queue.poll();
			System.out.print(node.id + " ");
			
			//Add the unseen childs of node to queue
			for(Node child : node.neighbours) {
				if(child!=null && !child.visited) {
					queue.add(child);
					child.visited=true;
				}
			}
		}
	}
	public static void main(String[] args) {
		Node node40 =new Node(40);
		Node node10 =new Node(10);
		Node node20 =new Node(20);
		Node node30 =new Node(30);
		Node node60 =new Node(60);
		Node node50 =new Node(50);
		Node node70 =new Node(70);
 
		node40.addneighbours(node10);
		node40.addneighbours(node20);
		node10.addneighbours(node30);
		node20.addneighbours(node10);
		node20.addneighbours(node30);
		node20.addneighbours(node60);
		node20.addneighbours(node50);
		node30.addneighbours(node60);
		node60.addneighbours(node70);
		node50.addneighbours(node70);
		//System.out.println("The BFS traversal of the graph is ");
		Graph graph= new Graph();
		//graph.bfs(node40);
		System.out.println("\nThe DFS traversal of the graph is ");
		graph.dfs(node40);
		
	}
}
