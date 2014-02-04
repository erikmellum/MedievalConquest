import java.util.HashMap; 
import java.io.Serializable;
public class Enchant extends Modification
{
	protected HashMap<String,HashMap> enchant;
	public Enchant()
	{
		name = "Strength Enchantment";
		buildEnchant();		
	}
	public Enchant(String newName)
	{
		name = newName;
		buildEnchant();
	}
	public Enchant(String newName, String newDescription)
	{
		name = newName;
		description = newDescription;
		buildEnchant();
	}
	public void buildEnchant()
	{
		enchant = modification;
		// Add effects here
		// Add stats here
		// Add abilities here
	}
	
}