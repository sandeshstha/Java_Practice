class TestFinally
{
	public static void main(String[] args) {
		
		try
		{
			int data = 10/0;
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("this will surely print");
		}
		System.out.println("this will not be printed");
	}
}