class BoxDemo
{
	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box(2);

		int vol;

		vol = b1.volume();
		System.out.println("the volume of box1 is:"+vol);

		vol = b2.v olume();
		System.out.println("the voulme of box 2 is:"+vol);

	}
}