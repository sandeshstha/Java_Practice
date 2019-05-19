interface Printable
{
	void print();
}
interface Showable
{
	void print();
}
class Demo implements Printable,Showable
{
	public void print()
	{
		System.out.println("hello mfs");
	}
	public static void main(String[] args) 
	{
		Demo obj = new Demo();
		obj.print(); 	
	}
}