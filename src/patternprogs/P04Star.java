package patternprogs;

public class P04Star 
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)			//lines
		{
			
			
			for(int j=4;j>=i;j--)  		//space	
			{		
				System.out.print("-");
			}
			
			
			for(int k=1;k<=i;k++ )		//stars
			{
				if(i>=2 && k>1)		//2nd line and *>1 
				{
					System.out.print("-");
				}
			else
				System.out.print("*");
			}
			
			
			
			//just added test comment
			
			System.out.println();
		}
	}
	
}


