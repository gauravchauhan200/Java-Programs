package patternprogs;

public class P03StarPattern 
{
	public static void main(String[] args)
	{
	int n=4;
	
	
	for(int i=0;i<=n;i++) 					//lines
	{
		for(int j=2*(n-i);j>=0;j--)				//spaces
		{
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++)				//stars
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	
	for(int i=0; i<=n-1;i++)		//lines
	{
		for(int j=0;j<= 2*(i+1);j++)						//spaces
		{
			System.out.print(" ");
		}
		for(int k=n-i;k>=1;k--)						//stars
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	
	
	
	
	
	}
}
