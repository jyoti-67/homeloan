public class Test 
{
	public static void main(String args[])
	{ 
		A a = new A();
		int x = a.m1(10,20);
		System.out.println("add is =" +x );

		B b = new B();
		int y = b.m2(20,10);
		System.out.println("sub is =" +y);
	
		C c = new C();
		int z = c.m3(10,20);
		System.out.println("mult is =" +z);
	
		D d = new D();
		int p = d.m4(20,10);
		System.out.println("div is =" +p);
	}
}
