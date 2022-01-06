public class Test
{
	public Cars m1()
	{
		Cars c = new Cars();
		c.modelno = 600;
		c.name = "Mercedez Benz";
		c.color = "Silver";

		return c;
	}

	public static void main(String args[])
	{
		A a = new A();
		Cars c1 = a.m1();
		Cars c = a.m2();

		Test t = new Test();
		Cars c3 =t.m1();

		
		a.m3(c1);

		System.out.println("--------");
		a.m3(c);

		System.out.println("--------");
		a.m3(c3);

	}
}