/**
 * Armor is-a Item created to allow the user an equippable item to negate the damage taken 
 * It provides methods for changing the protection and getting the protection.
 *
 * @author Erik Mellum
 * @version 1.0
 */
import java.util.HashMap; 
import java.io.Serializable;
public class Armor extends Item
{
	String location, material;
	protected HashMap<String, HashMap> armor;
	protected HashMap<String, Effect> effects;
	protected HashMap<String, Augment> augments;
	protected HashMap<String, Enchant> enchants;
	boolean socketable, enchantable;
    
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
        item = armor = new HashMap<String, HashMap>();
        name = newName;
        description = newDescription;
        location = newLocation;
        effects = new HashMap<String, Effect>();
        augments = new HashMap<String,Augment>();
		enchants = new HashMap<String,Enchant>();
        armor.put("Augments",augments);
		armor.put("Enchants",enchants);
		armor.put("Effects",effects);
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
        item = armor = new HashMap<String, HashMap>();
        name = newName;
        description = newDescription;
        location = newLocation;
        effects = newEffects;
        augments = newAugments;
        enchants = newEnchants;
        armor.put("Augments",augments);
		armor.put("Enchants",enchants);
		armor.put("Effects",effects);
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
        item = armor = new HashMap<String, HashMap>();
		effects = new HashMap<String, Effect>();
        augments = new HashMap<String,Augment>();
		enchants = new HashMap<String,Enchant>();
		armor.put("Augments",augments);
		armor.put("Enchants",enchants);
		armor.put("Effects",effects);
		stats.put("Protection",new Stat("Protection",1));
		stats.get("Value").setValue(1);
		stats.get("Weight").setValue(1);
		stats.get("Number").setValue(1);
		stats.get("Level").setValue(1);
		stats.get("Quantity").setValue(1);	
	}
    public Effect getEffect(String key)
    {
        return effects.get(key);
    }
    public void setEffect(String key, Effect newEffect)
    {
        effects.put(key, newEffect);
    }
    public HashMap<String, Effect> getEffects()
    {
        return effects;
    }
    public void setEffects(HashMap<String, Effect> newEffects)
    {
        effects = newEffects;
    }
    public Augment getAugment(String key)
    {
        return augments.get(key);
    }
    public void setAugment(String key, Augment newAugment)
    {
        augments.put(key,newAugment);
    }
    public HashMap<String, Augment> getAugments()
    {
        return augments;
    }
    public void setAugments(HashMap<String, Augment> newAugments)
    {
        augments = newAugments;
    }
    public Enchant getEnchant(String key)
    {
        return enchants.get(key);
    }
    public void setEnchant(String key, Enchant newEnchant)
    {
        enchants.put(key, newEnchant);
    }
    public HashMap<String, Enchant> getEnchants()
    {
        return enchants;
    }
    public void setEnchants(HashMap<String, Enchant> newEnchants)
    {
        enchants = newEnchants;
    }
	public String getLocation()
	{
		return location;
	}
	public void setLocation(String newLocation)
	{
		location = newLocation;
	}
    public String getMaterial()
    {
        return material;
    }
    public void setMaterial(String newMaterial)
    {
        material = newMaterial;
    }
    public boolean getSocketable()
    {
        return socketable;
    }
    public void setSocketable(boolean newSocketable)
    {
        socketable = newSocketable;
    }
    public boolean getEnchantable()
    {
        return enchantable;
    }
    public void setEnchantable(boolean newEnchantable)
    {
        enchantable = newEnchantable;
    }
}