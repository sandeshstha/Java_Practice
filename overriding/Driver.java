class Driver
{
	public static void main(String[] args) {
		TestA a = new TestA();
		TestB b = new TestB();
		TestC c = new TestC();

		TestA ref;
		ref = a;
		ref.callme();
		ref = b;
		ref.callme();
		ref = c;
		ref.callme();
	}
}