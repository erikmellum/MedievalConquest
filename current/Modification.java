import java.util.HashMap; 
import java.io.Serializable;
public class Modification extends Stat
{
	protected HashMap<String,HashMap> modification;
	protected HashMap<String,Stat> stats;
	protected HashMap<String,Effect> effects;
	protected HashMap<String,Ability> abilities;
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
		modification = new HashMap<String,HashMap>();
		stats = new HashMap<String,Stat>();
		effects = new HashMap<String,Effect>();
		abilities = new HashMap<String,Ability>();
		modification.put("Stats",stats);
		modification.put("Effects",effects);
		modification.put("Abilities",abilities);
		// Add effects here
		// Add abilities
		// Add stats
	}
    public HashMap<String, HashMap> get()
    {
        return modification;
    }
    public void set(HashMap<String, HashMap> newModification)
    {
        modification = newModification;
    }
    public Stat getStat(String key)
    {
        return stats.get(key);
    }
    public void setStat(String key, Stat newStat)
    {
        stats.put(key,newStat);
    }
    public HashMap<String, Stat> getStats()
    {
        return stats;
    }
    public void setStats(HashMap<String, Stat> newStats)
    {
        stats = newStats;
    }
    public Effect getEffect(String key)
    {
        return effects.get(key);
    }
    public void setEffect(String key, Effect newEffect)
    {
        effects.put(key,newEffect);
    }
    public HashMap<String, Effect> getEffects()
    {
        return effects;
    }
    public void setEffects(HashMap<String, Effect> newEffects)
    {
        effects = newEffects;
    }
	public Ability getAbility(String key)
    {
        return abilities.get(key);
    }
    public void setAbility(String key, Ability newAbility)
    {
        abilities.put(key,newAbility);
    }
    public HashMap<String, Ability> getAbilities()
    {
        return abilities;
    }
    public void setAbilities(HashMap<String, Ability> newAbilities)
    {
        abilities = newAbilities;
    }
}