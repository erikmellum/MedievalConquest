import java.util.HashMap;
import java.io.Serializable; 
public class GameObject
{
	protected String name, description;
	protected int number;
	protected boolean bool;
	protected HashMap<String, GameObject> object;
	public GameObject()
	{
		name = "Stat";
		description = "It's a stat";
		bool = false;
		object = new HashMap<String, GameObject>();
		number =1;
	}
	public HashMap<String, GameObject> getMap()
	{
		return object;
	}
	public GameObject get(String hashValue)
	{
		return object.get(hashValue);
	}
	public GameObject set(String hashValue)
	{
		GameObject container = object.get(hashValue);
		object.remove(hashValue);
		return container;
	}
	public void insert(String hashValue, GameObject newObject)
	{
		object.put(hashValue,newObject);
	}
	public String getName()
	{
		return name;
	}
	public void setName(String newName)
	{
		name = newName;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String newDescription)
	{
		description = newDescription;
	}
	public int getNumber()
	{
		return number;
	}
	public void setNumber(int newNumber)
	{
		number = newNumber;
	}
	public boolean getBool()
	{
		return bool;
	}
	public void setBool(boolean newBool)
	{
		bool = newBool;
	}
}