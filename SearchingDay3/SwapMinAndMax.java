package SearchingDay3;

public class SwapMinAndMax {
	
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void SwapMinAndMax(int[] arr) {
		int maxIndex=0,minIndex=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[maxIndex]) {
				maxIndex=i;
			}
			if(arr[i]<arr[minIndex]) {
				minIndex=i;
			}
		}
		
		int temp =arr[maxIndex];
		arr[maxIndex]=arr[minIndex];
		arr[minIndex]=temp;
		
		System.out.println("After swapping max and min elements:");
		for(int num:arr) {
			System.out.println(num+" ");
		}
		
		
		

	}
	public static void main(String[] args) {
		int[] arr= {3,1,4,5,2};
		printArray(arr);
		SwapMinAndMax(arr);
		printArray(arr);
	}

}
