//read to a file  abc.txt
import java.io.FileInputStream;

class FileInputStreamDemo
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fin = new FileInputStream("abc.txt");
		int i = 0;
		while((i=fin.read())!=-1) //int read() method
		{
			System.out.println((char)i); //type casting int to string
		}
		fin.close();
	}
}
