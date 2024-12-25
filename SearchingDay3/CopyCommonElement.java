package SearchingDay3;

public class CopyCommonElement {
	
	public static void CopyCommnElement(int[] arr1,int[] arr2) {	
		int[] temp=new int[Math.min(arr1.length,arr2.length)];
	int count=0;
	
	for (int num1 : arr1) {
		for(int num2:arr2) {
			if(num1==num2) {
				temp[count++]=num1;
				break;
			}
		}
		
	}
	
	int[] res=new int[count];
	System.arraycopy(temp, 0, res, 0, count);
	System.out.println("Common elements");
	for(int num:res) {
		System.out.println(num+" ");
	}
	}

	public static void main(String[] args) {
		
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {3,4,5,6,7};
	    CopyCommnElement(arr1, arr2);
		

	}

}
