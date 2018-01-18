package backEnd;

import java.util.ArrayList;

public abstract class Account {
	private ArrayList<UserShare> portfolio;
	private double cash;
	
	public Account(String pName)
	{
		portfolio = new ArrayList<UserShare>();
		cash = 0;
	}
	

}
