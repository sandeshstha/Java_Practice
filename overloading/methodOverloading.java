class methodOverloading
{
	void test()
	{
		System.out.println("this is a test");
	}
	void test(int a)
	{
		System.out.println("the value of a:"+a);
	}
	public static void main(String[] args) {
		methodOverloading m1 = new methodOverloading();
		m1.test();
		m1.test(2);
	}
}