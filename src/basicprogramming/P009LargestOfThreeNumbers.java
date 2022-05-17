package basicprogramming;

public class P009LargestOfThreeNumbers 
{
	public static void main(String args[])
	{
	//Approach : 1
/*		
	int a  = 10;
	int b=  20;		
	int c=  30;
	
	if(a>b && a>c)
	{
		System.out.println("a is greatest");
	}
	else if(b>a && b>c)
	{
		System.out.println("b is greatest");
	}
	else if(c>a && c>b)
	{
		System.out.println("c is greatest");
	}
	
	else
	{
	System.out.print("Wrong Input");
	}
	
	*/
		
	//Approach : 2	
		
	int a=10,b=20,c=30,d,e,f;
	
	d=a>b?a:b;	//greatest of a and b
	e=d>c?d:c;	//greatest of c and d
	f=d>e?d:e;	//greatest of d and e
	
	System.out.println(f);
	
	//OR combining above result
	System.out.println(a>b?a:b>c?a>b?a:b:c);	
	
	}
}
