package fibonacci_sequence;

public class lambda2 {
	
	@FunctionalInterface
	public interface MyInterface
	{
		public void add(int x,int y);
		
	}
	
	
public static void main(String args[])
	{
		int x=10;
		int y=20;
		MyInterface myInterface = (a,b)-> {
		System.out.println(x+y);		
		};
		myInterface.add(x, y);
	}

}
