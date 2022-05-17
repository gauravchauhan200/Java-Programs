package conceptpgms;

import java.util.ArrayList;
import java.util.LinkedList;

public class P002LinkedList 
{
	public static void main(String args[])
	{
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(11);
		ll.add(12);
		ll.add(13);
		ll.add(2, "b");
		
		ArrayList ar =new ArrayList();
		ar.add(99);
		ar.add(98);
		ar.add(97);
		ll.addAll(ar);
		System.out.println(ll);
		ll.addFirst(8);
	
		System.out.println(ll);
		System.out.println(ll.element());
		System.out.println(ll.getLast());
		System.out.println(ll.peek());
		System.out.println(ll.peekLast());
		System.out.println(ll.poll());
		System.out.println(ll);
		ll.push(45);
		System.out.println(ll);
		
		
		
		
	}
}
