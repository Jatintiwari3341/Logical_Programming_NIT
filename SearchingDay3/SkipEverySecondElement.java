package SearchingDay3;

public class SkipEverySecondElement {
	
	public static void skipSecondElement(int[] arr) {
		int size=(arr.length+1)/2;
		
		int[] newArray=new int[size];
		
		for(int i=0, j=0;i<arr.length;i+=2,j++) {
			newArray[j]=arr[i];
		}
		System.out.println("elements after skipping second element:");
		for(int num:newArray) {
			System.out.println(num+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		skipSecondElement(arr);

	}

}
