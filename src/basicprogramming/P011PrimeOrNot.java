package basicprogramming;

public class P011PrimeOrNot
{
	public static void main(String[] args) 
	{
	
		int num =144;
		int count=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i == 0)
			{count++;}
			
		}
		if(count==2)
		{	
			System.out.println("Its prime Number");}
		else
		{	
			System.out.println("Number is Not Prime");}
	}
}
