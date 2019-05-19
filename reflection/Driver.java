import java.lang.reflect.*;

class Driver
{
	public static void main(String[] args) throws Exception 
	{
		Test obj = new Test();

		Class clsObj = obj.getClass();
		System.out.println("the name os the class is:"+clsObj.getName());

		Constructor cont = clsObj.getConstructor();
		System.out.println("the name of the constructor is:"+cont.getName());

		Method[] methodObj = clsObj.getMethods();
		for(Method m:methodObj)
		{
			System.out.println(m.getName());
		}
	}
}