package patternprogs;

/*

----*
---*-
--*--
-*---
*----


*/

//kdljjdl test comment 
public class P05
{
	public static void main(String args[])
	{
	
		for(int i=1;i<=5;i++)	//lines
		{
			for(int j=4;j>=i;j--)		//space triangle
			{
				System.out.print("-");
			}
			
			
			for(int k=1;k<=i;k++)	//star and space
			{
				if(i>=2 && k>1)
				{
					System.out.print("-");
				}
				else
				{System.out.print("*");}
			}
			
			
			System.out.println();
		}
	
	}
	
}




