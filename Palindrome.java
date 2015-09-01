// Changing Dinesh code
// A man, aplan, a canal, Panama!
// Write a code that returns if an string is palindrom and it true for above intupt

public class Palindrome
{
  public static void main(String[] args)
  {
    System.out.println(isPalindrome("A man, aplan, a canal, Panam!"));
  }
  public static boolean isPalindrome(String s)
  {
    char a, b;
    int valA = 0, valB = 0;
    int i = 0, j = s.length()-1;

    while(i<j)
    {
      a = Character.toLowerCase(s.charAt(i));
      b = Character.toLowerCase(s.charAt(j));

      valA = a -'a';
      valB = b -'a';

      if(valA<0||valB>26)
        i++;
      if(valB<0||valB>26)
        j--;
      if((valA>=0&&valA<26) && (valB>=0&&valB<26) && a!=b)
        return false;
      if((valA>=0 && valB<26)&&(valB>=0&&valB<26) && a==b)
      {
        i++;
        j--;
      }
    }
    return true;
  }
}
