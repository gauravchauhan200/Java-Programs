package basicprogramming;


public class P022BubbleSort 
{
	public static void main(String[] args) 
	{
		
	int ele[]= {4,5,6,7,2,1,0,9,8};
	int temp;
		for(int i=0; i<=ele.length-1; i++)		// no of times loop
		{
			for(int j=0;j<=ele.length-2;j++)	//swapping with next or iteration
			{
				if(ele[j] > ele[j+1])
				{
					temp = ele[j];
					ele[j]=ele[j+1];
					ele[j+1]=temp;
				}
			}
		}
		for(int a:ele)
		{System.out.print(a+" ");}
		}
}
