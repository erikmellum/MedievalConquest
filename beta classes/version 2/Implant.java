import java.util.HashMap; 
import java.io.Serializable;
public class Implant extends Modification
{
	protected HashMap<String,GameObject> implant;
	public Implant()
	{
		name = "Strength Implant";
		buildImplant();		
	}
	public Implant(String newName)
	{
		name = newName;
		buildImplant();
	}
	public Implant(String newName, String newDescription)
	{
		name = newName;
		description = newDescription;
		buildImplant();
	}
	public void buildImplant()
	{
		implant = modification;
		// Add effects here
		// Add abilities
		// Add stats
	}
	
}