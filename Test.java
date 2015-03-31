public class StringReverse
{
	public static void main(String[] args)
	{
		System.out.println(stringReverse("testing java project"));
	}
	public static String stringReverse(String s)
	{
		StringBuilder sb = new StringBuilder(s.length());
		for(int i=s.length()-1; i>=0;i--)
		{
			 sb.append(s.charAt(i));
		}

		return sb.toString();

	}
}