package Interview_question;

import java.util.Arrays;

public class FindKthLargest {
	
	public static int kthLargest(int[] arr,int k) {
		Arrays.sort(arr);
		int count=1;
		if(k==1) {
			return arr[arr.length-1];
		}
		for(int i=arr.length-1;i>0;i--) {
			if(arr[i]!=arr[i-1]) {
				count++;
			}
			if(count==k) {
				return arr[i-1];
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int[] arr= {1,3,2,4,4,5,3,6,6};
		System.out.println(kthLargest(arr, 4));
	}

}
