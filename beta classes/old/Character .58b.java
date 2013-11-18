import java.util.*;
public class Character
{
	Random generator = new Random();
	protected String name, description;
	protected Dialogue responses;
	protected BodyPart[] body;
	protected ArrayList<Attribute> attributes;
	protected ArrayList<Skill> skills;
	protected ArrayList<Effect> effects;
	protected ArrayList<Ability> abilities;
	protected ArrayList<Quest> quests;
	//protected Attribute health, maxHealth, level, strength, accuracy, evade, crit, luck, defense, speed, energy, mana, coins;
	protected ArrayList<Item> inventory;
	
	
	public Character()
	{
		name = "Greg";
		description = "Just a regular guy living in a binary world";
		responses = new Dialogue;
		body = buildBody();
		attributes = buildAttributes();
		skills = new ArrayList<Skill>;
		effects = description ArrayList<Effect>;
		abilities = new ArrayList<Ability>;
		quests = new ArrayList<Quest>;
		inventory = new ArrayList<Item>();
	}
	public BodyPart[] buildBody()
	{
		BodyPart[] body = new BodyPart[13];
		body[0] = new BodyPart("Head",true,false);
		body[1] = new BodyPart("Chest",true,false);
		body[2] = new BodyPart("Legs",true,false);
		body[3] = new BodyPart("Feet",true,false);
		body[4] = new BodyPart("Arms",true,false);
		body[5] = new BodyPart("Waist",true,false);
		body[6] = new BodyPart("Left Hand",false,true);
		body[7] = new BodyPart("Right Hand",false,true);
		body[8] = new BodyPart("Hands",true,false);
		body[9] = new BodyPart("Back",true,false);
		body[10] = new BodyPart("Neck",true,false);
		body[11] = new BodyPart("Left Finger",true,false);
		body[12] = new BodyPart("Right Finger",true,false);
		return body;
	}
	public Attribute[] buildAttributes()
	{
		Attribute[] attributes = new Attribute[11];
		attributes[0] = new Attribute("Health","Your hit points",1,10);
		attributes[1] = new Attribute("Mana","Magic casting resource",1,10);
		attributes[2] = new Attribute("Energy","Physical ability resource",1,10);
		attributes[3] = new Attribute("Power","Damage with attacks",1,1);
		attributes[4] = new Attribute("Accuracy","Chance to hit",1,1);
		attributes[5] = new Attribute("Toughness","Health regeneration / Physical damage reduction",1,1);
		attributes[6] = new Attribute("Dexterity","Energy regeneration / Dodge chance",1,1);
		attributes[7] = new Attribute("Speed","Global cooldowns",1,1);
		attributes[8] = new Attribute("Stealth","Ability to remain hidden",1,1);
		attributes[9] = new Attribute("Concentration","Mana regeneration / magical resistance",1,1);
		attributes[10] = new Attribute("Crit","Chance to hit criticals",1,1);
		return attributes;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String newName)
	{
		name = newName;
	}
	/**
	 * Gets the description of this character
	 * @return description the description for this character
	 */
	public String getDescription()
	{
		return description;
	}
	/**
	 * Sets the description of this character
	 * @param description the description for this character
	 */
	public void setDescription(String newDescription)
	{
		description = newDescription;
	}
	/**
	 * Gets the dialogue for this character
	 * @return the first available unheard dialogue, or the default response
	 */
	public String getResponse()
	{
		return responses.getResponse();	
	}
	public Weapon getWeapon(String location)
	{
		for(
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
	
	
	
}