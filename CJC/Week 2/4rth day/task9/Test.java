public class Test
{
	public static void main(String args[])
	{
		State s = new State();
		s.setStname("Maharashtra");
		s.setCity(d);

		Country c = new Country();
		c.setCid(34);
		c.setCname("India");
		c.setSt(s);

		City d = new City();
		d.setName("pune");
		
		System.out.println(c.getCid());
		System.out.println(c.getCname());
		System.out.println(c.getSt().getStname());
		System.out.println(c.getSt().getCity().getNSame());


	}
}