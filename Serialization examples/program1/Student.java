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