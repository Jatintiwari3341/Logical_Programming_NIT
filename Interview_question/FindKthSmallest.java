package Interview_question;

import java.util.Arrays;

public class FindKthSmallest {
	
	public static int kthSmallest(int[] arr,int k) {
		Arrays.sort(arr);
		int count=1;
		if(k==1) {
			return arr[0];
		}
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				count++;
			}
			if(count==k) {
			return arr[i+1];
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int[] arr=  {1,3,2,4,4,5,3,6,6};
		System.out.println(kthSmallest(arr, 2));

	}

}
