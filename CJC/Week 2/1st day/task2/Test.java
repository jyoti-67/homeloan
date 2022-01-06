public class Test
{
	public static void main(String args[])
	{
		Player p1 = new Player();
		p1.setPrank(101);
		p1.setPname("Sachin");

		p1.setPmob(9764541113l);
		p1.setPsalary(50000d);
  		
		int rank = p1.getPrank();
		System.out.println(rank);
		
		String name = p1.getPname();
		System.out.println(name);

		long mob = p1.getPmob();
		System.out.println(mob);
		
		double salary = p1.getPsalary();
		System.out.println(salary);
		
		
	}
}