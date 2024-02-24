

package Arrays;

public class PRINT_ODD_USING_RECURSION 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		oddNo(1,100);
	}
	public static void oddNo(int start,int end)
	{
		if(end<start)
		{
			return;
		}
		System.out.println(start);
		
		oddNo(start+2,end);
	}

}
