/**
 * Attacks is a class created for the purpose of giving weapons attacks with their own damage, name and accuracy 
 * It provides methods for setting and getting the damage name and accuracy.
 *
 * @author Erik Mellum
 * @version 1.0
 */
 
import java.io.*;
import java.util.ArrayList;

public class Attack implements Serializable
{
	CinReader reader = new CinReader();
	private int damage, accuracy, duration, cooldown;
	private String name, effect;
	/**
	 * Default constructor.
	 * Sets default values as follows:
	 * damage to 1
	 * accuracy to 6
	 * name to Swipe
	 */
	public Attack()
	{
		damage = 1;
		effect = "fast";
		name = "Slash";
	}
	/**
	 * Overloaded constructor. 
	 *
	 * @param newDamage the new value for damage
	 * @param newAttack the new value for attack
	 * @param newAccuracy the new value for accuracy
	 */
	public Attack(int newDamage, String newAttack)
	{
		damage = newDamage*2;
		name = newAttack;
	}
	/**
	* Allows you to set the damage of the attack
	* @param newDamage the new damage for the attack
	*/
	public void setDamage(int newDamage)
	{
		damage = newDamage;
	}
	/**
	* Allows you to set the name of the attack
	* @return newName the new name for the attack
	*/
	public void setName(String newName)
	{
		name = newName;
	}
	/**
	* Allows you to get the damage of the attack
	* @return damage the damage for the attack
	*/
	public int getDamage()
	{
		return damage;
	}
	/**
	* Allows you to set the accuracy of the attack
	* @param newAccuracy the new accuracy for the attack
	*/
	/**
	* Allows you to get the name of the attack
	* @return name the name for the attack
	*/
	public String getName()
	{
		return name;
	}
	/**
	 * Gets a string containing the name of the attack
	 * @return output the string created with the above variable
	 */
	public String toString()
	{
		String output = name;
		return output;
	}
}