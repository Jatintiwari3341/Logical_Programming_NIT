package SearchingDay3;

public class CopyArray {
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

	
	public static void CopyArr(int[] arr) {
		int[] arr2=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i];
		}
		for(int num:arr2) {
			System.out.print(num+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr= {2,4,5,6,7};
		printArray(arr);
		
		CopyArr(arr);

	}

}
