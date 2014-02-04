/**
 * Armor is-a Item created to allow the user an equippable item to negate the damage taken 
 * It provides methods for changing the protection and getting the protection.
 *
 * @author Erik Mellum
 * @version 1.0
 */
import java.util.HashMap; 
import java.io.Serializable;
public class Armor extends Equippable
{
	protected HashMap<String, HashMap> armor;
    
	public Armor()
	{
		name = "Clothes";
		description = "Hardly any protection, and very itchy.";
		location = "Chest";
		equippable = true;
		droppable = true;
		buildArmor();
	}
	public Armor(String newName, String newLocation)
	{
		name = newName;
		description = "No Description";
		location = newLocation;
		equippable = true;
		droppable = true;
		buildArmor();
	}
	public Armor(String newName, String newDescription, String newLocation)
	{
		name = newName;
		description = newDescription;
		location = newLocation;
		equippable = true;
		droppable = true;
		buildArmor();
	}
    public Armor(String newName, String newDescription, String newLocation, int protection, int value, int weight, int number, int level, int quantity, int type)
    {
        equip = armor = new HashMap<String, HashMap>();
        name = newName;
        description = newDescription;
        location = newLocation;
        stats.put("Protection",new Stat("Protection",protection));
		stats.get("Value").setValue(value);
		stats.get("Weight").setValue(weight);
		stats.get("Number").setValue(number);
		stats.get("Level").setValue(level);
		stats.get("Quantity").setValue(quantity);
        stats.put("Type",new Stat("Type",type));
    }
    public Armor(String newName, String newDescription, String newLocation, HashMap<String, Effect> newEffects, HashMap<String, Augment> newAugments, HashMap<String, Enchant> newEnchants, int protection, int value, int weight, int number, int level, int quantity, int type)
    {
        equip = armor = new HashMap<String, HashMap>();
        name = newName;
        description = newDescription;
        location = newLocation;
        effects = newEffects;
        augments = newAugments;
        enchants = newEnchants;
        stats.put("Protection",new Stat("Protection",protection));
		stats.get("Value").setValue(value);
		stats.get("Weight").setValue(weight);
		stats.get("Number").setValue(number);
		stats.get("Level").setValue(level);
		stats.get("Quantity").setValue(quantity);
        stats.put("Type",new Stat("Type",type));
    }
	public void buildArmor()
	{
        equip = armor = new HashMap<String, HashMap>();
		stats.put("Protection",new Stat("Protection",1));
		stats.get("Value").setValue(1);
		stats.get("Weight").setValue(1);
		stats.get("Number").setValue(1);
		stats.get("Level").setValue(1);
		stats.get("Quantity").setValue(1);	
	}
}