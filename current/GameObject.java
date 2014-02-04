import java.util.HashMap;
import java.io.Serializable; 
public class GameObject
{
	protected String name, description, room;
	protected int number;
	protected boolean bool;
	public GameObject()
	{
		name = "Typical name of gameobjects";
		description = "What would you expect - it's a game object";
		room = "Home";
		bool = false;
		number = 1;
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
	public String getRoom()
	{
		return room;
	}
	public void setRoom(String newRoom)
	{
		room = newRoom;
	}
}