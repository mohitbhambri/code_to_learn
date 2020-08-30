package com.java.codingchallenges;

public class MySingeltonClass {

	private static MySingeltonClass instance = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private MySingeltonClass() {

	}
	
	public static MySingeltonClass getInstance() {
		if(instance == null) {
			return new MySingeltonClass();
		}
		else {
			return instance;
		}
	}
}	
