import java.util.HashMap; 
import java.io.Serializable;
public class Trader extends Character implements Serializable
{
	protected HashMap<String,GameObject> trader;
	public Trader()
	{
		name = "Trader";
		description = "Greed isn't his only motive";
		number = 1;
		buildTrader();
	}
	public Trader(String newName, String newDescription)
	{
		name = newName;
		description = newDescription;
		number = 1;
		buildTrader();
	}
	public void buildTrader()
	{
		trader = character;
		
	}
}