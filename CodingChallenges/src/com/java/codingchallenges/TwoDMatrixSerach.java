package com.java.codingchallenges;

public class TwoDMatrixSerach {

	public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0){
            return false;
        }
        
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = row*col-1;
        while(left<=right){
            int midpoint = left+(right-left)/2;
            int mid_element = matrix[midpoint/col][midpoint%col];
            if(target == mid_element){
                return true;
            }
            else if(target<mid_element){
                right=midpoint-1;
            }else if(target>mid_element){
                left = midpoint+1;
            } 
        }
        return false;
    }
	
	public static void main(String[] args) {
		int[][] matrix = {{1,4},{6,8}};
		System.out.println(searchMatrix(matrix, 6));
	}

}
