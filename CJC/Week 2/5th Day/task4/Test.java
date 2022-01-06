import java.util.Scanner;

public class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name :");

		String name = sc.nextLine();

		A a = new A();
		a.m1(name);
	}
}