import java.util.HashMap; 
import java.io.Serializable;
public class Stat extends GameObject
{
	int value;
	public Stat()
	{
		name = "Accuracy";
		description = "How accurate you are";
		value = 1;
	}
	public Stat(String newName, int newValue)
	{
		name = newName;
		value = newValue;
	}
	public Stat(String newName, String newDescription, int newValue)
	{
		name = newName;
		description = newDescription;
		value = newValue;
	}
    public Stat(String newName, String newDescription)
	{
		name = newName;
		description = newDescription;
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