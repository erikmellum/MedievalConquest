import java.util.HashMap; 
import java.io.Serializable;
public class Weapon extends Item
{
	String location, material;
	protected HashMap<String, GameObject> weapon;
	protected GameList<String, WeaponPart> weaponParts;
	protected GameList<String, Effect> effects;
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
		weaponParts = new GameList<String, WeaponPart>();
		effects = new GameList<String, Effect>();
		weapon.put("Weapon Parts",weaponParts);
		weapon.put("Effects",effects);
		weapon.put("Abilities",abilities);
		stats.lget("Value").setValue(1);
		stats.lget("Weight").setValue(1);
		stats.lget("Number").setValue(1);
		stats.lget("Level").setValue(1);
		stats.lget("Quantity").setValue(1);
		stats.put("Accuracy",new Stat("Accuracy",1));
		stats.put("Power",new Stat("Power",1));
		stats.put("Range",new Stat("Range",1));
		stats.put("Crit",new Stat("Crit",1));
		stats.put("Defense",new Stat("Defense",1));
		stats.put("Speed",new Stat("Speed",1));
		abilities.put("Stab",new Ability("Stab","Deadly when performed correctly"));
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