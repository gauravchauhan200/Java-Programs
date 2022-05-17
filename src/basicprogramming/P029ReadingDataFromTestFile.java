package basicprogramming;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class P029ReadingDataFromTestFile
{
	public static void main(String[] args) throws IOException
	{
		//Approach : 1  FileReaderClass + BufferedReaderClass
		/*	
		FileReader fr =new FileReader("C:\\Users\\GC\\Desktop\\Planned.txt");
		BufferedReader  br=new BufferedReader(fr);
		String str;
		
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
	*/
		//Approach : 2    FileClass 
	
	File file=new File("C:\\Users\\GC\\Desktop\\Planned.txt");
	Scanner sc=new Scanner(file);
	
	while(sc.hasNextLine())
	{
		System.out.println(sc.nextLine());
	}
	
	
	}
}
