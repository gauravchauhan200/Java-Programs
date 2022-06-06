package conceptpgms;

public class Home 
{

	public synchronized void print(String name) 
	{
		try {
			System.out.println("Good morning");
			Thread.sleep(500);
			System.out.println(name);
		} catch (Exception e) 
		{
		System.out.println("Home Method");		}
	}
	
	
	
}
