class Rectangle extends Figure
{
	//parameterized constructor in subclass
	Rectangle(double a, double b)
	{
		super(a,b);
	}
	@Override
	double area()
	{
		System.out.println("inside rectangle");
		return dim1*dim2;
	}
}