class Driver
{
	void validate(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("cannot vote"); //object creation invokes the constructor
		}
		else
			System.out.println("can vote");
	}
	public static void main(String[] args) 
	{
		Driver d = new Driver();
		try
		{
			d.validate(13); //gives exception
		}	
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		System.out.println("rest of the code");
	}
}