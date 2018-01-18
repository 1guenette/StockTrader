package backEnd;

public class UserShare 
{
	private double sellPoint;
	private double buyPoint;
	private Stock stock;
	private double initPrice;
	private int amount;
	
	
	public UserShare(Stock stockChoice, double sellPrice, double buyPrice, double initialPrice, int quantity)
	{
		stock = stockChoice;
		sellPoint = sellPrice;
		buyPoint = buyPrice;
		initPrice = initialPrice;
		amount = quantity;
	}
	
	public double sell()
	{
		return stock.getPrice();
	}
	
	public void buy()
	{
		
	}

}
