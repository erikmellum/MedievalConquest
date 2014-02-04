import java.util.HashMap; 
import java.io.Serializable;
public class Equippable extends Item
{
	String location, material;
	boolean socketable, enchantable, isEquipped;
	protected HashMap<String, HashMap> equip;
	protected HashMap<String, Effect> effects;
	protected HashMap<String, Augment> augments;
	protected HashMap<String, Enchant> enchants;
	protected HashMap<String, Ability> abilities;

	public Equippable()
	{
		name = "Bronze Longsword";
		description = "A long bronze two-handed sword";
		location = "Two Hands"; 
		equippable = true;
		droppable = true;
		buildEquippable();
	}
	public void buildEquippable()
	{
		item = equip = new HashMap<String, HashMap>();
		abilities = new HashMap<String, Ability>();
		effects = new HashMap<String, Effect>();
        augments = new HashMap<String, Augment>();
        enchants = new HashMap<String, Enchant>();
        equip.put("Augments",augments);
		equip.put("Effects",effects);
		equip.put("Abilities",abilities);
        equip.put("Enchants",enchants);
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
    public boolean getIsEquipped()
    {
        return isEquipped;
    }
    public void setIsEquipped(boolean newIsEquipped)
    {
        isEquipped = newIsEquipped;
    }
}