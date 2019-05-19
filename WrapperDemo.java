// public class WrapperDemo
// {
// 	public static void main(String[] args) {
// 		int num = 100;
// 		Integer obj = Integer.valueOf(100);
// 		System.out.println(num+" "+obj);
// 	}
// }
import java.lang.*;
public class 2WrapperDemo
{
	public static void main(String[] args) {
		Integer obj = new Integer(100);
		int num = obj.intValue();
		System.out.println(obj);
	}
}