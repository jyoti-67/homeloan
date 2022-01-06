public class A
{
	public static void main(String args[])
	{

		String regx = "[A-Za-z0-9]{1,10}";

		String s = "ABCDEF";

		if(s.matches(regx))
		{
			System.out.println("s matches with regx");
		}
		else
		{
			System.out.println("s not matches with regx");

		}

	}
}