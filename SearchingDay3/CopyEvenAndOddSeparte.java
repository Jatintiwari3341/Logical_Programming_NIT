package SearchingDay3;

public class CopyEvenAndOddSeparte {
	
	public static void CopyEvenOdd(int[] arr) {
		int evenCount=0,oddCount=0;
		for(int num:arr) {
			if(num%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		int[] odd=new int[oddCount];
		int[] even=new int[evenCount];
		int oddIndex=0,evenIndex=0;
		
		for(int num:arr) {
			if(num%2==0) {
				even[evenIndex++]=num;
			}
			else {
				odd[oddIndex++]=num;
			}
			System.out.print("Odd numbers:");
			for(int num:odd) {
				System.out.print(num+" ");
			}
			System.out.print("\nEven numbers");
			for(int num:even) {
				System.out.print(num+" ");
			}
		}
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		CopyEvenOdd(arr);

	}

}
