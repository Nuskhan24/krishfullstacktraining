package fibonacci_sequence;

import java.util.Arrays;
import java.util.List;



public class lambda {
	public static void main(String args[]) 
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		
	/*	for(int i=0;i<values.size();i++)
		{
			System.out.println(values.get(i));
		}*/
	
		values.forEach(i->System.out.println(i));
	}

}
