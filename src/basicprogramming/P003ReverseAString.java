package basicprogramming;

public class P003ReverseAString 
{
	public static void main(String args[])
	{
		//Approach : 1
	/*	
		StringBuffer rev;
		StringBuffer sb= new StringBuffer("gauravchauhan");
		rev =sb.reverse();
		System.out.println(rev);
	*/
		//Approach : 2
	/*	
		StringBuilder  rev;
		StringBuilder sb = new StringBuilder();
		sb.append("gauravchauhan");
		rev=sb.reverse();
		System.out.println(rev);
*/
	//	Approach : 3
	/*	
		String str = "gauravchauhan";
		String rev="";
		for(int i= str.length()-1; i>=0;i--)
		{
			rev =rev + str.charAt(i);
		}
		System.out.println(rev);
	*/
	//	Approach : 4
		
		String str ="gauravchauhan";
		String rev="" ;
		char cstr[] = str.toCharArray();
		
		for(int i=cstr.length-1;i>=0;i--)
		{
			rev = rev + cstr[i];
		}
	System.out.println(rev);
	}
}
