/**
 * Monster is-a Character created for the purpose of giving the player something to attack
 * Monster only provides constructors, all the methods necessary to use this class are inherited.
 *
 * @author Erik Mellum
 * @version 1.0
 */
 
import java.util.*;
import java.io.*;

public class Monster extends Character implements Serializable
{
	Random generator = new Random();
	/**
	 * Overloaded constructor.
	 * Sets default values as follows:
	 * name to newName
	 * level to newLevel
	 * equippedWeapon to newWeapon
	 * armor to newArmor
	 * quests to a new quest
	 * inventory to a new inventory
	 * health to ((level+10)*3)/2
	 */
	public Monster(String newName, int newLevel, Weapon newWeapon, Armor newArmor)
	{
		name = newName;
		strength = 2;
		generator = new Random();
		level = newLevel;
		armor = newArmor;
		health = (((level+10)*3)/2)+level*3;
		maxHealth = health;		
		inventory = new ArrayList<Item>();
		quests = new ArrayList<Quest>();
		if (level == 1)
		{
			strength = generator.nextInt(12)+1;
			accuracy = generator.nextInt(2)+1;	
		}
		if (level == 2)
		{
			strength = generator.nextInt(3)+2;
			accuracy = generator.nextInt(3)+2;
		}
		if (level == 3)
		{
			strength = generator.nextInt(5)+2;
			accuracy = generator.nextInt(5)+2;
		}
		if (level == 4)
		{
			strength = generator.nextInt(6)+2;
			accuracy = generator.nextInt(6)+2;
		}
		if (level == 5)
		{
			strength = generator.nextInt(8)+3;
			accuracy = generator.nextInt(8)+3;
		}
		if (level == 6)
		{
			strength = generator.nextInt(9)+4;
			accuracy = generator.nextInt(9)+4;
		}
		if (level == 7)
		{
			strength = generator.nextInt(10)+4;
			accuracy = generator.nextInt(10)+4;
		}
		if (level == 8)
		{
			strength = generator.nextInt(11)+4;
			accuracy = generator.nextInt(11)+4;
		}
		equippedWeapon = newWeapon;
	}
	
}