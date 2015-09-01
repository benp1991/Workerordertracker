
public class Orderline 
{
	private String productName;
	private int productID;
	private int quantity;
	private boolean poruswared;
	
	public String getproductname()
	{
		return productName;
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
	
	public void setproductname(String prodName)
	{
		productName = prodName;
	}
	
	public void setproductID(int prodID)
	{
		productID = prodID;
	}
	
	public void setquantity(int quant)
	{
		quantity = quant;
	}
	
	public void setporus(boolean porus)
	{
		poruswared = porus;
	}

}
