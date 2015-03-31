public class UniqeText{

	public static void main(String[] args)
	{
	 	System.out.println(isStringUnique("blabla"));
	}
	
	private static boolean isStringUnique(String s)
	{
		boolean[] char_set = new boolean[256];
		for(int i=0;i<s.length();i++)
		{	
			int value = s.charAt(i);
			if(char_set[value])
				return false;
			else
				{
				char_set[value]=true;
				return true;
					}
		}
		
		return true;
	}



}