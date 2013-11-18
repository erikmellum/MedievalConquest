import java.util.*;
public class NPC
{
	Random generator = new Random();
	protected String name, description, style, type;
	protected Weapon weapon;
	protected Armor armor;
	protected int health, maxHealth, level, strength, accuracy, evade, crit, luck, defense, speed, energy, mana, coins;
	protected ArrayList<Item> inventory;
	public NPC()
	{
		name = "npc";
		mana = 144; energy = 144;
		description = "a character in the game";
		inventory = new ArrayList<Item>();
	}
	/**
	* Allows you to set the speed the player has
	* @param newSpeed the new speed for the player
	*/
	public void setSpeed(int newSpeed)
	{
		speed = newSpeed;
	}
	public int getHealth()
	{
		return health;
	}
	public void setHealth(int newHealth)
	{
		health = newHealth;
	}
	public int getMaxHealth()
	{
		return maxHealth;
	}
	public void setStrength(int newStrength)
	{
		strength = newStrength;
	}
	public int getCrit()
	{
		crit = 0;
		crit += luck;
		return crit;
	}
	public void setCrit(int newCrit)
	{
		crit = newCrit;
	}
	public void setAccuracy(int newAccuracy)
	{
		accuracy = newAccuracy;
	}
	/**
	* Allows you to get the accuracy of the player
	* @return newAccuracy the accuracy for the player
	*/
	public int getAccuracy()
	{
		return accuracy;
	}
	/**
	* Allows you to get the strength of the player
	* @return strength the strength of the player
	*/
	public int getStrength()
	{
		return strength;
	}
	/**
	* Allows you to get the speed the player has
	* @return speed the speed for the player
	*/
	public int getSpeed()
	{
		return speed;
	}
	/**
	* Allows you to get the equipped weapon from the player
	* @return equippedWeapon the player equipped weapon
	*/
	public Weapon getWeapon()
	{
		return weapon;
	}
		/**
	* Allows you to get the equipped armor from the player
	* @return armor the player's equipped armor
	*/
	public Armor getArmor()
	{
		return armor;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String newName)
	{
		name = newName;
	}
	public void setDefense(int newDefense)
	{
		defense = newDefense;
	}
	public int getDefense()
	{
		return defense;
	}
	public void setEvade(int newEvade)
	{
		evade = newEvade;
	}
	public int getEvade()
	{
		return evade;
	}
	public void setLuck(int newLuck)
	{
		luck = newLuck;
	}
	public int getLuck()
	{
		return luck;
	}
	public void setMana(int newMana)
	{
		mana = newMana;
	}
	public int getMana()
	{
		return mana;
	}
	public void setEnergy(int newEnergy)
	{
		energy = newEnergy;
	}
	public int getEnergy()
	{
		return energy;
	}
	public int getLevel()
	{
		return level;
	}
	/**
	* Allows you to set the level of the player
	* @param newLevel the level of the player
	*/
	public void setLevel(int newLevel)
	{
		level = newLevel;
	}
	
	/**
	 * Gets the description of this item
	 * @return description the description for this item
	 */
	public String getDescription()
	{
		return description;
	}
	/**
	 * Sets the description of this item
	 * @param description the description for this item
	 */
	public void setDescription(String newDescription)
	{
		description = newDescription;
	}
	
}