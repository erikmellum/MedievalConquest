import java.util.HashMap; 
import java.io.Serializable;
public class Augment extends Modification
{
	protected HashMap<String,GameObject> augment;
	public Augment()
	{
		name = "Strength Augment";
		buildAugment();		
	}
	public Augment(String newName)
	{
		name = newName;
		buildAugment();
	}
	public Augment(String newName, String newDescription)
	{
		name = newName;
		description = newDescription;
		buildAugment();
	}
	public void buildAugment()
	{
		augment = modification;
		// Add effects here
		// Add stats here
		// Add abilities here
	}
	
}