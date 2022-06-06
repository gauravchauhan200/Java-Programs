package conceptpgms;

public class ThreadDemo2 
{
	public static void main(String args[])
	{
		MyThread2 My2 = new MyThread2();
		Thread t2 = new Thread(My2);
		t2.start();
		
		for(int i=0;i<=20;i++)
		{
			System.out.println("main class");
		}
		
	}	
	
}
