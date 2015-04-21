import java.util.*;

public class FirstNonRepChar
{
	public static void main(String[] args)
	{
		findNonRepChar("abdcde");
	}
	public static void findNonRepChar(String s)
	{
		int count = 0;
		int i=0;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		while(true)
		{
			
			
			//map.put(s.charAt(i)+"",  1);
			if(!map.containsKey(s.charAt(i)+""))
			{
				map.put(s.charAt(i)+"", 1);
				count++;
				System.out.println(s.charAt(i));
				i++;
			}
			else 
				break;
		}
	}
}