import java.util.HashMap; 
import java.io.Serializable;
public class Weapon extends Item
{
	String location, material;
	protected HashMap<String, HashMap> weapon;
	protected HashMap<String, Effect> effects;
	protected HashMap<String, Augment> augments;
	protected HashMap<String, Enchant> enchants;
	protected HashMap<String, Ability> abilities;
	public Weapon()
	{
		name = "Bronze Longsword";
		description = "A long bronze two-handed sword";
		location = "Two Hands"; 
		equippable = true;
		droppable = true;
		buildWeapon();
	}
	public Weapon(String newName, String newLocation)
	{
		name = newName;
		description = "No Description";
		location = newLocation;
		equippable = true;
		droppable = true;
		buildWeapon();
	}
	public Weapon(String newName, String newDescription, String newLocation)
	{
		name = newName;
		description = newDescription;
		location = newLocation;
		equippable = true;
		droppable = true;
		buildWeapon();
	}
    public Weapon(String newName, String newDescription, String newLocation, int value, int weight, int number, int level, int quantity, int accuracy, int power, int range, int crit, int defense, int speed, String type)
    {
        item = weapon = new HashMap<String, HashMap>();
		abilities = new HashMap<String, Ability>();
		effects = new HashMap<String, Effect>();
        augments = new HashMap<String, Augment>();
        enchants = new HashMap<String, Enchant>();
		weapon.put("Augments",augments);
		weapon.put("Effects",effects);
		weapon.put("Abilities",abilities);
        weapon.put("Enchants",enchants);
        name = newName;
        description = newDescription;
        location = newLocation;
        stats.get("Value").setValue(value);
		stats.get("Weight").setValue(weight);
		stats.get("Number").setValue(number);
		stats.get("Level").setValue(level);
		stats.get("Quantity").setValue(quantity);
		stats.put("Accuracy",new Stat("Accuracy",accuracy));
		stats.put("Power",new Stat("Power",power));
		stats.put("Range",new Stat("Range",range));
		stats.put("Crit",new Stat("Crit",crit));
		stats.put("Defense",new Stat("Defense",defense));
		stats.put("Speed",new Stat("Speed",speed));
        stats.put("Type",new Stat("Type",type));
    }
    public Weapon(String newName, String newDescription, String newLocation, HashMap<String, Effect> newEffects, HashMap<String, Ability> newAbilities, HashMap<String, Augment> newAugments, HashMap<String, Enchant> newEnchants, int value, int weight, int number, int level, int quantity, int accuracy, int power, int range, int crit, int defense, int speed, String type)
    {
        item = weapon = new HashMap<String, HashMap>();
        name = newName;
        description = newDescription;
        location = newLocation;
        effects = newEffects;
        abilities = newAbilities;
        augments = newAugments;
        enchants = newEnchants;
        stats.get("Value").setValue(value);
		stats.get("Weight").setValue(weight);
		stats.get("Number").setValue(number);
		stats.get("Level").setValue(level);
		stats.get("Quantity").setValue(quantity);
		stats.put("Accuracy",new Stat("Accuracy",accuracy));
		stats.put("Power",new Stat("Power",power));
		stats.put("Range",new Stat("Range",range));
		stats.put("Crit",new Stat("Crit",crit));
		stats.put("Defense",new Stat("Defense",defense));
		stats.put("Speed",new Stat("Speed",speed));
        stats.put("Type",new Stat("Type",type));
        weapon.put("Augments",augments);
		weapon.put("Effects",effects);
		weapon.put("Abilities",abilities);
        weapon.put("Enchants",enchants);
    }
	public void buildWeapon()
	{
		item = weapon = new HashMap<String, HashMap>();
		abilities = new HashMap<String, Ability>();
		effects = new HashMap<String, Effect>();
        augments = new HashMap<String, Augment>();
        enchants = new HashMap<String, Enchant>();
		weapon.put("Augments",augments);
		weapon.put("Effects",effects);
		weapon.put("Abilities",abilities);
        weapon.put("Enchants",enchants);
		stats.get("Value").setValue(1);
		stats.get("Weight").setValue(1);
		stats.get("Number").setValue(1);
		stats.get("Level").setValue(1);
		stats.get("Quantity").setValue(1);
		stats.put("Accuracy",new Stat("Accuracy",1));
		stats.put("Power",new Stat("Power",1));
		stats.put("Range",new Stat("Range",1));
		stats.put("Crit",new Stat("Crit",1));
		stats.put("Defense",new Stat("Defense",1));
		stats.put("Speed",new Stat("Speed",1));
		abilities.put("Stab",new Ability("Stab","Deadly when performed correctly"));
	}
    public Ability getAbility(String key)
    {
        return abilities.get(key);
    }
	public Effect getEffect(String key)
    {
        return effects.get(key);
    }
    public void setEffect(String key, Effect newEffect)
    {
        effects.put(key,newEffect);
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
        enchants.put(key,newEnchant);
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
}