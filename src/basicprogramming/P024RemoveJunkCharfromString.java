package basicprogramming;

public class P024RemoveJunkCharfromString 
{
	public static void main(String[] args) 
	{
		String str = "123217*&(^@^%&^%#^*^()jKHKGnaskjdfksbd";
		str=str.replaceAll("[^a-z0-9A-Z]","");
		System.out.println(str);
	}
}
