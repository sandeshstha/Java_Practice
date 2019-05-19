class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s); //on println(object of Exception) will trigger the toString() method
	}
}

