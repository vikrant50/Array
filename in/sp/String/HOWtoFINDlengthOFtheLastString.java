package in.sp.String;
/*
 Input string - " welcome to amit kumar "
 output:-5 (remove space )
 */
public class HOWtoFINDlengthOFtheLastString
{

	public static void main(String[] args) 
	{
		String str="welcome to amit kumadfrfv  ";
		int count=0;
		str=str.trim();
		
	   for(int i=str.length()-1;i>=0;i--)
	   {
		   if(str.charAt(i)==' ')
		   {
			   break;
		   }
		   count++;
	   }
	   System.out.println(count);

	}

}
