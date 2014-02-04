/**
 * Attacks is a class created for the purpose of giving weapons attacks with their own damage, name and accuracy 
 * It provides methods for setting and getting the damage name and accuracy.
 *
 * @author Erik Mellum
 * @version 1.0
 */

import java.util.HashMap;
import java.io.Serializable; 
public class Ability extends GameObject
{
    protected GameList<String, GameList> ability;
    protected GameList<String, Effect> effects;
	protected GameList<String, Stat> stats;
	public Ability()
	{
		name = "Fireball";
		description = "Typical Mage Spell";		
		buildAbility();
	}
	public Ability(String newName, String newDescription)
	{
		name = newName;
		description = newDescription;;
		buildAbility();
	}
	public void buildAbility()
	{
        ability = new GameList<String, GameList>();
        effects = new GameList<String, Effect>();
		stats = new GameList<String, Stat>();
        ability.put("Effects", effects);
        ability.put("Stats", stats);
		stats.put("Damage",new Stat("Damage",1));
		stats.put("Accuracy",new Stat("Accuracy",1));
		stats.put("Duration",new Stat("Duration",1));
		stats.put("Cooldown",new Stat("Cooldown",1));
		stats.put("Defense",new Stat("Defense",1));
		stats.put("Accuracy",new Stat("Accuracy",1));
		stats.put("Range",new Stat("Range",1));
		stats.put("Crit",new Stat("Crit",1));
		stats.put("Speed",new Stat("Speed",1));
		stats.put("Cost",new Stat("Cost",1));
	}
    public GameList<String, GameList> get()
    {
        return ability;
    }
    public void set(GameList<String, GameList> newAbility)
    {
        ability = newAbility;
    }
    public Stat getStat(String key)
    {
        return stats.get(key);
    }
    public void setStat(String key, Stat newStat)
    {
        stats.put(key, newStat);
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
        effects.put(key, newEffect);
    }
    public GameList<String, Effect> getEffects()
    {
        return effects;
    }
    public void setEffects(GameList<String, Effect> newEffects)
    {
        effects = newEffects;
    }
	public String toString()
	{
		String output = name;
		return output;
	}
}