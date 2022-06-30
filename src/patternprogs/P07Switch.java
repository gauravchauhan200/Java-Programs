package patternprogs;

public class P07Switch 
{
	public static void main(String args[])
	{
		int day = 9;
		
		switch (day)	//integer,string,char,enum
		{
		case 1:
			System.out.println("Monday");
			break;	
		case 2:
			System.out.println("Tuesday");
			break;							//we are using break, so the rest of the statement after selected one  
		case 3 : 							//will not gets executed
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;			
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");	
			break;
		
		default:
			System.out.println("None of the case matched");
		
		}	
	}
}
