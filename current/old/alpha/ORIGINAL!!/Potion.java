/**
 * Potion is-a Item created for the purpose of creating consumable items with different effects. 
 * It provides methods for changing the rating, and effect of the potion
 *
 * @author Erik Mellum
 * @version 1.0
 */
 
import java.util.*;
import java.io.*;
public class Potion extends Item implements Serializable
{
	private String effect;
	Random generator;
	private int rating;
	/**
	 * Default constructor.
	 * Sets default values as follows:
	 * name as Healing potion
	 * description as They vary in effectiveness
	 * rating as a random number between 0-19
	 * value as 5
	 */
	public Potion()
	{
		generator = new Random();
		name = "Healing potion";
		description = "They vary in effectiveness";
		effect = "heal";
		rating = generator.nextInt(20);
		value = 5;
	}
	/**
	 * Overloaded constructor.
	 * Sets values as follows:
	 * name as newName
	 * description as newDescription
	 * rating as newRating
	 * value as newValue
	 */
	public Potion(String newName, String newDescription, String newEffect, int newRating, int newValue)
	{
		name = newName;
		description = newDescription;
		effect = newEffect;
		rating = newRating;
		value = newValue;
	}
	/**
	 * Set the value of the rating to a new value.
	 *
	 * @param newRating the new rating. 
	 */
	public void setRating(int newRating)
	{
		rating = newRating;
	}
	/**
	 * Get the rating of the potion
	 *
	 * @return rating the stored rating for this potion.
	 */
	public int getRating()
	{
		return rating;
	}
	/**
	 * Get the effect of the potion
	 *
	 * @return effect the stored effect for this potion.
	 */
	public String getEffect()
	{
		return effect;
	}
	/**
	 * Sets the effect of the rating to a new value.
	 *
	 * @param newEffect the new effect. 
	 */
	public void setEffect(String newEffect)
	{
		effect = newEffect;
	}
}