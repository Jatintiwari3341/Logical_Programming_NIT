package Counting;

import java.util.Scanner;

public class CountOddAndEvemt {
	
	private final static Scanner sc = new Scanner(System.in);
	
	
	public static int[] createArray() {
		System.out.println("Enter size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter " + size + " elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;

	}
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void countEvenOdd(int[] arr) {
		int evCount=0;
		int odCount=0;
		for(int x:arr) {
			if(x%2==0) {
				evCount++;
			}
			else {
			odCount++;
			}
		}
		System.out.println("Even number Count is :"+evCount);
		System.out.println("Odd number Count is  :"+odCount);
	}

	public static void main(String[] args) {
		int[] arr=createArray();
countEvenOdd(arr);

	}

}
