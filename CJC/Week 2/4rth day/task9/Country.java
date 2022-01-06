public class Country
{
	int cid;
	String cname;
	State st;

	public void setCid(int cid)
	{
		this.cid = cid;
	}
		
	public int getCid()
	{
		return cid;
	}

	public void setCname(String cname)
	{
		this.cname = cname;
	}
	public String getCname()
	{
		return cname;
	}
	public void setSt(State st)
	{
		this.st = st;
	}
	public State getSt()
	{
		return st;
	}
}