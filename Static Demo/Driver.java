class Driver
{
	public static void main(String[] args) {
		StaticTest.change();

		StaticTest s1 = new StaticTest(31);
		StaticTest s2 = new StaticTest(30);

		s1.display();
		s2.display();

	}
}