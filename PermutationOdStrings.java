import java.util.Arrays;

public class PermutationOdStrings
{
	public static void main (String[] args)
	{
		System.out.println("Is one String permutation of other string"+isOneisPermutationOfOther("god", "dog"));
	}

	public static boolean isOneisPermutationOfOther(String x, String y)
	{
		if(x.length()!=y.length())
			return false;
		else 
		{
			char[] p1 = x.toCharArray();
			char[] p2 = y.toCharArray();

			Arrays.sort(p1);
			Arrays.sort(p2);
			if(p1==p2)
				return true;
			else 
				return false;
		}
	}
}