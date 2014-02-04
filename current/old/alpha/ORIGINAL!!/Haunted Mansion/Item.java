/**
 * Item is a superclass created to allow the user in the game world to pick up and manipulate
 * an object. Item provides classes to get the name, set the name, get the value and set the value, 
 * and finally to get the description and set the description.
 *
 * @author Erik Mellum
 * @version 1.0
 */
 
import java.io.Serializable;
public class Item implements Serializable
{
	protected String name, description;
	protected int value;
	/**
	 * Default constructor.
	 * Sets default values as follows:
	 * name to item
	 * description to value of 1
	 * value to 1
	 */
	public Item()
	{
		name = "item";
		description = "value of 1";
		value = 1;
	}
	/**
	 * Overloaded constructor.
	 * Sets default values as follows:
	 * name to newName
	 * description to newDescription
	 * value to newValue
	 */
	public Item(String newName, String newDescription, int newValue)
	{
		name = newName;
		description = newDescription;
		value = newValue;
	}
	/**
	 * Gets the name of this item
	 * @return name the name for this item
	 */
	public String getName()
	{
		return name;
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
	 * Gets the value of this item
	 * @return value the value for this item
	 */
	public int getValue()
	{
		return value;
	}
	/**
	 * Sets the name of this item
	 * @param newName the name for this item
	 */
	public void setName(String newName)
	{
		name = newName;
	}
	/**
	 * Sets the description of this item
	 * @param description the description for this item
	 */
	public void setDescription(String newDescription)
	{
		description = newDescription;
	}
	/**
	 * Sets the value of this item
	 * @param value the value for this item
	 */
	public void setValue(int newValue)
	{
		value = newValue;
	}
	/**
	 * Returns a string containing all the info about this Item
	 * @return toString the built string with the name description and value of the item
	 */
	public String toString()
	{
		String toString ="Name: " + name + "\nDescription: " + description +"\nValue: " + value;
		return toString;
	}
}
/*
REQUIREMENTS

    1. an "item" class hierarchy (using inheritance) that is a minimum of two (2) "generations" deep -- we will discuss in class; items will have:

    2. a minimum of one (1) member variable with set/get method (every member variable you add must have a set/get method to go with it)
    3. a toString method that displays important information about the item

*/