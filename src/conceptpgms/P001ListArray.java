package conceptpgms;

import java.util.ArrayList;

public class P001ListArray 
{
		public static void main(String[] args) 
		{
			ArrayList al = new ArrayList();
			al.add(50);
			al.add(60);
			al.add(10);
			al.add("Hello");
			al.add(3, 50);
		
			ArrayList al2 = new ArrayList();
			al2.add("al2");
			al2.add("al2");
		
			System.out.println(al);
			ArrayList a = (ArrayList)al.clone();
			System.out.println(a);
			System.out.println(a.contains(60));
			System.out.println(a.containsAll(al));
			//a.ensureCapacity();
			System.out.println(a.equals(al2));
			System.out.println(a.size());
			System.out.println(a.get(3));
			
			System.out.println(a.getClass());
			System.out.println(a.hashCode());
			System.out.println(a.indexOf(10));
			System.out.println(a.isEmpty());
			//System.out.println(a.iterator());
			System.out.println(a.lastIndexOf(50));
			System.out.println(a.listIterator());
			System.out.println(a.parallelStream());
			//System.out.println(a.remove(3));
			
			System.out.println(a.subList(1, 3));
			a.set(3, 78);
			a.set(4, 79);
			System.out.println(a);
			
			Object ar[]=a.toArray();
			for(int i=0;i<=ar.length-1;i++)
			{
				System.out.println(ar[i]);
			}
			
				
	}
}
