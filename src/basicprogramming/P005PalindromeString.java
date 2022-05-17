package basicprogramming;

public class P005PalindromeString 
{
	public static void main(String[] args) 
	{
	
		String ori_str="gauravchauhan";
		String str =ori_str;
		String rev="";
	
	for(int i=str.length()-1;i>=0;i--)
	{
		
		rev = rev+str.charAt(i);
	}
	if(ori_str.equalsIgnoreCase(rev))
	{
		System.out.println("String is palindrome");
	}
	else
	{	
		System.out.println("String is not palindrome");
	}
	
	}
}
