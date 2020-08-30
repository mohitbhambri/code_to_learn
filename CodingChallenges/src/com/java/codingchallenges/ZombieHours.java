package com.java.codingchallenges;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class ZombieHours {
	
	private static final int HASFILE = 1;
	private static final int[][] GRIDS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
	

	public int minHours(List<List<Integer>> grid) {
	    int server = 0;
	    Queue<Point> tFiles = new ArrayDeque<>();
	    for (int r = 0; r < grid.size(); r++) {
	        for (int c = 0; c < grid.get(0).size(); c++) {
	            if (grid.get(r).get(c) == HASFILE) {
	                tFiles.add(new Point(r, c));
	            } else {
	                server++;
	            }
	        }
	    }

	    if (server == 0) return 0;

	    for (int hours = 1; !tFiles.isEmpty(); hours++) {
	        for (int sz = tFiles.size(); sz > 0; sz--) {
	            Point has_file = tFiles.poll();

	            for (int[] dir : GRIDS) {
	                int r = has_file.r + dir[0];
	                int c = has_file.c + dir[1];

	                if (isEmpty(grid, r, c)) {
	                    server--;
	                    if (server == 0) return hours;
	                    grid.get(r).set(c, HASFILE);
	                    tFiles.add(new Point(r, c));
	                }
	            }
	        }
	    }
	    return -1;
	}

	private boolean isEmpty(List<List<Integer>> grid, int r, int c) {
	    return r >= 0 && r < grid.size() &&c >= 0 && c < grid.get(0).size() && grid.get(r).get(c) != HASFILE;
	}

	private static class Point {
	    int r, c;
	    Point(int r, int c) {
	        this.r = r;
	        this.c = c;
	    }
	}

}
