package Counting;

import java.util.Arrays;

public class Median {
	
	public static double findMedian(int[] arr) {
		Arrays.sort(arr);
		int n=arr.length;
		
		if(n%2==0) {
			return (arr[n/2-1]+arr[n/2])/2.0;
		}else {
			return arr[n/2];
		}
	}

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6};
		int[] arr2= {1,2,3,4,5};
		
		System.out.println("Median of arr1:"+findMedian(arr1));
		System.out.println("Median of arr2:"+findMedian(arr2));
		

	}

}
