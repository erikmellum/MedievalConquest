/**
 * Room is a class created to hold the players, items, and characters of the game world.
 * It provides methods for changing the rooms attached to it, the items in it, the characters
 * in it, the room number, and finally the name and description.
 *
 * @author Erik Mellum
 * @version 1.0
 */
 
import java.util.*;
import java.io.Serializable;
public class Room implements Serializable
{
	protected String name, description;
	protected int roomNumber;
	protected boolean locked = false;
	protected ArrayList<Item> items;
	protected ArrayList<NPC> NPCs;
	protected String[] options;
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
		name = "Purgatory";
		description = "Not much to do except think";
		northRoom = null;
		southRoom = null;
		eastRoom = null;
		westRoom = null;
		items = new ArrayList<Item>();
		NPCs = new ArrayList<NPC>();
	}
	/**
	 * Overloaded constructor.
	 * Sets default values as follows:
	 * @param newName the new name 
	 * @param newDescription the new String for description
	 * @param newNorthRoom the new North Room of the room
	 * @param newSouthRoom the new South Room of the room
	 * @param newEastRoom the new East Room of the room
	 * @param newWestRoom the new West Room of the room
	 * @param newRoomNumber the new Room number of the room
	 * items to a new arraylist of items
	 * characters to a new arraylist of characters
	 */
	public Room(String newName, String newDescription, Room newNorthRoom, Room newSouthRoom, Room newEastRoom, Room newWestRoom,int newRoomNumber)
	{
		name = newName;
		description = newDescription;
		roomNumber = newRoomNumber;
		northRoom = newNorthRoom;
		southRoom = newSouthRoom;
		eastRoom = newEastRoom;
		westRoom = newWestRoom;
		items = new ArrayList<Item>();
		NPCs = new ArrayList<NPC>();
	}

	/**
	 * Retrieve the name of the room
	 * @return name the name of the room
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Set the name of the room
	 * @param newName a new name for the room
	 */
	public void setName(String newName)
	{
		name = newName;
	}
	/**
	 * Retrieve the description of the room
	 * @return description the description of the room
	 */
	public String getDescription()
	{
		return description;
	}
	/**
	 * Sets the boolean locked of the room
	 * @param theLock the boolean for whether the room is locked or not
	 */
	public void setLocked(boolean theLock)
	{
		locked = theLock;
	}
	/**
	 * Retrieve the boolean locked of the room
	 * @return locked the boolean for whether the room is locked or not
	 */
	public boolean getLocked()
	{
		return locked;
	}
	/**
	 * Sets the room number of the room
	 * @param newRoomNumber the new int room number of the room
	 */
	public void setRoomNumber(int newRoomNumber)
	{
		roomNumber = newRoomNumber;
	}
	/**
	 * retrievs the room number of the room
	 * @return newRoomNumber the new int room number of the room
	 */
	public int getRoomNumber()
	{
		return roomNumber;
	}
	/**
	 * retrieves the size of the list of characters in the room
	 * @return characters.size() the size of the list of characters
	 */
	public int getNPCsSize()
	{
		return NPCs.size();
	}
	/**
	 * retrieves the size of the list of items in the room
	 * @return items.size() the size of the list of items
	 */
	public int getItemsSize()
	{
		return items.size();
	}
	/**
	 * retrieves the arraylist of items in the room
	 * @return items the entire arraylist of items in the room
	 */
	public ArrayList<Item> getItems()
	{
		return items;
	}
	/**
	 * Set the description of the room
	 * @param newDescription a new description for the room
	 */
	public void setDescription(String newDescription)
	{
		description = newDescription;
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
	 * retrieves the arraylist of characters in the room
	 * @return characters the entire arraylist of characters in the room
	 */
	public ArrayList<NPC> getNPCs()
	{
		return NPCs;
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
	/**
	 * adds an item to the current room
	 * @param theItem the item to be added to the room
	 */
	public void setItem(Item theItem)
	{
		items.add(theItem);
	}
	/**
	 * sets the arraylist of items in the room to a the provided arraylist of items
	 * @param theItems the new arraylist of items to be added to the room
	 */
	public void setItems(ArrayList<Item> theItems)
	{
		items = theItems;
	}
	/**
	 * gets an item from the current room 
	 * @param theItem the item to be retrieved from to the room
	 * @return tempItem the item that you retrieved
	 */
	public Item getItem(Item theItem)
	{
		Item tempItem = items.get(items.indexOf(theItem));
		items.remove(theItem);
		return tempItem;
	}
	/**
	 * adds a character to the current room.
	 * @param theCharacter the character to be added to the room
	 */
	public void setNPC(NPC theNPC)
	{
		NPCs.add(theNPC);
	}
	/**
	 * retrieves a character from the current room using a character object
	 * @param theCharacter the character to be retrieved from the room
	 * @return characters.get(characters.indexOf(theCharacter)) the character to be retrieved
	 */
	public NPC getNPC(NPC theNPC)
	{
		return NPCs.get(NPCs.indexOf(theNPC));
	}
	/**
	 * retrieves a character from the current room using the index of the character
	 * @param index the index of the character in the list of characters in this room
	 * @return characters.get(index) the character to be retrieved
	 */
	public NPC getNPC(int index)
	{
		return NPCs.get(index);
	}
	/**
	 * removes a character from this room
	 * @param theCharacter the character that will be removed.
	 */
	public void removeNPC(NPC theNPC)
	{
		NPCs.remove(NPCs.indexOf(theNPC));
	}
	/**
	 * Gets a string containing the name description characters and items in the room
	 * @return output the string created with the above variables
	 */
	public String toString()
	{
		String output = name + ": " + description + "\n";
		if (NPCs.size() > +0)
		{
			output += "Characters: " ;
			for(NPC toString: NPCs)
				output += toString.getName() + ", ";
			if (items.size() > 0)
				output += "\n";
		}
		if (items.size() > 0)
		{
			output += "Items: ";
			for(Item toString: items)
				output +=  toString.getName() + ", ";
		}
		return output;
	}
}
/*
REQUIREMENTS

    1. name and a description member variable and set/get method for each 
    2. a pointer/reference to the player object so that when the game is saved the player's location will be saved as well
    3. one ArrayList (from the Java API) that will have "items" in it
    4. a second ArrayList that will have "characters" in it with which the player can interact (if implemented for your game -- not required, but for extra special points)
    5. methods that allow "items" and "characters" to be added to, retrieved from, and removed from the "room"
    6. "doors" to other rooms -- the doors will be pointers/references to other rooms
    7. methods to set and get "doors"
    8. a toString method that shows name, description, where the "doors" go, and what items are present (except "hidden items" if that is a part of your game)
*/