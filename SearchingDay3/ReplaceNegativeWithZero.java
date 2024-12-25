package SearchingDay3;

public class ReplaceNegativeWithZero {
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void repalceNegativeNoZero(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				arr[i]=0;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,-3,2,-4,-3,5,-4,-6,5};
		repalceNegativeNoZero(arr);
		printArray(arr);

	}

}
