package WOT;

public class Orderline 
{
	private int productID;
	private int quantity;
	private boolean poruswared;
	
	public Orderline(int IDproduct, int quant, boolean porusw)
	{
		productID = IDproduct;
		quantity = quant;
		poruswared = porusw;
	}

	public int getproductID()
	{
		return productID;
	}
	
	public int getquantity()
	{
		return quantity;
	}
	
	public boolean getporuswared()
	{
		return poruswared;
	}

}
