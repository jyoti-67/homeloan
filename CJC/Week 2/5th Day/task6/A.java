import java.util.*;

public class A
{
	public Student m1()
	{
		Scanner sc = new Scanner(System.in);

		Student s = new Student();

		System.out.println("Enter rollno :");

		int rn = sc.nextInt();

		s.rollno = rn;

		System.out.println("Enter name :");

		String na = sc.next();

		s.name = na;

		return s;
	}

}