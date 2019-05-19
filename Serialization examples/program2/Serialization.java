import java.io.*;

public class Serialization
{
	public static void main(String[] args) 
	{
		ReadData obj = new ReadData();
		// writing object to file Sandesh.dat (serialization)
		try
		{
			ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("sandesh.dat"));
			outStream.writeObject(obj);
			outStream.close();
			System.out.println("successfully wrote object to file ");
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}