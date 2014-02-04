import java.util.*;
public class Effect extends GameObject
{
	protected HashMap<String, Stat> stats;
	public Effect(String newName, String newDescription)
	{
		name = newName;
		description = newDescription;
		buildEffect();
	}
	public void buildEffect()
	{		
		stats = new HashMap<String, Stat>();
		stats.put("Duration",new Stat("Duration",1));
		stats.put("Cooldown",new Stat("Frequency",1));
		stats.put("Type",new Stat("Typename",1));
	}
    public Stat getStat(String key)
    {
        return stats.get(key);
    }
    public void setStat(String key, Stat newStat)
    {
        stats.put(key, newStat);
    }
    public HashMap<String, Stat> getStats()
    {
        return stats;
    }
    public void setStats(HashMap<String, Stat> newStats)
    {
        stats = newStats;
    }
}