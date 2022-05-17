package basicprogramming;

import java.util.Arrays;
import java.util.Collections;

public class P023SortingElementInArray 
{
	//BuiltInMethods
	public static void main(String[] args) 
	{
		// Approach : 1
/*		int ele[]= {9,7,5,3,1,4,8,6,0};
		Arrays.sort(ele);
		System.out.println(Arrays.toString(ele));
 */
		
		//Approach : 2
/*		int ele[]= {9,7,5,3,1,4,8,6,0};
		Arrays.parallelSort(ele);
		System.out.println(Arrays.toString(ele));
*/		 
		//Approach : 3		
		Integer[] ele = {9,7,5,3,1,2,4,6,8,0};
		Arrays.sort(ele,Collections.reverseOrder());
		System.out.println(Arrays.toString(ele));
	
	}
}
