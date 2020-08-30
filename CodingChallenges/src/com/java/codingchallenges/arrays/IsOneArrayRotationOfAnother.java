package com.java.codingchallenges.arrays;

public class IsOneArrayRotationOfAnother {

	public static void main(String[] args) {
		int A[] = {1, 2, 3, 4, 5, 6, 7};
		int B[] = {4, 5, 6, 7, 1, 2, 3};
		System.out.println("One array is rotation of another:"+isRotation(A, B));

	}
	
	public static boolean isRotation(int[] A, int[] B) {
		if(A.length!=B.length) return false;
		int key =A[0];
		int keyIndex = -1;
		
		for(int i=0;i<B.length;i++) {
			if(key == B[i]) {
				keyIndex=i;
				break;
			} 
		}
		if(keyIndex == -1) return false;
		for(int i=0;i<A.length;i++) {
			int j=(keyIndex+i)%A.length;
			if(A[i]!=B[j]) return false;
		}
		return true;
	}
}
