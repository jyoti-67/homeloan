public class Test
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.setRollNo(101);
		s1.setName("ABC");
  		int roll = s1.getRollNo();
		System.out.println(roll);
		


		String name = s1.getName();
		System.out.println(name);
	}
}