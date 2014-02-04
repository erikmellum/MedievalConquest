/**
 * Monster is-a Character created for the purpose of giving the player something to attack
 * Monster only provides constructors, all the methods necessary to use this class are inherited.
 *
 * @author Erik Mellum
 * @version 1.0
 */
 
import java.util.*;
import java.io.*;

public class Monster extends NPC implements Serializable
{
	public Monster(int theStyle,int theType,int theLevel)
	{
		name = "Monster";
		description = "Tends to hide in closets.";
		level = theLevel;
		armor = new Armor();	
		weapon = new Weapon();		
		crit = level; evade = level; luck = level;
		switch(theStyle)
		{
			case 1:
				style = "Strong";
				strength = level+6;
				speed = level - 3;
				defense = level;
				accuracy = level - 3;
				health = level;
				maxHealth = health;
			break;
			case 2:
				style = "Fast";
				speed = level + 6;
				strength = level - 3;
				defense = level - 3;
				accuracy = level;
				health = level;
				maxHealth = health;
			break;
			case 3:
				style = "Defensive";
				speed = level - 3;
				strength = level - 3;
				defense = level + 6;
				accuracy = level;
				health = level;
				maxHealth = health;
			break;
			case 4:
				style = "Accurate";
				speed = level - 3;
				strength = level - 3;
				defense = level;
				accuracy = level + 6;
				health = level;
				maxHealth = health;
			break;
			case 5:
				style = "Balanced";
				speed = level ;
				strength = level;
				defense = level;
				accuracy = level;
				health = level;
				maxHealth = health;
			break;
			case 6:
				style = "Tough";
				speed = level;
				strength = level + 3;
				defense = level + 3;
				accuracy = level + 3;
				health = level;
				maxHealth = health;
			break;
			case 7:
				style = "Weak";
				speed = level;
				strength = level - 3;
				defense = level - 3;
				accuracy = level - 3;
				health = level;
				maxHealth = health;
			break;
		}
		switch(theType)
		{
			case 1:
				name = "Human";
			break;
			case 2:
				name = "Goblin";
			break;
			case 3:
				name = "Orc";
			break;
			case 4:
				name ="Bear";
			break;
			case 5:
				name = "Elf";
			break;
			case 6:
				name = "Wizard";
			break;
			case 7:
				name = "Knight";
			break;
			default:
			break;
		}
	}
	public Monster()
	{
		name = "monster";
		description = "Tends to hide in closets.";
		level = 20;
		mana = 144; energy = 144; health = 144; maxHealth = 144;
		armor = new Armor();	
		weapon = new Weapon();		
		strength = level; crit = level; speed = level; defense = level; accuracy = level; evade = level; luck = level;
	}
	public Monster(int newLevel, String newName, String newDescription, Weapon newWeapon, Armor newArmor)
	{
		name = newName;
		level = newLevel;
		armor = newArmor;	
		weapon = newWeapon;
		description = newDescription;
		strength = level;
		crit = level;
		speed = level;
		energy = level;
		mana = level;
		defense = level;
		accuracy = level;
		health = level*10;
		maxHealth = health;
		evade = level;
		luck = level;
	}
	
}