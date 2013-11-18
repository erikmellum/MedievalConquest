/**
 * Quest is-a Item created to allow the user to pick up and use quests. 
 * It provides methods for setting and getting rewards, quest numbres, outputs for 
 * beginning, having begun, and completing quests. Also booleans to represent beginning
 * having begun, and completing the quests.
 *
 * @author Erik Mellum
 * @version 1.0
 */
import java.util.HashMap;
import java.io.Serializable;
public class Quest extends GameObject
{
	protected GameList<String, String> quest;
	protected GameList<String, Stat> stats;
	private String beginOutput, begunOutput, completedOutput, target;
	private boolean begun, complete;
	/**
	 * Default constructor.
	 * Sets default values as follows:
	 * description to Kill George
	 * begun to false
	 * complete to false
	 */
	public Quest()
	{
		name = "Escape the Arena!";
		description = "Clamour your way to the top";
		begun = false;
		complete = false;
		buildQuest();
	}
	public void buildQuest()
	{
		quest = new GameList<String, String>();
		stats = new GameList<String, Stat>();
		quest.put("BeginOutput","Welcome to the Arena matey, can you become the ultimate gladiator?");
		quest.put("BegunOutput","Go and fight your first match eh?");
		quest.put("CompleteOutput","Never thought you could do it kid... good luck on the outside!");
		quest.put("Target","UltimateFighter");
		stats.put("Experience",new Stat("Experience",10));
	}
	public String getQuestOutput(String theOutput)
	{
		return quest.get(theOutput);
	}
    public GameList<String, Stat> getStats()
    {
        return stats;
    }
    public void setStats(GameList<String, Stat> newStats)
    {
        stats = newStats;
    }
    public Stat getStat(String key)
    {
        return stats.get(key);
    }
    public void setStat(String key, Stat newStat)
    {
        stats.put(key,newStat);
    }
	/**
	 * Sets the boolean value begun of this quest to true
	 */
	public void setBegun()
	{
		begun = true;
	}
	public boolean getBegun()
	{
		return begun;
	}
	/**
	 * Sets the boolean value complete of this quest to true
	 */
	public void setComplete()
	{
		complete = true;
	}
	public boolean getComplete()
	{
		return complete;
	}
	/**
	 * Gets a string containing the name and description of the quest
	 * @return output the string created with the name and description.
	 */
	public String toString()
	{
		String output = name + ": " + description;
		return output;
	}
}