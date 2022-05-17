package basicprogramming;

import java.util.Scanner;

public class P015ExtractEvenAndOdd 
{
	public static void main(String[] args) 
	{
			try (Scanner s = new Scanner(System.in)) {
				System.out.println("Enter the size of array");
				
				int size=s.nextInt();
				
				int ele[] = new int[size];
				
				System.out.println("Enter the Element for array");
				
				for(int i=0;i<=ele.length-1;i++)
				{
					ele[i]=s.nextInt();
				}
				
				//OR
				//int ele[]= {1,2,3,4,5,6,7,8,9,0};
				
				int evenno,oddno ;
				
				
				System.out.println("Even numbers are : ");
				for(int i=0;i<=ele.length-1;i++)
				{
					if(ele[i]%2==0 && ele[i]!=0)
					{
						evenno=ele[i];
						System.out.print(evenno+" ");
					}
				}
				
				System.out.println();
				System.out.println("Odd numbers are : ");
				for(int i=0;i<=ele.length-1;i++)
				{
					if(ele[i]%2!=0 )
					{
						oddno=ele[i];
						System.out.print(oddno+" ");
					}
				}
			}
			
	}		
}

