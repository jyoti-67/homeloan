public class A
{
	int x;
	String y;

	public A m1()
	{
		A a = new A();
		a.x = 20;
		a.y = "ABC";
		
		return a;
	}
	public static void main(String args[])
	{
		A a = new A();
		A a1 = a.m1();
		
		System.out.println(a1.x);
		System.out.println(a1.y);
		System.out.println(a.x);
		System.out.println(a.y);
	}
}
