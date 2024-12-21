package Counting;

import java.util.Scanner;

public class CountDuplicateElements {
	private final  static Scanner sc=new Scanner(System.in);
	
	public static int[] createArray() {
		System.out.println("Enter size :");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		System.out.println("Enter "+size + "Elements are:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
			
		}
		return arr;
	}
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	public static void countDuplicate(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
				count++;	
				}
				}
			if(count==2) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr=createArray();
		//printArray(arr);
		countDuplicate(arr);
	}

}
