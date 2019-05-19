//ArithmeticException caused NullPointerException
class ChainedDemo
{
	public static void main(String[] args) 
	{
		try
		{
			//creating an exception
			NullPointerException e = new NullPointerException("null ptr exception");
			//setting up the cause of the exception
			e.initCause(new ArithmeticException("ArithmeticException is the cause "));
			//throw null pointer exception along with the cause
			throw e;
		}	
		catch(Exception e)
		{
			System.out.println("Caught:"+e);
			System.out.println("the cause of the exception is:"+e.getCause());
		}
		System.out.println("normal flow of the program");
	}
}