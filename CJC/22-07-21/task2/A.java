public class A
{

	public static void main(String args[])
	{
		String s = "India is my country";

		String h[] = s.split("n");

		for(int i =0; i<h.length; i++)
		{
			System.out.println(h[i]);
		}

	}
}