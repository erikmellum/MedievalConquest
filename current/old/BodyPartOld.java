import java.util.*;
public class BodyPart
{
	protected String name;
	boolean canEquipArmor, canEquipWeapon;
	Armor armor;
	Weapon weapon;
	public BodyPart()
	{
		name = "head";
		canEquipArmor = true;
		canEquipWeapon = false;
		weapon = null;
		armor = null;
	}
	public BodyPart(String newName, boolean newCanEquipArmor, boolean newCanEquipWeapon)
	{
		name = newName;
		canEquipArmor = newCanEquipArmor;
		canEquipWeapon = newCanEquipWeapon;
		weapon = null;
		armor = null;
	}
	public BodyPart(String newName, Armor newArmor, Weapon newWeapon)
	{
		name = newName;
		canEquipArmor = true;
		canEquipWeapon = true;
		armor = newArmor;
		weapon = newWeapon;
	}
	public BodyPart(String newName, Armor newArmor)
	{
		name = newName;
		canEquipArmor = true;
		canEquipWeapon = false;
		armor = newArmor;
		weapon = null;
	}
	public BodyPart(String newName, Weapon newWeapon)
	{
		name = newName;
		canEquipArmor = false;
		canEquipWeapon = true;
		weapon = newWeapon;
		armor = null;
	}	
	public String getName()
	{
		return name;
	}
	public void setName(String newName)
	{
		name = newName;
	}
	public boolean getCanEquipArmor()
	{
		return canEquipArmor;
	}
	public void setCanEquipArmor(boolean newBoolean)
	{
		canEquipArmor = newBoolean;
	}
	public boolean getCanEquipWeapon()
	{
		return canEquipWeapon;
	}
	public void setCanEquipWeapon(boolean newBoolean)
	{
		canEquipWeapon = newBoolean;
	}
	public Weapon getWeapon()
	{
		return weapon;
	}
	public Armor getArmor()
	{
		return armor;
	}
	public Weapon setWeapon(Weapon newWeapon)
	{
		Weapon oldWeapon = weapon;
		weapon = newWeapon;
		return oldWeapon;
	}
	public Armor setArmor(Armor newArmor)
	{
		Armor oldArmor = armor;
		armor = newArmor;
		return oldArmor;
	}
}