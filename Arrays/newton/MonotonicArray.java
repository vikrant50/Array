package Arrays.newton;

public class MonotonicArray {

	public static void main(String[] args)
	{
		
		//input arr1[]={1,2,2,3}/this is monotonic because same order
		//input arr2[]={6,5,4,4,3}//this is monotonic because same order
		//input arr3[]={1,3,2}//not monotonic
		
		boolean increase=false;
		boolean decrease=false;
		
		int arr[]={1,2,2,3,3,3,2};
		//int count=0;
		
		for(int i=1;i<arr.length;i++)//2<1--2>2--3<2--3<3-- 2<3++
		{
			if(arr[i]<arr[i-1])//here we checking assending //i
			increase=true;
		
			
			if(arr[i]>arr[i-1])//here we are checking decreasing// if both condition satisfy that meand true then it is not assending either descending then return else monotonic
			{
				decrease=true;
		
			}
		}
		if(increase==true && decrease== true)//here we ara checking if both true then not monotonic
			System.out.println("not monotic ");
		else
			System.out.println("monotonic");
		
	}

}
