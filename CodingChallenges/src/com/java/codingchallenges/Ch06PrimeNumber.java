package com.java.codingchallenges;

import java.util.stream.IntStream;

public class Ch06PrimeNumber {
	private static long startTime = System.currentTimeMillis();
	public static void main(String[] args) {
		int number = 2;
//		if(isPrime(number) == 1) {
//			System.out.println(number+ " is prime number!");
//		}else {
//			System.out.println(number+ " is not a prime number!");
//		}
		System.out.println(isPrimeFastest(number));
		//System.out.println(isPrimeJava8(number));
		long endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds");

	}
	
	public static int isPrime(int number) {
		int flag = 1;
		if (number == 1) {
			return 0;
		}
		double sqrt = Math.sqrt(number);
		for(int i = 2;i<=sqrt;i++) {
			if(number%i==0) {
				flag =0;
				break;
			}
			
		}
		return flag;
	}
	
	public static boolean isPrimeFastest(int num){
	    if (( num > 2 && num%2 == 0) || num==1 ) {
	        
	        return false;
	    }
	    int top = (int)Math.sqrt(num);
	    for(int i = 3; i <=top; i+=2){
	        if(num % i == 0){
	            return false;
	        }
	    }
	    return true; 
	}
//	public static boolean isPrimeJava8(int number) {
//		    if(number <= 2)
//		        return number == 2;
//		    else
//		        return  (number % 2) != 0
//		                &&
//		                IntStream.rangeClosed(3, (int) Math.sqrt(number))
//		                .filter(n -> n % 2 != 0)
//		                .noneMatch(n -> (number % n == 0));
//	}
}
