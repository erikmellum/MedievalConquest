public class Skill
{
	String name, description;
	int level, currentExperience, experienceNeeded, currentRating, maxRating;
	public Skill()
	{
		name = "swords";
		description = "Learn how to master the art of swordmanship";
		currentExperience = 0;
		experienceNeeded = 10;
		
		level = 1;
	}
	public Skill(String newName, String newDescription, int newLevel, newMaxRating)
	{
		name = newName;
		description = newDescription;
		level = newLevel;
		maxRating = newMaxRating;
		currentRating = maxRating;
		currentExperience = 0;
		experienceNeeded = 10;
		
	}
	public String getName()
	{
		return name;
	}
	public void setName(String newName)
	{
		name = newName;
	}
	public int getLevel()
	{
		return level;
	}
	public void setLevel(int newLevel)
	{
		level = newLevel;
	}
	public int getCurrentExperience()
	{
		return currentExperience;
	}
	public void setCurrentExperience(int newCurrentExperience)
	{
		currentExperience = newCurrentExperience;
	}
	public int getExperienceNeeded()
	{
		return experienceNeeded;
	}
	public void addExperience(int experience)
	{
		currentExperience += experience;
		if(currentExperience > experienceNeeded)
		{
			level++;
			currentExperience = 0;
		}
	}
	public void setExperienceNeeded(int newExperienceNeeded)
	{
		experienceNeeded = newExperienceNeeded;
	}
	public int getCurrentRating()
	{
		return currentRating;
	}
	public void setCurrentRating(int newCurrentRating)
	{
		currentRating = newCurrentRating;
	}
	public int getMaxRating()
	{
		return maxRating;
	}
	public void setMaxRating(int newMaxRating)
	{
		maxRating = newMaxRating;
	}
}