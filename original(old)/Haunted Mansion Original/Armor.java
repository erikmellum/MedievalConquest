/**
 * Armor is-a Item created to allow the user an equippable item to negate the damage taken 
 * It provides methods for changing the rating and getting the rating.
 *
 * @author Erik Mellum
 * @version 1.0
 */
 
import java.io.*;
public class Armor extends Item implements Serializable
{
	
	private int rating;
	/**
	 * Default constructor.
	 * Sets default values as follows:
	 * name to clothes
	 * description to made from tanned deer hide
	 * value to 1
	 * rating to 1
	 */
	public Armor()
	{
		name = "Clothes ";
		description = "Made from tanned deer hide";
		value = 1;
		rating = 1;
	}
	/**
	 * Default constructor.
	 * Sets default values as follows:
	 * name to newName
	 * description to newDescription
	 * value to newValue
	 * rating to newRating
	 */
	public Armor(String newName, String newDescription, int newValue, int newRating)
	{
		name = newName;
		description = newDescription;
		value = newValue;
		rating = newRating;
	}
	/**
	 * Gets the rating this armor
	 * @return rating the rating for this armor
	 */
	public int getRating()
	{
		return rating;
	}
	/**
	 * Sets the rating this armor
	 * @param newRating the new rating for this armor
	 */
	public void setRating(int newRating)
	{
		rating = newRating;
	}
}