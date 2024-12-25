package SearchingDay3;

public class MergedArrayAlternately {
	
	public static void mergedTwoArrayAlternate(int[] arr1,int[] arr2) {
		int[] mergeArray=new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		
		while(i<arr1.length && j<arr2.length) {
			mergeArray[k++]=arr1[i++];
			mergeArray[k++]=arr2[j++];
		}
		while(i<arr1.length) {
			mergeArray[k++]=arr1[i++];
		}
		
		while(j<arr2.length) {
			mergeArray[k++]=arr2[j++];
		}
		System.out.println("Merged Array alternately:");
		for(int num:mergeArray) {
			System.out.print(num+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr1= {1,2,3};
		int[] arr2= {4,5,6};
		mergedTwoArrayAlternate(arr1, arr2);

	}

}
