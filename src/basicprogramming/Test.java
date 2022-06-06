package basicprogramming;

public class Test 
{
	
	public static void main(String args[])
	{

		int a[]= {1,6,2,3,4,55,4,6,7,6,8,9};
	
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]+" : element is duplicate");
				}
			}
			
			
			
		}
	
	
	}
}
