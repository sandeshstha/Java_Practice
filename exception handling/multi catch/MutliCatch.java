public class MutliCatch
{
	public static void main(String[] args) 
	{
		try
		{
			int[] a = new int[5];
			a[10] = 30/0;
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException occured");
		}
		catch(Exception e)
		{
			System.out.println("parent Exception");
		}
		System.out.println("rest of the code:");
	}
}