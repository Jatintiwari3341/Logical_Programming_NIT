package Counting;

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
	
	public static void FoundElements(int[] arr,int key) {
		int element=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				element=i;
				break;
			}
		}
		if(element!=-1) {
			System.out.println("Element found at index is :"+element);
			
		}
		else {
			System.out.println("Element not found");
		}
	}

	public static void main(String[] args) {
		int[] arr=createArray();
		FoundElements(arr, 5);

	}

}
