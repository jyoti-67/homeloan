public class A
{
	public int m1(int x, int y)
	{
		System.out.println("m1 method of class A");  
		
		return x + y;
	}
	public static void main(String args[])
	{
		System.out.println("main method starts");

		A a = new A();
		int x = a.m1(10,20);
		
		System.out.println("main method ends");
		System.out.println(x);
	}
}