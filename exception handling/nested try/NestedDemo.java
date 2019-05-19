class NestedDemo
{
	public static void main(String[] args) {
		
		try
		{
			try
			{
				int a = 10/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}

			try
			{
				int[] a = new int[5];
				a[10] = 8;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}

			System.out.println("dummy sstatedme");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code;");
	}
}