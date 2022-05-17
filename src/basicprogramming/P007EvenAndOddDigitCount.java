package basicprogramming;

public class P007EvenAndOddDigitCount 
{
	public static void main(String args[])
	{
		int num =123456;
		int rem =0;
		int ecount=0, ocount=0;
		while(num>0)
		{	
			rem=num%10;
			num=num/10;
		
			if(rem%2==0)
			{
				ecount++;
			}
			else
			{
				ocount++;
			}
		}
		System.out.println("Even Count : "+ecount);
		System.out.println("Odd Count : "+ocount);
	}
}
