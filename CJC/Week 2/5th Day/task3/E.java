import java.util.Scanner;

public class E
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st value");

		float f1 =sc.nextFloat();

		System.out.println("Enter 2nd value");

		float f2 = sc.nextFloat();

		float per = f1 *f2/100;

		System.out.println("percentage =" +per);
	}
}