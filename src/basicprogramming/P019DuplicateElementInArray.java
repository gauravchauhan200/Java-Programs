package basicprogramming;

public class P019DuplicateElementInArray 
{
	public static void main(String[] args) 
	{
		int ar2[]= {1,2,3,4,5,6,7,8,9,4,3};
		int dup,count=0;
		
		for(int i=0;i<=ar2.length-1;i++)
		{
			for(int j= i+1;j<=ar2.length-1;j++)
			{
				if(ar2[i]==ar2[j])
				{
					dup=ar2[j];
					System.out.println("Duplicate element exist : "+dup);
					count++;
				}
			}
		}
		if(count==0)
		{
			System.out.println("Duplicate element does not exist");
		}
	}
}
