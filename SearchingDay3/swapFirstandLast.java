package SearchingDay3;

public class swapFirstandLast {
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void firstAndlastSwap(int[] arr) {
		int temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		printArray(arr);
		firstAndlastSwap(arr);
		printArray(arr);
		

	}

}
