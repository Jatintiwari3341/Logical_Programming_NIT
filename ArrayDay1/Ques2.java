//package com.logical_Programs;

import java.util.Scanner;

public class Ques2 {
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}
		System.out.println();
	}
	
	public static int[] createArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int [] arr=new int[size];
		
		System.out.println("Enter "+ size + ""
				+ " elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		return arr;
		
	}
	public static void main(String[] args) {
		int [] res=createArray();
		printArray(res);
		
	}

}
