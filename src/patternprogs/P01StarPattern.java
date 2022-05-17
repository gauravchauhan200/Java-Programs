package patternprogs;

public class P01StarPattern 
{
	public static void main(String args[])
	{
	int n=5;
	
	for(int i=0;i<=n-1;i++)
	{
		for(int j=n-i;j>=0;j--)
		{
			System.out.print(" ");
		}
	
		for(int k=0;k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}	
}
}
