package basicprogramming;

public class P007EvenAndOdd 
{
	public static void main(String args[])
	{
		
	int ori_num = 1234;
	int rem;

	rem = ori_num % 10;

	if(rem%2==0)
	{
		System.out.println("Num is even");
	}
	else
	{
		System.out.println("Num is Odd");
	}
	
	}
}
