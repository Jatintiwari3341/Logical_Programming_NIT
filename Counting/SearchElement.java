package Counting;

import java.awt.PrintGraphics;
import java.util.Scanner;

public class SearchElement {
	
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
	
//	public static void FoundElements(int[] arr,int key) {
//		int element=-1;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==key) {
//				element=i;
//				break;
//			}
//		}
//		if(element!=-1) {
//			System.out.println("Element found at index is :"+element);
//			
//		}
//		else {
//			System.out.println("Element not found");
//		}
//	}
	
	public static int getIndex(int[] arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void printIndex(int[] arr,int key) {
		 boolean found=false;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==key) {
				 found=true;
				 System.out.println(key+"found at index"+i);
			 }
		 }
		 if(!found) {
			 System.out.println("Element not found");
		 }
	}

	public static void main(String[] args) {
		int[] arr=createArray();
		int ele=4;
		
		printIndex(arr, ele);
		int index=getIndex(arr, ele);
		if(index !=-1) {
			System.out.println("Element found at index "+index);
			
		}else {
			System.out.println("Not found");
		}
		//FoundElements(arr, 5);

	}

}
