package conceptpgms;

import java.util.Stack;

public class P003Stack 
{
	public static void main(String[] args) 
	{
	
	Stack s	= new Stack();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(40);
	s.add(1, "j");
	
	System.out.println(s);
	System.out.println(s.contains("j"));
	s.push(52);
	s.push(40);
	
	System.out.println(s);
	s.pop();
	System.out.println(s);
	}

}
