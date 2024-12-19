//package com.logical_Programs;

public class Ques7 {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Even numbers are:");
		for(int ar:arr) {
			System.out.print(ar%2==0?ar:" ");
		}
		System.out.println("\nOdd numbers are:");
		for(int ar:arr) {
			System.out.print(!(ar%2==0)?ar:" ");
		}

	}

}
