package SearchingDay3;

public class CopyElementInRange {
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	
	public static int[] CopyInRange(int[] original,int from,int to) {
		int newLength=to-from;
		if(newLength<0) {
			throw new IllegalArgumentException("From="+from+">"+"To="+to);
		}
		int[] copy=new int[newLength];
		int index=0;
		for(int i=from;i<to;i++) {
			copy[index]=original[i];
			index++;
			}
		return copy;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] res=CopyInRange(arr, 2, 4);
		printArray(res);

	}

}
