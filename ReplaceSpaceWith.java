import java.util.*;


public class ReplaceSpaceWith
{
	public static void main(String[] args)
	{
		String s = "Hello world this is a long string";
		char[] char_array= s.toCharArray();
		System.out.println(replaceSpace(char_array));
	}
	public static String replaceSpace(char[] char_array)
	{
		int spaceCount = 0, newLength;
		for(int i =0; i<char_array.length;i++)
		{
			if(char_array[i]== ' ')
				spaceCount++;
		}
		newLength = char_array.length+spaceCount*2;
		char[] new_charArray = new char[newLength];
		for(int i= char_array.length-1;i>=0;i--)
		{
			if(char_array[i]==' ')
			{
				new_charArray[newLength-1]='0';
				new_charArray[newLength-2]='2';
				new_charArray[newLength-3]='3';
				newLength = newLength-3;
			}
			else
			{
				new_charArray[newLength-1] = char_array[i];
				newLength = newLength-1;
			}

		}
		System.out.println(newLength);
		String s = new String(new_charArray);
		System.out.println(s);
		return s;

	}
}