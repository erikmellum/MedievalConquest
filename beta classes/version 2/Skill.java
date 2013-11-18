import java.util.HashMap; 
import java.io.Serializable;
public class Skill extends Stat
{
	protected HashMap<String, GameObject> skill;
	protected GameList<String, Stat> stats;
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
		stats.lget("Level").setValue(newLevel);
	}
	public void buildSkill()
	{
		skill = stat;
		stats = new GameList<String, Stat>();
		skill.put("Stats",stats);
		stats.put("Level",new Stat("Level",1));
		stats.put("Current Experience",new Stat("Current Experience",0));
		stats.put("Experience Needed",new Stat("Experience Needed",10));
	}
}