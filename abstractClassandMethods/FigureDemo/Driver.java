class Driver
{
	public static void main(String[] args) {
		Figure ref;
		ref = new Rectangle(9,5);
		System.out.println("the area of rectangle is :"+ref.area());

		ref = new Triangle(6,6);
		System.out.println("the area of triangle is :"+ref.area());

	}
}