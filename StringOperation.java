public class StringOperation
{
	public static void main(String[] args) 
	{
		String name1 = new String("Sandesh Shrestha");
		String name2 = "don of the WorlD.";

		String nameInUpperCase = name1.toUpperCase();
		System.out.println("uppercase is:"+nameInUpperCase);
		
		String nameInLowerCase = name1.toLowerCase();
		System.out.println("lowecase is:"+nameInLowerCase);

		boolean b = name1.equals(name2);
		System.out.println(b); //prints false

		Boolean a = name1.isEmpty();
		System.out.println(a); //prints false
	}
}