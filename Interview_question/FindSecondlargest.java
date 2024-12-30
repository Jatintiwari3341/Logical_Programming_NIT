package Interview_question;

import java.util.Arrays;

public class FindSecondlargest {
	
	public static int secondLargest(int[] arr) {
		Arrays.sort(arr);
		for(int i=arr.length-1;i>0;i--) {
			if(arr[i]>arr[i-1]) {
				return arr[i-1];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
	int[] arr= {2,3,5,9,7};
	System.out.println(secondLargest(arr));

	}

}
