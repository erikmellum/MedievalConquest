/**
 * Item is a superclass created to allow the user in the game world to pick up and manipulate
 * an object. Item provides classes to get the name, set the name, get the value, set the value, 
 * get equippable, set equippable, get droppable, set droppable, a unique item number with set,
 * and gets, level of the item if necessary, and finally to get the description and set the description.
 *
 * @author Erik Mellum
 * @version 1.0
 */
import java.util.HashMap; 
import java.io.Serializable;
public class Item extends GameObject
{
	protected HashMap<String, HashMap> item;
	protected HashMap<String, Stat> stats;
	protected boolean equippable, droppable;
	/**
	 * Default constructor.
	 * Sets default values as follows:
	 * name to item
	 * description to value of 1
	 * value to 1
	 * equippable to false
	 */
	public Item()
	{
		name = "item";
		description = "just a regular item made of 0s and 1s";
		equippable = false;
		droppable = false;
		buildItem();
	}
	/**
	 * Overloaded constructor.
	 * Sets default values as follows:
	 * name to newName
	 * description to newDescription
	 * value to newValue
	 */
	public Item(String newName, String newDescription)
	{
		name = newName;
		description = newDescription;
		equippable = false;
		droppable = false;
		buildItem();
	}
	public Item(String newName, String newDescription, int newQuantity)
	{
		name = newName;
		description = newDescription;
		equippable = false;
		droppable = false;
		buildItem();
		stats.get("Quantity").setValue(newQuantity);
	}
	public void buildItem()
	{
		item = new HashMap<String, HashMap>();
		stats = new HashMap<String, Stat>();
		item.put("Stats",stats);
		stats.put("Value",new Stat("Value",1));
		stats.put("Weight",new Stat("Weight",1));
		stats.put("Number",new Stat("Number",1));
		stats.put("Level",new Stat("Level",1));
		stats.put("Quantity",new Stat("Quantity",1));
		stats.put("Max",new Stat("Max",1));
        stats.put("Type",new Stat("Typename",1));
	}
	/**
	 * Gets the equippable boolean of this item
	 * @return equippable the boolean flag for this item being equippable
	 */
    public HashMap<String, HashMap> get()
    {
        return item;
    }
    public void set(HashMap<String, HashMap> newItem)
    {
        item = newItem;
    }
    public HashMap<String, Stat> getStats()
    {
        return stats;
    }
    public void setStats(HashMap<String, Stat> newStats)
    {
        stats = newStats;
    }
    public Stat getStat(String key)
    {
        return stats.get(key);
    }
    public void setStat(String key, Stat newStat)
    {
        stats.put(key, newStat);
    }
	public boolean getEquippable()
	{
		return equippable;
	}
	/**
	 * Sets the equippable boolean of this item
	 * @param newEquippable the equippable boolean for this item
	 */
	public void setEquippable(boolean newEquippable)
	{
		equippable = newEquippable;
	}
	public boolean getDroppable()
	{
		return droppable;
	}
	public void setDroppable(boolean newDroppable)
	{
		droppable = newDroppable;
	}
	/**
	 * Returns a string containing all the info about this Item
	 * @return toString the built string with the name description and value of the item
	 */ 
	public String toString()
	{
		String toString ="Name: " + name + "\nDescription: " + description;
		return toString;
	}
}