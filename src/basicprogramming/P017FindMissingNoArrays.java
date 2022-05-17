package basicprogramming;

public class P017FindMissingNoArrays
{
	public static void main(String args[])
	{
		//Input should be provided in sequencial order
	
		
	int ar1[]= {1,2,3,4,6,7,8,9,10};
	int mis = 0,count =0;
	
	
	for(int i=0;i<=ar1.length-2;i++)
	{
		if(ar1[i+1]!=ar1[i]+1)
		{
			mis=ar1[i]+1;
			System.out.println("Missing number is : "+mis);
			count++;
		}
	}
	
	if(count ==0)	
	{
		System.out.println("NO number is missing");
	}
	
	}
}
