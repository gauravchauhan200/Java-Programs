package basicprogramming;

public class P025RemoveAllSpaces 
{
	public static void main(String args[])
	{
	
		String str = "878768K  GGG  K!@ #$ % ^& *( )ajdkjsdk";
		str=str.replaceAll("\\s","");
		System.out.println(str);
		
	}
}
