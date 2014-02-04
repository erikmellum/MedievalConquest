import java.util.HashMap; 
import java.io.Serializable;
public class Modification extends Stat
{
	protected HashMap<String,GameObject> modification;
	protected GameList<String,Stat> stats;
	protected GameList<String,Effect> effects;
	protected GameList<String,Ability> abilities;
	public Modification()
	{
		name = "Strength Enchantment";
		buildModification();		
	}
	public Modification(String newName)
	{
		name = newName;
		buildModification();
	}
	public Modification(String newName, String newDescription)
	{
		name = newName;
		description = newDescription;
		buildModification();
	}
	public void buildModification()
	{
		modification = stat;
		stats = new GameList<String,Stat>();
		effects = new GameList<String,Effect>();
		abilities = new GameList<String,Ability>();
		modification.put("Stats",stats);
		modification.put("Effects",effects);
		modification.put("Abilities",abilities);
		// Add effects here
		// Add abilities
		// Add stats
	}
	
}