import java.util.*;
public class SubString
{
  public static void main(String args[])
  {
    System.out.println(indexOfSubString("012345679101112", "11"));
  }
  public static int indexOfSubString(String main, String sub)
  {
    int subStringLength = sub.length();

    for(int i = 0; i<main.length(); i++)
    {
      if(main.substring(i, i+subStringLength).equals(sub))
        return i;
    }
    return 0;
  }
}
