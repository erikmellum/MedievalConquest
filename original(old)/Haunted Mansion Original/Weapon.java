/**
 * Weapon is-a Item created for the purpose of giving the player an equippable Item that does damage. 
 * It provides methods for setting and getting the name, description, value, accuracy, and attacks on the weapon.
 *
 * @author Erik Mellum
 * @version 1.0
 */
 
import java.io.*;
import java.util.*;

public class Weapon extends Item implements Serializable
{
	CinReader reader = new CinReader();
	private int damage, accuracy;
	private ArrayList<Attack> attacks;
	/**
	 * Default constructor.
	 * Sets default values as follows:
	 * name to stick
	 * description to a sturdy branch
	 * value to 1
	 * damage to 1
	 * accuracy to 1
	 * creates 3 attacks and a list to hold them
	 */
	public Weapon()
	{
		name = "Stick";
		description = "A sturdy branch";
		value = 1;
		damage = 1;
		accuracy = 1;
		Attack attack = new Attack(3,(1+accuracy),"Strong attack");
		Attack attack1 = new Attack(2,(4+accuracy),"Balanced attack");
		Attack attack2 = new Attack(1,(8+accuracy),"Accurate attack");
		attacks = new ArrayList<Attack>();
		attacks.add(attack);
		attacks.add(attack1);
		attacks.add(attack2);
	}
	/**
	 * Overloaded Constructor.
	 * Sets values as follows:
	 * @param newName the new name
	 * @param newDescription the new description
	 * @param newValue the new value
	 * @param newDamage the new damage
	 * @param newAccuracy the new accuracy
	 * creates 3 attacks and a list to hold them
	 */
	public Weapon(String newName, String newDescription, int newValue, int newDamage, int newAccuracy, String name1, String name2, String name3)
	{
		name = newName;
		description = newDescription;
		value = newValue;
		damage = newDamage;
		attacks = new ArrayList<Attack>();
		Attack attack = new Attack(3,(1+accuracy),name1);
		Attack attack1 = new Attack(2,(4+accuracy),name2);
		Attack attack2 = new Attack(1,(8+accuracy),name3);
		attacks.add(attack);
		attacks.add(attack1);
		attacks.add(attack2);
	}
	/**
	 * Method allows you to add a new attack to the weapon
	 * @param newAttack the new attack to be set
	 */
	public void addAttack(Attack newAttack)
	{
		attacks.add(newAttack);
	}
	/**
	 * Method allows you to check how many attack a weapon has
	 * @return attacks.size() the size of the list of attacks
	 */
	public int getAttacksSize()
	{
		return attacks.size();
	}
	/**
	 * Method allows you to get an attack from the list of attacks on a weapon
	 * @param index the index of the attack you would like returned
	 * @return attacks.get(index) the attack you selected to be returned
	 */
	public Attack getAttack(int index)
	{
		return attacks.get(index);
	}
	/**
	 * Method allows you to remove an attack from the list of attacks
	 * @param newAttack the provided attack you would like to remove from the list of attacks
	 */
	public void removeAttack(Attack newAttack)
	{
		attacks.remove(newAttack);
	}
	/**
	 * Method allows you to select an attack and return its index
	 * @return choice the attack you selected to be returned index will be stored into choice
	 */
	public int selectAttack()
	{
		int i = 1;
		for(Attack output: attacks)
		{
			System.out.println("[" + i + "] " + output);
			i++;
		}
		System.out.print("\nYour Choice: ");
		int choice = reader.readInt(1,attacks.size())-1;
		return choice;
	}
	/**
	 * Allows you to get the damage of the weapon
	 * @return damage the weapon's damage
	 */
	public int getDamage()
	{
		return damage;
	}
	/**
	 * Allows you to set the damage of the weapon
	 * @param newDamage the new value for the weapon's damage
	 */
	public void setDamage(int newDamage)
	{
		damage = newDamage;
	}
	/**
	 * Compiles a string and gets it containing the important information about the weapon including the toString from the super class Item followed by the damage, attack, and 1st attack name
	 * @return toString the string created as described above
	 */
	public String toString()
	{
		String toString = super.toString() + "\nDamage: "+ damage + "\nAttack: " + attacks.get(0).getName() + "\n";
		return toString;
	}
}