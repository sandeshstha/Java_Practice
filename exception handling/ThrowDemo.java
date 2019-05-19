class ThrowDemo
{
	static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("cannot vote");
		}
		else
		{
			System.out.println("welcome to the voting system.");
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			ThrowDemo.validate(13);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code:");	
	}
}