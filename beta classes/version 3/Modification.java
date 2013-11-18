import java.util.HashMap; 
import java.io.Serializable;
public class Modification extends Stat
{
	protected GameList<String,GameList> modification;
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
		modification = new GameList<String,GameList>();
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
    public GameList<String, GameList> get()
    {
        return modification;
    }
    public void set(GameList<String, GameList> newModification)
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
    public GameList<String, Stat> getStats()
    {
        return stats;
    }
    public void setStats(GameList<String, Stat> newStats)
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
    public GameList<String, Effect> getEffects()
    {
        return effects;
    }
    public void setEffects(GameList<String, Effect> newEffects)
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
    public GameList<String, Ability> getAbilities()
    {
        return abilities;
    }
    public void setAbilities(GameList<String, Ability> newAbilities)
    {
        abilities = newAbilities;
    }
}