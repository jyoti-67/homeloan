public class Test
{
	public static void main(String args[])
	{
		Player p1 = new Player();
		p1.setPid(100);
		p1.setPname("Kaveri");
		
		System.out.println(p1.getPid());
		System.out.println(p1.getPname());

		Player p2 = new Player();
		
		System.out.println(p2.getPid());
		System.out.println(p2.getPname());
	}
}