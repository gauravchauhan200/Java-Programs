package basicprogramming;

import java.util.Random;

public class P012RandomNumberGeneration 
{
	public static void main(String args[])
	{
		Random r = new Random();
		int random_no = r.nextInt(1000);
		System.out.println(random_no);
	/*	
		String rand_nu= RandomStringUtils.randomNumeric(5);
		System.out.println(rand_nu);

		String rand_str= RandomStringUtils.randomAlphabetic(5);
		System.out.println(rand_str);
	*/	
		
	}
}
