public class A 
{
	public void sub()
	{
		int a=10;
		int b=10;
		int c=a+b;
		System.out.println("sub is =" +c);
	}
	public void div()
	{
		int a=10;
		int b=5;
		int c=a/b;
		System.out.println("div is =" +c);
	}
	public void mul()
	{
		int a=10;
		int b=2;
		int c=a*b;
		System.out.println("mul is =" +c);
	}
	public static void main(String args[])
	{
		A a=new A();
		a.sub();
		a.mul();
		a.div();
	}
}