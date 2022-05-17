package basicprogramming;

public class P021BinarySearch 
{
	public static void main(String args[])
	{
		int ele[] = {1,2,3,4,5,6,7,8,9};
		int key= 26;
		int l= 0;
		int h= ele.length-1;
		int m;
		boolean flag = false;
		
		while(h>=l)
		{
			m=(l+h)/2;
			
			if(key==ele[m])
			{
				System.out.println("Element found");
				flag=true;
				break;
			}
			
			if(key>ele[m])
			{
				l=m+1;
			}
			if(key<ele[m])
			{
				h=m-1;
			}
		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}
	}	
}
