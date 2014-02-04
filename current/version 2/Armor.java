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
	protected HashMap<String, GameObject> armor;
	protected GameList<String, ArmorPart> armorParts;
	protected GameList<String, Effect> effects;
	protected GameList<String, Ability> abilities;
	
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
	public Armor(String newName, String newDescription, String newLocation, int newValue, int newProtection)
	{
		name = newName;
		description = newDescription;
		location = newLocation;
		equippable = true;
		droppable = true;
		buildArmor();
		stats.lget("Value").setValue(newValue);
		stats.lget("Protection").setValue(newProtection);
	}
	public void buildArmor()
	{
		armor = item;
		armorParts = new GameList<String, ArmorPart>();
		effects = new GameList<String, Effect>();
		abilities = new GameList<String, Ability>();
		armor.put("Armor Parts",armorParts);
		armor.put("Effects",effects);
		armor.put("Abilities",abilities);
		stats.put("Protection",new Stat("Protection",1));
		stats.lget("Value").setValue(1);
		stats.lget("Weight").setValue(1);
		stats.lget("Number").setValue(1);
		stats.lget("Level").setValue(1);
		stats.lget("Quantity").setValue(1);	
	}
	public String getLocation()
	{
		return location;
	}
	public void setLocation(String newLocation)
	{
		location = newLocation;
	}
}