package basicprogramming;

public class P014SumOfElement 
{	//Sum Of Elements in Arrays
	
	public static void main(String args[])
	{
		int elem[]= {1,2,3,4,5,6,7};
		int sum = 0;
		
		for(int i=0;i<=elem.length-1;i++)
		{
			sum = sum+elem[i];
		}
		
		System.out.println(sum);
		
	}
}
