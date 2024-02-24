package Arrays;
//
public class GIVEN_ARRAY_FIND_MISIING_NO {

	public static void main(String[] args) {

		int arr[]= {1,2,3,5};
		int n= arr.length+1;
		
		int exSum = (n*(n+1)/2);
		
		int act=0;
		
		for(int i=0;i<arr.length;i++)
		{
			act=act+arr[i];
		}
		int miss=exSum-act;
		System.out.println(miss);
		
	}

}
