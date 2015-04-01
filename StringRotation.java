public class StringRotation {
	public static void main(String[] args)
	{
		System.out.println(isOneStringRotationOfOther("waterbottel", "bottelwater"));
	}

	public static boolean isSubString(String patterStr,String test){
		if(patterStr == null || test == null)	return false;
		if((patterStr.indexOf(test)) > 0)	return true;
		else return false;		
	}
	public static boolean isOneStringRotationOfOther(String s1, String s2)
	{
		int len = s1.length();
		String s1s1;
		if(len==s2.length() && len>0)
		{
			s1s1 = s1+s1;
			return isSubString(s1s1, s2);
		}
		return false;
	}
}