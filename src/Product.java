
public class Product 
{
	private String productName;
	private int productID;
	//private int stock;
	//private int porusStock;
	private int[] productLocation;

	public int[] getlocation()
	{
		return productLocation;
	}
	
	public int getproductID()
	{
		return productID;
	}
	
	public String getproductname()
	{
		return productName;
	}
	
	public void setproductlocation(int[] prodloc)
	{
		productLocation = prodloc;
	}

}
