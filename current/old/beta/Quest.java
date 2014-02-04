/**
 * Quest is-a Item created to allow the user to pick up and use quests. 
 * It provides methods for setting and getting rewards, quest numbres, outputs for 
 * beginning, having begun, and completing quests. Also booleans to represent beginning
 * having begun, and completing the quests.
 *
 * @author Erik Mellum
 * @version 1.0
 */
 
import java.util.*;
import java.io.*;
public class Quest extends Item implements Serializable 
{
	private String beginOutput, begunOutput, completedOutput, description, name, target;
	private int questNumber;
	private Item reward;
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
		description = "Kill George";
		begun = false;
		complete = false;
	}
	/**
	 * Overloaded constructor.
	 * Sets default values as follows:
	 * questNumber to newQuestNumber
	 * name to newName
	 * target to newTarget
	 * description to newDescription the new description
	 * beginOutput to newBeginOutput
	 * begunOutput to newBegunOutput
	 * completedOutput to newCompletedOutput
	 * complete to false
	 * begun to false
	 */
	public Quest(int newQuestNumber, String newName, String newTarget, String newDescription, String newBeginOutput, String newBegunOutput, String newCompletedOutput)
	{
		questNumber = newQuestNumber;
		name = newName;
		target = newTarget;
		description = newDescription;
		beginOutput = newBeginOutput;
		begunOutput = newBegunOutput;
		completedOutput = newCompletedOutput;
		begun = false;
		complete = false;
	}
	/**
	 * Overloaded constructor.
	 * Sets default values as follows:
	 * questNumber to newQuestNumber
	 * name to newName
	 * target to newTarget
	 * description to newDescription the new description
	 * beginOutput to newBeginOutput
	 * begunOutput to newBegunOutput
	 * completedOutput to newCompletedOutput
	 * complete to false
	 * reward to newReward
	 * begun to false
	 */
	public Quest(int newQuestNumber, String newName, String newTarget, String newDescription, String newBeginOutput, String newBegunOutput, String newCompletedOutput, Item newReward)
	{
		questNumber = newQuestNumber;
		name = newName;
		target = newTarget;
		reward = newReward;
		description = newDescription;
		beginOutput = newBeginOutput;
		begunOutput = newBegunOutput;
		completedOutput = newCompletedOutput;
		begun = false;
		complete = false;
	}
	/**
	 * Sets the boolean value begun of this quest to true
	 */
	public void setBegun()
	{
		begun = true;
	}
	/**
	 * Gets the name of this quest
	 * @return name the name for this quest
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Sets the name of this quest
	 * @param newName the name for this quest
	 */
	public void setName(String newName)
	{
		name = newName;
	}
	/**
	 * Gets the boolean value begun of this quest
	 * @return begun the boolean for begun
	 */
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
	/**
	 * Sets the target of this quest to newTarget
	 * @param newTarget the new target for this quest
	 */
	public void setTarget(String newTarget)
	{
		target = newTarget;
	}
	/**
	 * Gets the boolean value of complete of this quest
	 * @return begun the boolean for complete
	 */
	public boolean getComplete()
	{
		return complete;
	}
	/**
	 * Sets the completed output for this quest
	 * @param newString the new output for completedOutput
	 */
	public void setCompletedOutput(String newString)
	{
		completedOutput = newString;
	}
	/**
	 * Sets the beginning output for this quest
	 * @param newString the new output for beginOutput
	 */
	public void setBeginOutput(String newString)
	{
		beginOutput = newString;
	}
	/**
	 * Sets the begun output for this quest
	 * @param newString the new output for begunOutput
	 */
	public void setBegunOutput(String newString)
	{
		begunOutput = newString;
	}
	/**
	 * Gets the completed output for this quest
	 * @return completedOutput the completed output for this quest
	 */
	public String completedOutput()
	{
		return completedOutput;
	}
	/**
	 * Gets the begun output for this quest
	 * @return begunOutput the begun output for this quest
	 */
	public String begunOutput()
	{
		return begunOutput;
	}
	/**
	 * Gets the target for this quest
	 * @return target the target for this quest
	 */
	public String getTarget()
	{
		return target;
	}
	/**
	 * Gets the begin output for this quest
	 * @return beginOutput the beginning output for this quest
	 */
	public String beginOutput()
	{
		return beginOutput;
	}
	/**
	 * Gets the reward for this quest
	 * @return reward the reward for this quest
	 */
	public Item getReward()
	{
		return reward;
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