package backEnd;
/*
 * Publicly traded stocks
 */

public abstract class Stock {
	
	private String name;
	private double price;
	
	public Stock(String symb, double pPrice)
	{
		name = symb;
		price = pPrice;
		
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void changePrice(double change)
	{
		price = change;
	}

}
