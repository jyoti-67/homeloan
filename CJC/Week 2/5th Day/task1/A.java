public class A
{
	public Cars m1()
	{
		Cars c = new Cars();
		c.modelno = 600;
		c.name = "Audi";
		c.color = "Black";
	
		return  c;
	}

	public Cars m2()
	{
		Cars c = new Cars();
		c.modelno = 700;
		c.name = "BMW";
		c.color = "Red";

		return c;

	}

	public void m3(Cars c)
	{
		System.out.println(c.modelno);
		System.out.println(c.name);
		System.out.println(c.color);
	}
}