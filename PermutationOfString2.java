public class PermutationOfString2
{
	public static void main(String[] args)
	{
		System.out.println("Two Strings are pemutated in same fashion :" +areTwoStringHaveSamePermu("String1", "String1"));
	}
	public static boolean areTwoStringHaveSamePermu(String x, String y)
	{
		if(x.length()!=y.length())
			return false;
		int value ;
		char[] c = new char[x.length()];
		c=x.toCharArray();
		int[] char_set = new int[256];

		for(int i=0; i<x.length();i++)
		{
			value = c[i];
			char_set[value]++;
		}

		for(int i=0; i<y.length();i++)
		{
			value = y.charAt(i);
			char_set[value]--;
			if(char_set[value]<0)
			{
				return false;
			}
		}
		return true;
		
	}
}