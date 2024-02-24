package Arrays;

public class REVERSE_ARRAY_USING_RECURSION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,3,4,56};
		 reverseArray(arr, 0, arr.length-1);
		 
		 System.out.println("Rversed array");
		 for(int num:arr)
		 {
			 System.out.print(num+ " ");
		 }
	    }
		public static void reverseArray(int arr[],int start,int end)
		{
			if(start>=end)
			{
				return;
		    }
			//swap the element at start and end indexes
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			reverseArray(arr, start+1, end-1);
			
			
		}

		
			
		
	}
