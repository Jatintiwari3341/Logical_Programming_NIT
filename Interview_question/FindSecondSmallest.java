package Interview_question;

import java.util.Arrays;

public class FindSecondSmallest {
	
	public static int secondSmallest(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<arr[i+1]) {
				return arr[i+1];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr= {3,4,9,7,5};
		System.out.println(secondSmallest(arr));
	}

}
