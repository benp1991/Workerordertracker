package WOT;
import java.util.Scanner;

public class Main 
{
	public static Order createorder(int ordID)
	{
		boolean claimed = false;
		boolean porus = false;
		int[] oline = {1,2,3,4,5,6,7,8};
		int totquant = 8;
		Order displayedorder = new Order(ordID, claimed, porus, oline, totquant);
		return displayedorder;
	}
	
	public static Orderline populateorderline()
	{

		int productid = 10011;
		int quantity = 1;
		boolean porus = false;
		Orderline thisorderline = new Orderline(productid, quantity, porus);
		return thisorderline;
	}
	
	public static int[] printorders()
	{
		int[] olist = Ordermanager.getorderlist();
		int olength = olist.length;
		
		System.out.println("Current orders available:");
		for(int i=0; i < olength; i++)
		{
			System.out.println(olist[i]);
		}
		return olist;
		
	}
	
	public static int selectandprintorder(int[] olist)
	{
		int s;
		String orderview, claim;		
		boolean valid = false;
		Scanner reader = new Scanner(System.in);
		System.out.println("Please select order for further details");
		//try 
		//{
			s = reader.nextInt();
		//}
		//catch(java.util.InputMismatchException e)
		//{
		//	System.err.println("Please input valid integer");
		//}
		
		
		int olength = olist.length;
		for(int i=0; i < olength; i++)
		{
			if(olist[i] == s)
			{
				valid = true;
				break;
			}
		}
		
		while(valid == false)
		{
			System.out.println("Please enter valid Order ID");
			s = reader.nextInt();
			for(int i=0; i < olength; i++)
			{
				if(olist[i] == s)
				{
					valid = true;
					break;
				}
			}
			
		}
	
		System.out.println("Order " + s + " selected");
		Order thisorder = createorder(s);
		if(thisorder.getorderclaimed() == true)
		{
			System.out.println("Order Status = claimed");
		}
		else
		{
			System.out.println("Order Status = unclaimed");
		}
		
		if(thisorder.getorderporuswared() == true)
		{
			System.out.println("This order contains Porusware");
		}
		System.out.println("There are "+thisorder.gettotalquant()+" items in this order");
		System.out.println("Do you wish to list the products in this order y/n");
		orderview = reader.next();
		if(orderview.equals("y"))
		{
			System.out.println("Products:");
			int[] olines = thisorder.getorderlines();
			int olinelen = olines.length;
			int[][] orderdets = new int[olinelen][2];
			for(int i=0; i < olinelen; i++)
			{
				Orderline orderline = populateorderline();
				orderdets[i][0] = orderline.getproductID()+i;
				orderdets[i][1] = orderline.getquantity();
				if(orderline.getporuswared() == true)
				{
					System.out.println("Product ID: "+orderdets[i][0] +", Quantity: "+orderdets[i][1]+", Poruswared");
				}
				else
				{
					System.out.println("Product ID: "+orderdets[i][0] +", Quantity: "+orderdets[i][1]);
				}
				
			}
			

		}
		System.out.println("Do you wish to claim this order y/n");
		claim = reader.next();
		if(claim.equals("y"))
		{
			claimorder(s, thisorder);
			if(thisorder.getorderclaimed() == true)
			{
				System.out.println("Order Status = claimed");
			}
			else
			{
				System.out.println("Order Status = unclaimed");
			}
			
			if(thisorder.getorderporuswared() == true)
			{
				System.out.println("This order contains Porusware");
			}
			System.out.println("There are "+thisorder.gettotalquant()+" items in this order");			
		}
		else
		{
			System.out.println("System closing");
		}
		
		reader.close();
		return s;		
		
	}
	
	public static void claimorder(int orderid, Order thisorder)
	{
		thisorder.setasclaimed();
	}
	
	public static void main(String[] args)
	{
		
		int[] orderlist = printorders();
		selectandprintorder(orderlist);
		
		//Menu.startmenu();
		
	}
}
