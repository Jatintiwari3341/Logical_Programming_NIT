//package com.logical_Programs;

import java.util.Random;
import java.util.Scanner;
//port java.util.Random;

public class Ques3 {

	

		public static int[] createArray() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of the array:");
			int size=sc.nextInt();
			int [] arr=new int[size];
			Random r=new Random();
			
			for(int i=0;i<arr.length;i++) {
				arr[i]=r.nextInt(1,100);
			}
			sc.close();
			return arr;

	}
		public static void main(String[] args) {
			printArray(createArray());
		}
		public static void printArray(int[] arr) {
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]+" ");
			}
			System.out.println();
		}
	}


