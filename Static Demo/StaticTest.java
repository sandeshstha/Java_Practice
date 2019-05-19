class StaticTest
{
	int roll;
	static String college = "gces";
	static void change()
	{
		college = "PU";
	}
	StaticTest(int roll)
	{
		this.roll = roll;
	}
	void display()
	{
		System.out.println(roll+" "+college);
	}
}