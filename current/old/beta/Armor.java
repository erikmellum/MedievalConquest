/**
 * Armor is-a Item created to allow the user an equippable item to negate the damage taken 
 * It provides methods for changing the protection and getting the protection.
 *
 * @author Erik Mellum
 * @version 1.0
 */
 
import java.io.*;
public class Armor extends Item implements Serializable
{
	
	private int protection;
	/**
	 * Default constructor.
	 * Sets default values as follows:
	 * name to clothes
	 * description to made from tanned deer hide
	 * value to 1
	 * protection to 1
	 */
	public Armor()
	{
		name = "Clothes";
		description = "Hardly any protection, and very itchy.";
		value = 1;
		protection = 1;
	}
	/**
	 * Default constructor.
	 * Sets default values as follows:
	 * name to newName
	 * description to newDescription
	 * value to newValue
	 * protection to newprotection
	 */
	public Armor(String newName, String newDescription, int newValue, int newProtection)
	{
		name = newName;
		description = newDescription;
		value = newValue;
		protection = newProtection;
	}
	/**
	 * Gets the rating this armor
	 * @return protection the protection for this armor
	 */
	public int getProtection()
	{
		return protection;
	}
	/**
	 * Sets the protection this armor
	 * @param newprotection the new protection for this armor
	 */
	public void setProtection(int newProtection)
	{
		protection = newProtection;
	}
}