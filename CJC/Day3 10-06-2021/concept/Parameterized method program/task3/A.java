public class A
{
	public void m1(int x,int y,String name)
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(name);
	}
	public static void main(String args[])
	{
		A a = new A();
		a.m1(20,10,"Jyoti");
	}
}