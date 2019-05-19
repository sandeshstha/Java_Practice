// wap to read a number from console using InputStream. apply the method of serialization in this program
import java.io.*;
class ReadData implements Serializable
{
		ReadData()
		{
			try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter the numner");
			int roll = Integer.parseInt(br.readLine());
			System.out.println("the roll number is:"+roll);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	
		}
}