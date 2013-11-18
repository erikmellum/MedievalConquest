import java.util.*;
public class Player
{
	Random generator = new Random();
	CinReader reader = new CinReader();
	private String name;
	 
	private Skill health, maxHealth, experience, experiencedNeeded, level, morality, strength, accuracy, evade, luck, crit, defense, speed, energy, mana, damage, coins;
	private Weapon weapon;
	private Armor armor;
	private ArrayList<Item> inventory;
	private ArrayList<Skill> skills;
	private ArrayList<Quest> quests;
	public Player()
	{
		name = "greg";
		weapon = new Weapon("Bronze Longsword","A long two handed sword",1,1,1,1,1,1,1,1);
		armor = new Armor();
		inventory = new ArrayList<Item>();
		quests = new ArrayList<Quest>();
		skills = new ArrayList<int>();
		health = new Skill("Health","How much health you currently have",1,10);
		experience = new Skill("Experience","How much experience you currently have",0,10);
		level = new Skill("Level","Your overall level",5);
		morality = new Skill("Morality","Your alignment towards good or evil",0);
		strength = new Skill("Strength","Your power with melee attacks",10);
		accuracy = new Skill("Accuracy","Your likeliness to hit with all attacks",10);
		evade = new Skill("Evade","Your ability to dodge incoming attacks",10);
		luck = new Skill("Luck","Your luckiness",10);
		crit = new Skill("Crit","Your burst damage potential",10);
		defense = new Skill("Defense","Your defensive ability",10);
		speed = new Skill("Speed","Your quickness",10);
		energy = new Skill("Energy","Your amount of energy",10);
		mana = new Skill("Mana","Your resource for casting spells",10);
		damage = new Skill("Damage","The amount of damage you deal",0);
		skills.add(health);
		skills.add(max
	}
	public int getExperienceNeeded()
	{
		return experienceNeeded;
	}
	public void setExperienceNeeded(int newExperienceNeeded)
	{
		experienceNeeded = newExperienceNeeded;
	}
	public void setDamage(int newDamage)
	{
		damage = newDamage;
	}
	public int getDamage()
	{
		damage = 0;
		damage += strength;
		return damage;
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
	public void setDefense(int newDefense)
	{
		defense = newDefense;
	}
	public void setMorality(int newMorality)
	{
		morality = newMorality;
	}
	public int getMorality()
	{
		return morality;
	}
	public void setMana(int newMana)
	{
		mana = newMana;
	}
	public int getDefense()
	{
		return defense;
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
	/**
	* Allows you to set the speed the player has
	* @param newSpeed the new speed for the player
	*/
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
	/**
	* Allows you to get the coins the player has
	* @return coins the amount of coins for the player
	*/
	public int getCoins()
	{
		return coins;
	}
	/**
	* Allows you to get the inventory arraylist of items of the player
	* @return inventory the inventory for the player
	*/
	public ArrayList<Item> getInventory()
	{
		return inventory;
	}
	public void setCoins(int newCoins)
	{
		coins = newCoins;
	}
	/**
	* Allows you to get the quests size of the player
	* @return quests.size() the quests size for the player
	*/
	public int getQuestsSize()
	{
		return quests.size();
	}

	/**
	* Allows you to get the inventory size of the player
	* @return inventory.size() the inventory size for the player
	*/
	public int getInventorySize()
	{
		return inventory.size();
	}
	/**
	* Allows you to get the list of quests from the player
	* @return quests the player list of quests
	*/
	public ArrayList<Quest> getQuests()
	{
		return quests;
	}
	/**
	* Allows you to get the max health of the player
	* @return maxHealth the players max health
	*/
	public int getMaxHealth()
	{
		return maxHealth;
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
	/**
	* Allows you to get the list of items from the player
	* @return inventory the player inventory of items
	*/
	public ArrayList<Item> getItems()
	{
		return inventory;
	}
	/**
	* Allows you to add an item to the players inventory
	* @param theItem the new item that will be added to the inventory
	*/
	public void addItem(Item theItem)
	{
		inventory.add(theItem);
		System.out.println(theItem.name + " has been added to your inventory!");
	}
	/**
	 * Displays the inventory of the player and allows you to select the item you will be selling.
	 * @return choice the index of the players inventory that contains the item you select
	 */
	public int showInventory()
	{	
		int i = 0;
		for(Item output: inventory)
		{
			i++;
			System.out.println("[" + i + "] " + output.getName() + ":  costs: " + output.getValue());  
		}
		System.out.print("\nYour Choice: ");
		int choice = reader.readInt(1,i);
		return choice;
	}
	/**
	* Allows you to remove an item from the players inventory
	* @param theItem the item that will be removed from the inventory
	*/
	public void removeItem(Item theItem)
	{
		inventory.remove(theItem);
		System.out.println(theItem.name + " has been removed from your inventory!");
	}
	/**
	* Allows you to set the accuracy of the player
	* @param newAccuracy the new accuracy for the player
	*/
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
	* Allows you to add a quest to the player
	* @param theQuest the new quest that will be added
	*/
	public void addQuest(Quest theQuest)
	{
		quests.add(theQuest);
		System.out.println("You are now on the quest: " + theQuest.getName());
	}
	/**
	* Allows you to remove a quest from the player
	* @param theQuest the quest that will be removed
	*/
	public void removeQuest(Quest theQuest)
	{
		quests.remove(theQuest);
		System.out.println("You are no longer on this quest!");
	}
	/**
	* Provides a leveling feature to the game. When you level up the strength accuracy and health all go up 
	* you also get to choose between the three stats for an additional boost.
	*/
	public void levelUp()
	{
		level++;
		strength++;
		accuracy++;
		health+=5;
		maxHealth = health;
		System.out.println("You have leveled up!");
		System.out.println("Your new level is " + level);
		System.out.println("Would you like to increase your health or strength?\n");
		System.out.println("[1] Health");
		System.out.println("[2] Strength");
		System.out.println("[3] Accuracy\n");
		System.out.print("Your Choice: ");
		int choice = reader.readInt();
		if (choice == 1)
			maxHealth+=5;
		if (choice == 2)
			strength+=2;
		if (choice == 3)
			accuracy+=3;
		System.out.println("Good choice!");
		health = maxHealth;
	}
	/**
	* Allows you to view the toString info about any particular item. You get to choose the item
	*/
	public void viewItems()
	{
		int i = 0;
		if (inventory.size() > 0)
		{
			for (Item output: inventory)
			{
				i++;
				System.out.println("[" + i + "] " + output.getName());
			}
			System.out.print("\nYour Choice: ");
			int choice = (reader.readInt(1,inventory.size())-1);
			System.out.println(inventory.get(choice));	
		}
	}
	/**
	* Allows you to view quests that you have undertaken but not completed
	*/
	public void viewQuests()
	{
		int i = 0;
		if (quests.size() > 1)
		{
			for (Quest output: quests)
			{
				i++;
				System.out.println("[" + i + "] " + output.getName());
			}
			System.out.print("\nYour Choice: ");
			int choice = reader.readInt(1,inventory.size());
			System.out.println(quests.get(choice-1));
		}
		else
			System.out.println(quests.get(0));
		
	}
	/**
	* Allows you to select a weapon from the inventory
	* @return theWeapon the weapon that you selected to be returned.
	*/
	public Weapon selectWeapon()
	{
		Weapon theWeapon = null;
		if (inventory.size() > 0)
		{
			for(Item theItem: inventory)
			{
				if (theItem instanceof Weapon)
				{
					System.out.println("[" + (inventory.indexOf(theItem)+1) + "] " + theItem.getName());
				}
			}
			System.out.print("\nYour Choice: ");
			int choice = reader.readInt()-1;
			theWeapon = (Weapon)inventory.get(choice);
		}
		else
			return null;
		return theWeapon;
		
	}
	/**
	* Allows you to select any item from the inventory
	* @return inventory.get(choice-1) the choice you selected will be used to help retrieve the item you selected
	*/
	public Item selectItem()
	{	
		int choice;
		if (inventory.size() > 0)
		{
			int i = 0;
			for (Item getItem: inventory)
			{
				System.out.println("[" + (i+1) + "] " + getItem.getName());
				i++;
			}			
			System.out.print("\nYour Choice: ");
			choice = reader.readInt(1,inventory.size());
		}
		else
			return null;
		return inventory.get(choice-1);
	}
	/**
	* Allows you to set your equipped weapon to a new weapon
	* @param newWeapon the new weapon you will have equipped
	*/
	public void setWeapon(Weapon newWeapon)
	{
		if (weapon != null)
		{
			Weapon tempWeapon = weapon;
			weapon = newWeapon;
			inventory.add(tempWeapon);
		}
		if (weapon == null)
			weapon = newWeapon;
		inventory.remove(newWeapon);
		System.out.println("Your " + newWeapon.getName() + " has been equipped!");
	}
	/**
	* Allows you to set your equipped armor to a new armor
	* @param newArmor the new armor you will have equipped
	*/
	public void setArmor(Armor newArmor)
	{
		if (weapon != null)
		{
			Armor tempArmor = armor;
			armor = newArmor;
			inventory.add(tempArmor);
		}
		if (armor == null)
			armor = newArmor;
		inventory.remove(newArmor);
		System.out.println("Your " + newArmor.getName() + " has been equipped!");
	}
	/**
	* Allows you to get the health of the player
	* @return health the health of the player
	*/
	public int getHealth()
	{
		return health;
	}
	/**
	* Allows you to get the name of the player
	* @return name the name of the player
	*/
	public String getName()
	{
		return name;
	}
	/**
	* Allows you to get the experience of the player
	* @return experience the experience of the player
	*/
	public int getExperience()
	{
		return experience;
	}
	
	/**
	* Allows you to set the strength of the player
	* @param newStrength the strength of the player
	*/
	public void setStrength(int newStrength)
	{
		strength = newStrength;
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
	* Allows you to set the health of the player
	* @param newHealth the health of the player
	*/
	public void setHealth(int newHealth)
	{
		health = newHealth;
	}
	/**
	* Allows you to retrieve an item from the player
	* @return inventory.get(index) the index is supplied by the user
	*/
	public Item getItem(int index)
	{
		if (inventory.get(index) != null)
			return inventory.get(index);
		else 
			return null;
	}
	/**
	* Allows you to set the name of the player
	* @param newName the name of the player
	*/
	public void setName(String newName)
	{
		name = newName;
	}
	/**
	* Allows you to set the experience of the player
	* @param newExperience the experience of the player
	*/
	public void setExperience(int newExperience)
	{
		experience = newExperience;
	}
	/**
	* Allows you to get the level of the player
	* @return level the level of the player
	*/
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
	 * Gets a string containing the name health, maxHealth, level, weapon, and armor
	 * @return toString the string created with the name and description.
	 */
	public String toString()
	{
		String toString = "============================\nName: " + name + "\ncoins: " + coins + "\nHealth: " + health + "/" + maxHealth + "\nStrength: " + strength + "\nAccuracy: " + accuracy + "\nLevel: " + level + "\nWeapon: " + weapon.getName() + "\nArmor: " + armor.getName() + "\n============================\n";
		return toString;
	}
}