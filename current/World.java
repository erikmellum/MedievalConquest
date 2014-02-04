import java.util.HashMap; 
import java.io.Serializable;
public class World
{
	protected HashMap<String, HashMap> world;
	protected HashMap<String, Room> rooms;
	protected HashMap<String, Character> characters;
	protected HashMap<String, Quest> quests;
	protected HashMap<String, Item> items;
	Player user;

	/**
	 * Default constructor
	 * Initialize array of class Animal animals to a length of 3, and int totalAnimals to 0
	 */
	public World()
	{
		createWorld();
	}
	private void createWorld()
	{
		world = new HashMap<String, HashMap>();
		characters = new HashMap<String, Character>();
        rooms = new HashMap<String, Room>();
		quests = new HashMap<String, Quest>();
		items = new HashMap<String, Item>();
		world.put("Characters", characters);
		world.put("Rooms", rooms);
		world.put("Quests", quests);
		world.put("Items", items);
		createQuests();
		createItems();
		createCharacters();
		createRooms();
		user = new Player();
		Room room = new Room();
		room.addCharacter(user);
		user.setRoom(room.getName());
		characters.put("Player",user);
		rooms.put(room.getName(), room);
	}
	private void createRooms()
	{
	}
	private void createQuests()
	{

	}
	private void createCharacters()
	{

	}
	private void createItems()
	{

	}
	public Room getRoom(String key)
	{
		return rooms.get(key);
	}
	public World getWorld()
	{
		return this;
	}
	public Player getPlayer()
	{
		return user;
	}
}
/*
REQUIREMENTS

a class representing the game "world" -- this class will have:

    an array of "rooms" that the player can explore
    the method(s) required to construct the "world" -- all of the code needed to create the "rooms", add "items" and "characters" to them, and add the "rooms" to the array will be in the "world" class
    a method to retrieve the "start room" so that the user interface class can get the game started
*/