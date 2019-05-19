// wap to store a object of class Student in to a file "student.dat" also read the object form same file.
import java.io.*;

class Student implements Serializable
{
	private int roll;

	public Student(int r)
	{
		roll = r;
	}
	public void display()
	{
		System.out.println("rolL:"+roll);
	}
}