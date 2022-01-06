public class A
{
	public void sum()
	{
		int x = 10;
		int y = 20;
		int z = x+y;
		int d = x-y;
		int e = x*y;
		int f = x/y;
		System.out.println("Output add:" +z);
		System.out.println("Output sub:" +d);
		System.out.println("Output mul:" +e);
		System.out.println("Output div:" +f);
	}
	public static void main(String args[])
	{
		A a = new A();
		a.sum();
	}
}