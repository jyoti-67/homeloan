public class Test
{
	public static void main(String args[])
	{
		A a = new A();
		int x = a.add();
		System.out.println("add is =" +x);
	
		B b = new B();
		int y = b.sub();
		System.out.println("sub is =" +y);

		C c = new C();
		int z = c.mult();
		System.out.println("mult is =" +z);
		
		D d = new D();
		int p = d.div();
		System.out.println("div is =" +p);
	}
}