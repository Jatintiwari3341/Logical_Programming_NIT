package Counting;

import java.util.Scanner;

public class EvenOddPosition {
	
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
	
	public static void positionEvenOdd(int[] arr) {
		System.out.println("Elements are Even Index is :");
		for(int i=0;i<arr.length;i+=2) {
			System.out.println(arr[i]+" ");
		}
		System.out.println("Elements are Odd Index is :");
		for(int i=1;i<arr.length;i+=2) {
			System.out.println(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr=createArray();
		positionEvenOdd(arr);

	}

}
