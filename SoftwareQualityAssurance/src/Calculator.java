
public class Calculator {
	
	private int a;
	private int b;
	
	
	public Calculator ()
	{
		
	}

	public Calculator (int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int addition()
	{
		return a+b;
	}
	
	public int subtraction()
	{
		return a - b;
	}
	
	public int division()
	{
		return a/b;
	}
	
	public int multiplication()
	{
		return a*b;
	}
}
