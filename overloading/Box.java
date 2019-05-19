class Box
{
	int l,b,h;
	Box()
	{
		l=b=h=0;
	}
	Box(int x)
	{
		l=b=h=x;
	}
	int volume()
	{
		return l*b*h;
	}

}