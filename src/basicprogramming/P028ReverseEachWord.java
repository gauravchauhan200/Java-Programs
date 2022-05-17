package basicprogramming;
public class P028ReverseEachWord 
{
	public static void main(String[] args) 
	{
	
	String str ="java is a programming language";
	String words[]=str.split(" ");
	
	String revstring="";
	
	for(int i=words.length-1;i>=0;i--)
	{
		String revword= "";
		for(int j=words[i].length()-1;j>=0;j--)
		{
			revword= revword + words[i].charAt(j);
		}
		
		revstring = revstring + revword+" ";
	}
	System.out.print(revstring);
	
	}
}
