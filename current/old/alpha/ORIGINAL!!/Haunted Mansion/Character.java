/**
 * Character is a class created to allow the user in the game world to interact with a personified object. They have responses
 * and sometimes quests. There are children of Character that allow monsters and traders to be implemented into the world.
 * It provides methods for setting and getting the name, responses, health, maxHealth, level, strength, roomNumber, responseCounter, 
 * accuracy, credits, weapons, armor, inventory and quests.
 *
 * @author Erik Mellum
 * @version 1.0
 */
import java.util.*;
import java.io.Serializable;
public class Character implements Serializable
{

	protected String name;
	protected String[] responses;	
	protected int health, maxHealth, speed, toughness, level, strength, roomNumber, responseCounter, accuracy, credits;
	protected Weapon equippedWeapon;
	protected Armor armor;
	CinReader reader = new CinReader();
	protected ArrayList<Item> inventory;
	protected ArrayList<Quest> quests;
	/**
	* Default Constructor.
	* Sets name to greg
	* health to 10
	* credits to 10
	* accuracy to 1
	* maxHealth to 10
	* level to 1
	* strength to 1
	* roomNumber to 1
	* weapon to a default weapon
	* armor to default armor
	* responseCounter to 0
	* a new inventory and questlist
	*/
	public Character()
	{
		name = "greg";
		health = 10;
		credits = 10;
		accuracy = 1;
		maxHealth = 10;
		level = 1;
		strength = 1;
		roomNumber = 1;
		equippedWeapon = new Weapon();
		armor = new Armor();
		responseCounter = 0;
		inventory = new ArrayList<Item>();
		quests = new ArrayList<Quest>();
	}
	/**
	* Overloaded Constructor.
	* @param newName a new name for the character
	* health to 10
	* credits to 10
	* accuracy to 1
	* maxHealth to 10
	* level to 1
	* strength to 1
	* roomNumber to 1
	* weapon to a default weapon
	* armor to default armor
	* responseCounter to 0
	* a new inventory and questlist
	*/
	public Character(String newName)
	{
		name = newName;
		health = 10;
		credits = 10;
		roomNumber = 1;
		maxHealth = health;
		accuracy = 1;
		equippedWeapon = new Weapon();
		armor = new Armor();
		responses = new String[1];
		responses[0] = "I have nothing to say to you.";
		responseCounter = 0;
		level = 1;
		strength = 1;
		inventory = new ArrayList<Item>();
		quests = new ArrayList<Quest>();
	}
	/**
	* Overloaded Constructor.
	* @param newName a new name for the character
	* health to 10
	* credits to 10
	* accuracy to 1
	* maxHealth to 10
	* @param newLevel the new level for the Character
	* strength to 1
	* roomNumber to 1
	* weapon to a default weapon
	* armor to default armor
	* responseCounter to 0
	* a new inventory and questlist
	*/
	public Character(String newName, int newLevel)
	{
		name = newName;
		level = newLevel;
		credits = 10;
		health = 10;
		armor = new Armor();
		accuracy = 1;
		health = health*level;
		maxHealth = health;
		equippedWeapon = new Weapon();
		responses = new String[1];
		responses[0] = "I have nothing to say to you!";
		responseCounter = 0;
		strength = 1+newLevel;
		inventory = new ArrayList<Item>();
		quests = new ArrayList<Quest>();
	}
	/**
	* Allows you to get the armor from the Character
	* @return armor the armor the character has
	*/
	public Armor getArmor()
	{
		return armor;
	}
	/**
	* Allows you to set the accuracy of the character
	* @param newAccuracy the new accuracy for the character
	*/
	public void setAccuracy(int newAccuracy)
	{
		accuracy = newAccuracy;
	}
	/**
	* Allows you to get the accuracy of the character
	* @return accuracy the accuracy for the character
	*/
	public int getAccuracy()
	{
		return accuracy;
	}
	/**
	* Allows you to set the credits of the character
	* @param newCredits the new credits for the character
	*/
	public void setCredits(int newCredits)
	{
		credits = newCredits;
	}
	/**
	* Allows you to get the inventory size of the character
	* @return inventory.size() the inventory size for the character
	*/
	public int getInventorySize()
	{
		return inventory.size();
	}
	public void setSpeed(int newSpeed)
	{
		speed = newSpeed;
	}
	/**
	* Allows you to get the speed the player has
	* @return speed the speed for the player
	*/
	public int getSpeed()
	{
		return speed;
	}
	public void setToughness(int newToughness)
	{
		toughness = newToughness;
	}
	public int getToughness()
	{
		return toughness;
	}
	/**
	* Allows you to Get the credits of the character
	* @return credits the new credits for the character
	*/
	public int getCredits()
	{
		return credits;
	}
	/**
	* Allows you to set the name of the character
	* @return newName the new name for the character
	*/
	public void setName(String newName)
	{
		name = newName;
	}
	/**
	* Allows you to set the responses of the character
	* @param newResponses the new array of Strings that will be the new responses
	*/
	public void setResponses(String[] newResponses)
	{
		responses = newResponses;
	}
	/**
	* Allows you to set the health of the character
	* @param newHealth the new health for the character
	*/
	public void setHealth(int newHealth)
	{
		health = newHealth;
	}
	/**
	* Allows you to set the equipped Weapon of the character
	* @param newEquippedWeapon the new Weapon for the character
	*/
	public void setEquippedItem(Weapon newEquippedWeapon)
	{
		equippedWeapon = newEquippedWeapon;
	}
	/**
	* Allows you to get the max health of the character
	* @return maxHealth the character max health
	*/
	public int getMaxHealth()
	{
		return maxHealth;
	}
	/**
	* Allows you to set the responseCounter for the character
	* @param newResponseCounter the new response counter for the character
	*/
	public void setResponseCounter(int newResponseCounter)
	{
		responseCounter = newResponseCounter;
	}
	/**
	* Allows you to set the level of the character
	* @param newLevel the new level for the character
	*/
	public void setLevel(int newLevel)
	{
		level = newLevel;
	}
	/**
	* Allows you to set the strength of the character
	* @param newStrength the new strength for the character
	*/
	public void setStrength(int newStrength)
	{
		strength = newStrength;
	}
	/**
	* Allows you to add an item to the character's inventory
	* @param newItem the new item to add to the inventory.
	*/
	public void setItem(Item newItem)
	{
		inventory.add(newItem);
	}
	/**
	* Allows you to add a quest to the characters list of quests
	* @param newQuest the new quest to add to the characters list of quests
	*/
	public void addQuest(Quest newQuest)
	{
		quests.add(newQuest);
	}
	/**
	* Allows you to remove a quest from the characters list of quests
	* @param theQuest the quest to remove from the list of the characters quests
	*/
	public void removeQuest(Quest theQuest)
	{
		quests.remove(theQuest);
	}
	/**
	* Allows you to set the characters room number
	* @param newRoomNumber the new room number
	*/
	public void setRoomNumber(int newRoomNumber)
	{
		roomNumber = newRoomNumber;
	}
	/**
	* Allows you to get the response counter of the character
	* @return responseCounter the responseCounter for the character
	*/
	public int getResponseCounter()
	{
		return responseCounter;
	}
	/**
	* Allows you to get a String containing the characters responses based on which one you have already heard. 
	* @return responses[responseCounter] the string that you should see is here :)
	*/
	public String getResponses()
	{
		if(responses[responseCounter] != null)
			return responses[responseCounter];
		else
			setResponseCounter(0);
		return responses[responseCounter];
	}
	/**
	* Allows you to get the list of quests from the character
	* @return quests the characters list of quests
	*/
	public ArrayList<Quest> getQuests()
	{
		return quests;
	}
	/**
	* Allows you to get the list of items from the character
	* @return inventory the characters inventory of items
	*/
	public ArrayList<Item> getInventory()
	{
		return inventory;
	}
	/**
	* Allows you to get the equipped weapon from the character
	* @return equippedWeapon the characters equipped weapon
	*/
	public Weapon getEquippedWeapon()
	{
		return equippedWeapon;
	}
	/**
	* Allows you to get size of the characters quest list
	* @return quests.size() the size of the quests list.
	*/
	public int getQuestsSize()
	{
		return quests.size();
	}
	/**
	* Allows you to get a quest from the list of quests
	* @return quests.get(0) the first quest available in the characters quests list
	*/
	public Quest getQuest()
	{
		if (quests.size() > 0)
		{
			if(quests.get(0) != null)
					return quests.get(0);
			else
				return null;
		}
		return null;
	}	
	/**
	* Allows you to get the health of the character
	* @return health the health of the character
	*/
	public int getHealth()
	{
		return health;
	}
	/**
	* Allows you to get the name of the character
	* @return name the name of the character
	*/
	public String getName()
	{
		return name;
	}
	/**
	* Allows you to get the level of the character
	* @return level the level of the character
	*/
	public int getLevel()
	{
		return level;
	}
	/**
	* Allows you to get the strength of the character
	* @return strength the strength of the character
	*/
	public int getStrength()
	{
		return strength;
	}
	/**
	* Allows you to get the roomNumber of the character
	* @return roomNumber the roomNumber of the character
	*/
	public int getRoomNumber()
	{
		return roomNumber;
	}
	/**
	 * Gets a string containing the name health, maxHealth, level, weapon, and armor
	 * @return output the string created with the name and description.
	 */
	public String toString()
	{
		String output = "============================\nName: " + name + "\nHealth: " + health + "/" + maxHealth + "\nLevel: " + level + "\nWeapon: " + equippedWeapon.getName() + "\nArmor: " + armor.getName() + "\n============================\n";
		return output;
	}
}
