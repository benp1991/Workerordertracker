package WOT;

public class Product 
{
	private static String productName;
	private int productID;
	//private int stock;
	//private int porusStock;
	private int[] productLocation;
	
	public Product(String nameProduct, int idProduct, int[] locationProduct)
	{
		productName = nameProduct;
		productID = idProduct;
		productLocation = locationProduct;
	}

	public int[] getlocation()
	{
		return productLocation;
	}
	
	public int getproductID()
	{
		return productID;
	}
	
	public static String getproductname()
	{
		return productName;
	}
	
	public void setproductlocation(int[] prodloc)
	{
		productLocation = prodloc;
	}
	
}
