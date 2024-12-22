package Counting;

import java.util.Scanner;

public class CountDistinctElements {
	
	
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
	
	public static void countDistinct(int[] arr) {
		int uniqueEle=0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(arr[i]);
				uniqueEle++;
			}
		}
		System.out.println("The count of Distinct elements is :"+uniqueEle);
	}

	public static void main(String[] args) {
		int[] arr=createArray();
		printArray(arr);
		countDistinct(arr);
        		

	}

}
