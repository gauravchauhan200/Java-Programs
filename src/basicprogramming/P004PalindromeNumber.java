package basicprogramming;

public class P004PalindromeNumber 
{
	public static void main(String[] args) 
	{
		int giv_num =1234321;
		int ori_num = giv_num;
		int rev =0;
		
		while(ori_num!=0)
		{
			rev = rev*10 + ori_num%10;
			ori_num = ori_num/10;
		}
		if(giv_num==rev)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
	}
}
