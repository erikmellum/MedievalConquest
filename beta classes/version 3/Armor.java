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
	protected GameList<String, GameList> armor;
	protected GameList<String, Effect> effects;
	protected GameList<String, Augment> augments;
	protected GameList<String, Enchant> enchants;
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
	public void buildArmor()
	{
        item = armor;
		effects = new GameList<String, Effect>();
        augments = new GameList<String,Augment>();
		enchants = new GameList<String,Enchant>();
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
    public GameList<String, Effect> getEffects()
    {
        return effects;
    }
    public void setEffects(GameList<String, Effect> newEffects)
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
    public GameList<String, Augment> getAugments()
    {
        return augments;
    }
    public void setAugments(GameList<String, Augment> newAugments)
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
    public GameList<String, Enchant> getEnchants()
    {
        return enchants;
    }
    public void setEnchants(GameList<String, Enchant> newEnchants)
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