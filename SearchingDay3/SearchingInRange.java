package SearchingDay3;

public class SearchingInRange {

	public static int binarySearchInRange(int[] arr,int key,int fromIndex,int toIndex) {
		int start=fromIndex;
		int end=toIndex;
		while(start<=end) {
			int mid=(start+end)/2;
			int midEle=arr[mid];
			if(key>midEle) {
				start=mid+1;
			}
			else if(key==midEle) {
				return mid;
			}
			else {
				end=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int ele=2;
		int index=binarySearchInRange(arr, ele, 3, 6);
		
		
		if(index!=-1) {
			System.out.println("Element found at index:"+index);
		}
		else {
			System.out.println("Element are not found");
		}

	}


}
