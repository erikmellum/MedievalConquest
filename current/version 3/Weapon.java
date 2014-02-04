import java.util.HashMap; 
import java.io.Serializable;
public class Weapon extends Item
{
	String location, material;
	protected GameList<String, GameList> weapon;
	protected GameList<String, Effect> effects;
	protected GameList<String, Augment> augments;
	protected GameList<String, Enchant> enchants;
	protected GameList<String, Ability> abilities;
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
	public void buildWeapon()
	{
		item = weapon;
		abilities = new GameList<String, Ability>();
		effects = new GameList<String, Effect>();
        augments = new GameList<String, Augment>();
        enchants = new GameList<String, Enchant>();
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
        enchants.put(key,newEnchant);
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
}