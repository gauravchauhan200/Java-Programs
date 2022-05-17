
package basicprogramming;

public class P001SwappTwoNumbers 
{
	public static void main(String args[])
	{
		//Approach : 1
		/*
		int a =10;
		int b =20;
		int c;
		
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		*/
		
		//Approach : 2
/*		
		int a= 10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
*/
		//Approach : 3
/*		
		int a = 10;
		int b = 20;
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(a);
		System.out.println(b);
*/
		//Approach : 4
		
		int a=10;
		int b=20;
		
		b=(a+b)-(a=b);
		System.out.println(a);
		System.out.println(b);
		
	}
}
