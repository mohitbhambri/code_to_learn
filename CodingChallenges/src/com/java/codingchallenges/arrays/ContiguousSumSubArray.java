package com.java.codingchallenges.arrays;

public class ContiguousSumSubArray {
//Find the contiguous subarray within an array (containing at least one number) which has the largest sum
	public static void main(String[] args) {
		
		int A[] = {-2,-1};
		//BruteForce Technique
		int highSum=Integer.MIN_VALUE;
		//System.out.println(highSum);
		int nextSum;
		for(int i=0;i<A.length;i++){
			nextSum=0;
			for(int j=i;j<A.length;j++){
			 nextSum+=A[j];
			 System.out.println("Next Sum is: "+ nextSum);
			 if(nextSum>highSum){
				 highSum=nextSum;
			 }
			}
		}
		System.out.println("HighSum is: "+highSum);
//			int n=A.length;
//	        int sum = A[0];
//	        int maxSum = sum;
//	        for(int i = 1; i<n; ++i)
//	        {
//	        	sum=Math.max(A[i], sum+A[i]);
//	        	if(sum>maxSum) maxSum=sum;
//	        }
//			int n=A.length;
//			int maxEnding = 0;
//			int max_so_far = Integer.MIN_VALUE;
//			for(int i = 0; i<n; ++i) {
//				maxEnding = maxEnding+A[i];
//				if(maxEnding<A[i]) {
//					maxEnding = A[i];
//				}
//				if(max_so_far<maxEnding) {
//					max_so_far=maxEnding;
//				}
//			}
//	        System.out.println("MaxSum is: "+max_so_far);
	}

}
