package basicprogramming;

public class P026CountOccuranceOfCharacter 
{
	public static void main(String[] args)
	{
		String str = "Welcome to java programming language";
		int a =str.length();
		
		str = str.replace("a","");
		int b = str.length();
		
	System.out.println(a-b);
	
	}
}
