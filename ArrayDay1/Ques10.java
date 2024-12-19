//package com.logical_Programs;

public class Ques10 {
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}
		System.out.println();
	}
	
	public static void reverseArray(int[] arr) {
		System.out.println("The Reverse element are:");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		printArray(arr);
		reverseArray(arr);
		
	}

}
