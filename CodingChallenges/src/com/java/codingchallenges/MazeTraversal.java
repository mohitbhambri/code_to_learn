package com.java.codingchallenges;

import java.util.LinkedList;
import java.util.Queue;

public class MazeTraversal {
	
    public static boolean hasPath(int[][] maze, int[] start, int[] destination) {
    	//Nodes visited
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        //Directions
        int[][] dirs={{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
        //Queue to add all childs
        Queue < int[] > queue = new LinkedList < > ();
        
        queue.add(start);
        visited[start[0]][start[1]] = true;
        while (!queue.isEmpty()) {
            int[] s = queue.remove();
            if (s[0] == destination[0] && s[1] == destination[1])
                return true;
            for (int[] dir: dirs) {
                int x = s[0] + dir[0];
                int y = s[1] + dir[1];
                while (x >= 0 && y >= 0 && x < maze.length && y < maze[0].length && maze[x][y] == 0) {
                    x += dir[0];
                    y += dir[1];
                }
                if (!visited[x - dir[0]][y - dir[1]]) {
                    queue.add(new int[] {x - dir[0], y - dir[1]});
                    visited[x - dir[0]][y - dir[1]] = true;
                }
            }
        }
        return false;
    }

	public static void main(String[] args) {
		int maze[][] = new int[][] { 
			{ 0, 1, 1, 0, 0, 0, 0 },
			{ 0, 0, 1, 1, 1, 0, 0 },
			{ 0, 0, 0, 0, 0, 1, 1 },
			{ 0, 0, 0, 0, 0, 0, 0 }, 
			{ 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0 }, 
			{ 0, 0, 0, 0, 0, 0, 0 }, 
			};
			int[] source = {0,0};
			int[] destination = {3,6};
			System.out.println(hasPath(maze,source,destination));
	}

}
