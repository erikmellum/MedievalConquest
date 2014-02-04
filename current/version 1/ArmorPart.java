import java.util.HashMap; 
import java.io.Serializable;
public class ArmorPart extends GameObject
{
	protected HashMap<String,GameObject> armorPart;
	protected GameList<String,Augment> augments;
	protected GameList<String,Enchant> enchants;
	boolean socketable, enchantable;
	public ArmorPart()
	{
		name = "Head";
		socketable = false;
		enchantable = false;
		buildArmorPart();		
	}
	public ArmorPart(String newName)
	{
		name = newName;
		socketable = false;
		enchantable = false;
		buildArmorPart();
	}
	public ArmorPart(String newName, String newDescription)
	{
		name = newName;
		description = newDescription;
		socketable = false;
		enchantable = false;
		buildArmorPart();
	}
	public void buildArmorPart()
	{
		armorPart = object;
		augments = new GameList<String,Augment>();
		enchants = new GameList<String,Enchant>();
		armorPart.put("Augments",augments);
		armorPart.put("Enchants",enchants);
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