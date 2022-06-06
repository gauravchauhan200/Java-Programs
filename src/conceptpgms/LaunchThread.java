package conceptpgms;

public class LaunchThread 
{

	public static void main(String args[])
	{
		Home h = new Home();
		
		Abc a = new Abc("Raman",h);
		a.start();
		a.i=10;
		System.out.println("value of i from thread a is : "+a.i);
		a.threadlocal.set("Raman");
		System.out.println("Printing from 1st thread : "+a.threadlocal.get());
		
		Abc a2=new Abc("kailash",h);
		a2.start();
		System.out.println("value of i from thread a2 is : "+a2.i);
		System.out.println("Printing from 1st thread : "+a2.threadlocal.get());
		
	
	}
	
	
}
