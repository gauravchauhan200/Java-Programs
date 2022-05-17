package basicprogramming;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class P030WriteDataInTextFile 
{
	// FileWriter + BufferWriter		
	public static void main(String[] args) throws IOException 
	{
		
	FileWriter fw	= new FileWriter("C:\\Users\\GC\\Desktop\\Planned.txt");
	BufferedWriter bw = new BufferedWriter(fw);
		
	bw.write("Writing from eclipse\n");
	bw.write("Again typing from Eclipse\n");
	bw.write("bye");
	bw.close();
	}
}
