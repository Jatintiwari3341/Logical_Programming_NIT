package Interview_question;

public class KthSmallestUnsorted {
	
	public static int kthSmallestUnsorted(int[] arr,int k) {
		int min=arr[0],max=arr[0];
		for(int a:arr) {
			if(max<a) {
				max=a;
			}
			if(min>a) {
				min=a;
			}
		}
			int count=0;
			for(int i=min;i<max;i++) {
				for(int j=0;j<arr.length;j++) {
					if(i==arr[j]) {
						count++;
						break;
						
					}
				}
				if(count==k) {
					return i;
				}
			}
			return -1;
		}
	

	public static void main(String[] args) {
		int[] arr ={1,3,2,4,4,5,3,6,6};
		System.out.println(kthSmallestUnsorted(arr, 2));
		
	}

}
