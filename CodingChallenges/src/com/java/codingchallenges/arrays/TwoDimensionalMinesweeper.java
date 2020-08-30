package com.java.codingchallenges.arrays;

import java.util.Arrays;

public class TwoDimensionalMinesweeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] bombs = {
						{0, 0},
						{0, 1},
						}; 
		minesweeper(bombs, 3,4);
	}
	
	public static void minesweeper(int [][] bombs, int rows, int cols) {
		int[][] outputArray = new int[rows][cols];
		System.out.println(Arrays.deepToString(outputArray));
		
		for(int [] bomb : bombs) {
			int row_i = bomb[0], col_i = bomb[1];
			outputArray[row_i][col_i] = -1;
			
			for (int i =row_i-1;i<=row_i+1;i++) {
				for(int j=col_i-1;j<=col_i+1;j++) {
					if((i>=0 && i<rows) && (j>=0 && j<cols) && outputArray[i][j] != -1) {
						outputArray[i][j] +=1;
					}
				}
			}
		}
		
		System.out.println("Output Array:"+ Arrays.deepToString(outputArray));
		int col = bombs[0].length;
		System.out.println("Col:"+ col);
		System.out.println("Arr length: "+bombs.length);
		int start =0;
		int end = bombs.length*col-1;
		while(start<=end) {
			System.out.println("Index value at arr["+start/col+"]["+start%col+"]"+bombs[start/col][start%col]);
			start = start+1;
		}
		
	}
}
