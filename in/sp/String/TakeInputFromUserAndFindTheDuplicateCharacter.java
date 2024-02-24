package in.sp.String;

import java.util.HashSet;

public class TakeInputFromUserAndFindTheDuplicateCharacter {

	public static void main(String[] args)
	{
		
		String str="ababsdkjfsdkfnh";
		
		HashSet<Character> characterSet=new HashSet<>();
		
		for(Character c : str.toCharArray())
		{
			if(characterSet.contains(c))
			{
				System.out.print(c+" ");
			}else {
				characterSet.add(c);
			}
		}

	}

}
