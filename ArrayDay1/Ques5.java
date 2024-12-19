//package com.logical_Programs;

import java.util.Scanner;

public class Ques5 {
	
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
	
	public static void  midElement(int [] arr) {
		int arrLen=arr.length;
		int halfLen=arrLen/2;
		System.out.println(arrLen%2==0?arr[halfLen-1]+" "+arr[halfLen]:arr[halfLen]);
	}

	public static void main(String[] args) {
		midElement(createArray());
		

	}

}
