package conceptpgms;

public class ThreadDemo 
{
	public static void main(String args[])
	{
	
		MyThread My =new MyThread();
		My.start();
		
		
		for(int i=0;i<=100;i++)
		{
			System.out.println("Main Thread printing");
		}
		
		
	}
	
}
