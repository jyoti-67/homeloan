public class A
{
	public int m1()
	{
		System.out.println("m1 method of class A");
		
		return 20;	
	}

	public static void main(String args[])
	{
		System.out.println("main method starts");
		
		A a = new A();
		int x = a.m1();
		
		System.out.println(x);
		System.out.println("main method ends");
	}
}