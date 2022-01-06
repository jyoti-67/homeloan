import java.util.Scanner;

public class D
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st value");

		int v1 =sc.nextInt();

		System.out.println("Enter 2nd value");

		int v2 = sc.nextInt();

		int Div = v1 / v2;

		System.out.println("Div =" +Div);
	}
}