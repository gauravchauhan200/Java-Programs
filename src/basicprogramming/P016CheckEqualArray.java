package basicprogramming;

public class P016CheckEqualArray 
{
	public static void main(String[] args) 
	{
		int ar1[]= {2,3,4,5,6,7,8};
		int ar2[]= {1,2,3,4,5,6,7,8};
		int count=0;
		
		
		if(ar1.length==ar2.length)
		{
			for(int i=0;i<=ar1.length-1;i++)
			{
				if(ar1[i]!=ar2[i])
				{
					System.out.println("Arrays are not equal");
					break;
				}
				else
				{
					count++;
				}
			}
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		if(count++==ar1.length)
		{
			System.out.println("Arrays are equal");
		}
		
	}
}
