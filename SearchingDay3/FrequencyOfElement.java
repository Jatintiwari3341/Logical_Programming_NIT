package SearchingDay3;

import java.util.Arrays;

public class FrequencyOfElement {
	
	public static void FrequencyElement(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int count=1,found=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j] && i>j) {
					count++;
				}
				if(arr[i]==arr[j]&& i<j) {
					found++;
					break;
				}
			}
			if(found==0) {
				System.out.println(arr[i]+":is present :"+count+"times");
			}
			
		}
		}
	
	public static void FrequencyElement2(int[] arr) {
		Arrays.sort(arr);
		int c=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				c++;
			}
			else {
				System.out.println(arr[i]+" is present at :"+c);
				c=1;
			}
			if(arr[i+1]==arr.length-1) {
				System.out.println(arr[i+1]+" is present at :"+c);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr= {1,3,2,3,4,5,4,2,2};
		FrequencyElement(arr);
		FrequencyElement2(arr);

	}

}
