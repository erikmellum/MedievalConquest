import java.util.HashMap; 
import java.io.Serializable;
public class Skill extends Stat
{
	protected HashMap<String, Stat> stats;
	public Skill()
	{
		name = "swords";
		description = "Learn how to master the art of swordmanship";
		buildSkill();
	}
	public Skill(String newName, String newDescription, int newLevel)
	{
		name = newName;
		description = newDescription;
		buildSkill();
		stats.get("Level").setValue(newLevel);
	}
	public void buildSkill()
	{
		stats = new HashMap<String, Stat>();
		stats.put("Level",new Stat("Level",1));
		stats.put("Current Experience",new Stat("Current Experience",0));
		stats.put("Experience Needed",new Stat("Experience Needed",10));
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
}