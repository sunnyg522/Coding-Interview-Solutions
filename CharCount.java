/*
* if the String is aabbbbcc 
* retunr a2b4c2
* oother function takes input string and interger 1 then retunr abbbc i.e if less
* then integer then do not return any else all values of a
* Finding of charector count is done in O(n)
*/
import java.util.*;

public class CharCount{

	public static void main(String[] args)
	{
		charCount("abdbbbdda", 2);
	}

	public static void charCount(String s, int t)
	{
		char[] char_set = new char[s.length()];
		char_set = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i<s.length(); i++)
		{
			if(map.containsKey(char_set[i]))
			{
				map.put(char_set[i], map.get(char_set[i])+1);

			}
			else 
				map.put(char_set[i], 1);
		}
		for (Character value : map.keySet())
			{
				if(map.get(value)>=t)
				map.put(value, map.get(value)-t);
			}
			printCharCount(map);
		

	}
	public static void printCharCount(HashMap<Character, Integer> map)
	{
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		hashMap = map;
		for (Character value : map.keySet())
			{
				System.out.print(value+""+map.get(value));
			}
	}

}