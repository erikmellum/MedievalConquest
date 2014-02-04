import java.util.HashMap; 
import java.io.Serializable;
public class BodyPart extends GameObject
{
	protected HashMap<String,GameObject> bodyPart;
	protected GameList<String,Implant> implants;
	boolean isEquipped, implantable;
	public BodyPart()
	{
		name = "Head";
		isEquipped = false;
		buildBodyPart();		
	}
	public BodyPart(String newName)
	{
		name = newName;
		isEquipped = false;
		buildBodyPart();
	}
	public BodyPart(String newName, String newDescription)
	{
		name = newName;
		description = newDescription;
		isEquipped = false;
		buildBodyPart();
	}
	public void buildBodyPart()
	{
		bodyPart = object;
		implants = new GameList<String,Implant>();
		bodyPart.put("Implants",implants);
		// add implants
	}
	public boolean getIsEquipped()
	{
		return isEquipped;
	}
	public void setIsEquipped(boolean newIsEquipped)
	{
		isEquipped = newIsEquipped;
	}
	public boolean getImplantable()
	{
		return implantable;
	}
	public void setImplantable(boolean newImplantable)
	{
		implantable = newImplantable;
	}
	
}