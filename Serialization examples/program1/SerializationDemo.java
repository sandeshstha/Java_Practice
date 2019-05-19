import java.io.*;
public class SerializationDemo
{
	public static void main(String[] args) 
	{
	
		Student sObj = new Student(31);	
		//now writing this object in a file named "student.dat"(serialization done)
		try
		{
			ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("student.dat"));
			outStream.writeObject(sObj);
			outStream.close();
		}
		catch(Exception e)
		{
			System.out.println("caught"+e);
		}
		//read the object from the same file adn display state of object (deserialization)
		try
		{
			ObjectInputStream inStream = new ObjectInputStream(new FileInputStream("Student.dat"));
			Student sdNew ;
			sdNew = (Student) inStream.readObject();
			sdNew.display();
			inStream.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}