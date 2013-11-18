import java.util.HashMap; 
import java.io.Serializable;
public class Stat extends GameObject
{
	protected HashMap<String, GameObject> stat;
	int value;
	String valueName;
	public Stat()
	{
		name = "Accuracy";
		description = valueName;
		value = 1;
		buildStat();
	}
	public Stat(String newName, int newValue)
	{
		name = newName;
		value = newValue;
		buildStat();
	}
	public Stat(String newName, String newValueName, int newValue)
	{
		name = newName;
		value = newValue;
		valueName = newValueName;
		buildStat();
	}
	public void buildStat()
	{
		stat = object;
	}
	public String getValueName()
	{
		return valueName;
	}
	public void setValueName(String newValueName)
	{
		valueName = newValueName;
	}
	public int getValue()
	{
		return value;
	}
	public void setValue(int newValue)
	{
		value = newValue;
	}
	public void add(int valueToAdd)
	{
		value += valueToAdd;
	}
	public void lower(int valueToLower)
	{
		value -= valueToLower;
	}
}