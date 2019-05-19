public class TryCatchDemo
{
	public static void main(String[] args) 
	{
		try
		{
			int a =0;
			int data = 50/a;
			System.out.println("this code will not be printed:");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception occured:"+e);
		}	
		System.out.println("rest of the code:");

	}
}