package SearchingDay3;

public class ReplaceWithSum {
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] replaceWithSum(int[] arr) {
		int[] res=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				res[i]=arr[i+1];
			}else if(i==arr.length-1) {
				res[i]=arr[i-1];
			}
			else {
				res[i]=arr[i-1]+arr[i+1];
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] res=replaceWithSum(arr);
		printArray(res);

	}

}
