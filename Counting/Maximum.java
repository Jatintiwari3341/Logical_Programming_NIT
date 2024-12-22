package Counting;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum {
	
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
	
//	public static void MaxNo(int[] arr) {
//		int max=0;
//		for(int x:arr) {
//			if(x>max) {
//				max=x;
//			}
//			
//		}
//		System.out.println("The maximum number is :"+max);
//	//	System.out.println("The minimum number is :"+min);
//	}

	public static void findMaxAndMin(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Min Element is :"+ arr[0] +"\n Max Element is :"+arr[arr.length-1]);
	}
	

	public static void main(String[] args) {
		int[] arr=createArray();
		findMaxAndMin(arr);
	
	}

}
