package SearchingDay3;

import java.util.Arrays;

public class MergedTwoSortedArray {
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] mergedSortedArray(int[] arr1,int[] arr2) {
		int newLength=arr1.length+arr2.length;
		
		int[] res=new int[newLength];
		int index=0;
		for(int a:arr1) {
			res[index]=a;
			index++;
		}
		for(int a:arr2) {
			res[index]=a;
			index++;
		}
		Arrays.sort(res);
		return res;
	}

	public static void main(String[] args) {
	int[] arr1= {1,2,3,4};
	int[] arr2= {5,6,7,8,9};
	int[] res=mergedSortedArray(arr1, arr2);
    printArray(res);

	}

}
