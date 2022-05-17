package basicprogramming;

public class P018FindMinAndMax 
{
	public static void main(String args[])
	{
		
		int ar1[]= {1,2,3,4,5,6,7,8,9};
		int h=0;
		int l=ar1[0];		//l=0
		
		for(int i=0;i<=ar1.length-1;i++)
		{
			if(ar1[i]>h)
			{
				h=ar1[i];
			}
		}
		System.out.println("Highest Number is : "+h);
		
		for(int i=0;i<=ar1.length-1;i++)
		{
			if(ar1[i]<=l)
			{
				l=ar1[i];
			}
		}
		System.out.println("Lowest Number is : "+l);
		
	}
}
