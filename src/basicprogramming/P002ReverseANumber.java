package basicprogramming;

public class P002ReverseANumber 
{
	public static void main(String[] args) 
	{
		//Approach : 1
/*	
		int num = 12345;
		int rev = 0;
		
		while(num!=0)
		{
		rev = rev*10 + num%10;
		num = num/10;
		}
		System.out.println(rev);
*/
		//Approach : 2
/*		
		int num = 12345;
		StringBuffer  rev;
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		rev=sb.reverse();
		System.out.println(rev);
*/	
		//Approach : 3
		
		int num = 12345;
		StringBuilder rev;
		
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		rev=sb.reverse();
		System.out.println(rev);
		
	}
}
