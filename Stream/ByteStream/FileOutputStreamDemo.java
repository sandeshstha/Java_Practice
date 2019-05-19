//write to a file
import java.io.FileOutputStream;

class FileOutputStreamDemo
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fout = new FileOutputStream("abc.txt");
		String s = "I am a software engineering student";
		byte[] b = s.getBytes();
		fout.write(b); //it overrides the file content and write
		fout.close();
		System.out.println("wrote succesfullly");
	}
}