public class A
{
	public void m1()
	{
		System.out.println("m1 method of class A");
	}
	public static void main(String args[])
	{
		System.out.println("main method starts");
		A a = new A();
		a.m1();
		System.out.println("main method ends");
	}
}