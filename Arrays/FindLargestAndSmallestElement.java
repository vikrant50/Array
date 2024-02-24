package Arrays;
/*
 2nd ways to find largest elemnt 
 int arr[]={23,4,31,13,1,5,7}
 int largest;
 Arrays.sort(arr);
 largest=arr[arr.length-1]
 sout(largest)//31
 */
public class FindLargestAndSmallestElement 
{

	public static void main(String[] args)
	{
    
               int arr[]= {3,4,54,56,654,1};          
               int max=arr[0]; //
               int min=arr[0];//
               //LARGEST 
               for(int i=0;i<arr.length;i++)
               {
            	 if(arr[i]>max)
            	 {
            		 max=arr[i];
            	 }
               }
               System.out.println("The largest element "+max);
               
               //MINIMUM
               for(int i=0;i<arr.length;i++)
               {
            	 if(arr[i]<min)
            	 {
            		 min=arr[i];
            	 }
               }
               System.out.println("The smallest element "+min);
           
               
}

}
