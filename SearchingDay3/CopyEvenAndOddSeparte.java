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
		}
		
		//If the number is even, it is stored in the even array at the evenIndex, which is then incremented.
		//If the number is odd, it is stored in the odd array at the oddIndex, which is then incremented.
			System.out.print("Odd numbers:");
			for(int num1:odd) {
				System.out.print(num1+" ");
			}
			System.out.print("\nEven numbers");
			for(int num1:even) {
				System.out.print(num1+" ");
			}
		}
	

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		CopyEvenOdd(arr);

	}

}
