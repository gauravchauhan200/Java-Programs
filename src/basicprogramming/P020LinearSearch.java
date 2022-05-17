package basicprogramming;

public class P020LinearSearch 
{
	public static void main(String[] args) 
	{
	int ele[]= {8,3,7,6,5,4,9,1,0};
	int key = 70;
	
	boolean flag=false;
	
	for(int i=0;i<=ele.length-1;i++)
	{
		if(ele[i]==key)
		{
			System.out.println("Element Found");
			flag = true;
			break;
		}
	}
	if(flag == false)
	{
		System.out.println("Key Element not found");
	}
	}
}
