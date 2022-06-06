package conceptpgms;

public class Abc extends Thread 
{
	String name;
	Home h;
	
	ThreadLocal<String> threadlocal=new ThreadLocal<String>();
	static int i;
	
	
	
	public Abc(String name,Home h)
	{
		this.name=name;
		this.h=h;
	}
	
	public void run()
	{
		for(int i=0;i<=20;i++)
		{
			this.h.print(name);
			
		}
		
	}
	

}
