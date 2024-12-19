//package com.logical_Programs;

public class Ques9 {

	public static void main(String[] args) {
int[] arr= {1,2,3,4,5};
		
		int arrSum=0;
		for(int ar:arr) {
			arrSum+=ar;
		}
		System.out.println("The sum of elements in Array is :"+arrSum);
		double arrAvg=arrSum/arr.length;
		System.out.println("The average of Array is: "+arrAvg);

	}

}
