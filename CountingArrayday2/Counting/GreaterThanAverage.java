package Counting;

import java.util.Scanner;

public class GreaterThanAverage {
	
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
	
public static void greaterThanAverage(int[] arr) {
	int sum=0;
	for(int x:arr) {
		sum+=x;
		
	}
	System.out.println("The Sum is :"+sum);
	double avg=sum/arr.length;
	System.out.println("The Avg is :"+avg);
	int count =0;
	for(int x:arr) {
		
		if(x>avg) {
			count++;
		}
		

	}
	System.out.println("The total count of number is: "+count);
	
}

	public static void main(String[] args) {
		int[] arr=createArray();
		greaterThanAverage(arr);

	}

}
