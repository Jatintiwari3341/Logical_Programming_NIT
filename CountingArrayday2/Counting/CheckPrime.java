//package Counting;

import java.util.Scanner;

public class CheckPrime {
	

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
	
	public static void  checkPrimeNO(int[] arr) {
		int count=0;
		for(int x:arr) {
			if(isPrime(x)) {
				count++;

			}
						}
	
	
	System.out.println("The Number of prime is :"+count);
	}
	public static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr=createArray();
checkPrimeNO(arr);


	}

}
