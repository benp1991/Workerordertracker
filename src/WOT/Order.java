package WOT;

public class Order 
{
	private int orderID;
	private boolean claimed = false;
	private boolean contPorus = false;
	private int[] orderLines;
	private int totalquant;
	
	public Order(int IDorder, boolean claim, boolean poruscont, int[] oline, int totquant)
	{
		orderID = IDorder;
		claimed = claim;
		contPorus = poruscont;
		orderLines = oline;
		totalquant = totquant;
	}
	
	public void setasclaimed()
	{
		claimed = true;
	}
	
	public int getorderid()
	{
		return orderID;
	}
	
	public boolean getorderclaimed()
	{
		return claimed;
	}
	
	public boolean getorderporuswared()
	{
		return contPorus;
	}
	
	public int[] getorderlines()
	{
		return orderLines;
	}
	
	public int gettotalquant()
	{
		return totalquant;
	}
	
}
