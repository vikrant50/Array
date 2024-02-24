package Arrays.newton;

public class ifNegativeElementprintYes {

	public static void main(String[] args) {
		int arr[]= {1,-3,24,5,7};
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				temp++;
			}
		}
		if(temp==1)
		{
			System.out.println("yes ");
		}
		else
			System.out.println("no");
		
	}
}