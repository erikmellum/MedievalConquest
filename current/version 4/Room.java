/**
 * Room is a class created to hold the players, items, and characters of the game world.
 * It provides methods for changing the rooms attached to it, the items in it, the characters
 * in it, the room number, and finally the name and description.
 *
 * @author Erik Mellum
 * @version 1.0
 */
 
import java.util.HashMap; 
import java.io.Serializable;
public class Room extends GameObject
{
	protected HashMap<String, HashMap> room;
	protected HashMap<String, Item> items;
	protected HashMap<String, Character> characters;
	protected Room northRoom;
	protected Room southRoom;
	protected Room eastRoom;
	protected Room westRoom;

	 /**
	 * Default constructor.
	 * Sets default values as follows:
	 */
	public Room()
	{
		name = "Home";
		description = "Not much to do except think";
		number = 0;
		bool = false;		
		createRoom();
	}
	public Room(String newName, String newDescription, Room newNorthRoom, Room newSouthRoom, Room newEastRoom, Room newWestRoom)
	{
		name = newName;
		description = newDescription;
		northRoom = newNorthRoom;
		southRoom = newSouthRoom;
		eastRoom = newEastRoom;
		westRoom = newWestRoom;
		number = 0;
		bool = false;		
		createRoom();
	}
	public void createRoom()
	{
		room = new HashMap<String, HashMap>();
		items = new HashMap<String, Item>();
		characters = new HashMap<String, Character>();
		room.put("Items",items);
		room.put("Characters",characters);
	}
	/**
	 * Sets the north room of the current room
	 * @param theRoom a new room for the north room
	 */
	public void setNorthRoom(Room theRoom)
	{
		northRoom = theRoom;
	}
	/**
	 * Gets the north room of the current room
	 * @return northRoom the north room of this room
	 */
	public Room getNorthRoom()
	{
		return northRoom;
	}
	/**
	 * Sets the south room of the current room
	 * @param theRoom a new room for the south room
	 */
	public void setSouthRoom(Room theRoom)
	{
		southRoom = theRoom;
	}
	/**
	 * Gets the south room of the current room
	 * @return southRoom the south room of this room
	 */
	public Room getSouthRoom()
	{
		return southRoom;
	}
	/**
	 * Sets the east room of the current room
	 * @param theRoom a new room for the east room
	 */
	public void setEastRoom(Room theRoom)
	{
		eastRoom = theRoom;
	}
	/**
	 * Gets the east room of the current room
	 * @return eastRoom the east room of this room
	 */
	public Room getEastRoom()
	{
		return eastRoom;
	}
	/**
	 * Sets the west room of the current room
	 * @param theRoom a new room for the west room
	 */
	public void setWestRoom(Room theRoom)
	{
		westRoom = theRoom;
	}
	/**
	 * Gets the west room of the current room
	 * @return westRoom the west room of this room
	 */
	public Room getWestRoom()
	{
		return westRoom;
	}
	public void addCharacter(Character character)
	{
		characters.put(character.getName(), character);
	}
	public void addItem(Item item)
	{
        if(item != null)
            items.put(item.getName(), item);
	}
	public HashMap<String, Character> getCharacters()
	{
		return characters;
	}
	public HashMap<String, Item> getItems()
	{
		return items;
	}
	/**
	 * Gets a string containing the name description characters and items in the room
	 * @return output the string created with the above variables
	 */
	public String toString()
	{
		String output = name + ": " + description + "\n";
		return output;
	}
}