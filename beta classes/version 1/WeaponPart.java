import java.util.HashMap; 
import java.io.Serializable;
public class WeaponPart extends GameObject
{
	protected HashMap<String,GameObject> weaponPart;
	protected GameList<String,Augment> augments;
	protected GameList<String,Enchant> enchants;
	boolean socketable, enchantable;
	public WeaponPart()
	{
		name = "Head";
		socketable = false;
		enchantable = false;
		buildWeaponPart();		
	}
	public WeaponPart(String newName)
	{
		name = newName;
		socketable = false;
		enchantable = false;
		buildWeaponPart();
	}
	public WeaponPart(String newName, String newDescription)
	{
		name = newName;
		description = newDescription;
		socketable = false;
		enchantable = false;
		buildWeaponPart();
	}
	public void buildWeaponPart()
	{
		weaponPart = object;
		augments = new GameList<String,Augment>();
		enchants = new GameList<String,Enchant> ();
		weaponPart.put("Augments",augments);
		weaponPart.put("Enchants",enchants);
		// add augments and enchants here
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