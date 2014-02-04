import java.util.*;
public class Weapon extends Item
{
	Random generator = new Random();
	protected int type, accuracy, power, range, crit, defense, speed, weight, level;
	ArrayList<Attack> attacks;
	CinReader reader = new CinReader();
	public Weapon()
	{
		name = "Bronze Longsword";
		description = "A long two-handed sword";
		accuracy = 6;
		power = 6;
		range = 2;
		crit = 6;
		defense = 6;
		speed = 4;
		weight = 8;
		level = 1;
		Attack attack = new Attack();
		attacks = new ArrayList<Attack>();
		attacks.add(attack);
	}
	public Weapon(String newName,String newDescription,int newAccuracy,int newPower,int newRange,int newCrit,int newDefense, int newSpeed,int newWeight,int newLevel)
	{
		name = newName;
		description = newDescription;
		accuracy = newAccuracy;
		power = newPower;
		range = newRange;
		crit = newCrit;
		defense = newDefense;
		speed = newSpeed;
		weight = newWeight;
		level = newLevel;
		Attack attack = new Attack();
		attacks = new ArrayList<Attack>();
		attacks.add(attack);
	}
	public Weapon(int theLevel)
	{
		/*
		Weapon newWeapon;
		int random = generator.nextInt(8);
		if (random == 1)
			new Weapon = new Longsword(theLevel);
		if (random == 2)
			new Weapon = new Axe(theLevel);
		if (random == 3)
			new Weapon = new Shortsword(theLevel);
		if (random == 4)
			new Weapon = new Dagger(theLevel);
		if (random == 5)
			new Weapon = new Mace(theLevel);
		if (random == 6)
			new Weapon = new Staff(theLevel);
		if (random == 7)
			new Weapon = new Shortbow(theLevel);
		if (random == 8)
			new Weapon = new Longbow(theLevel);
		if (random == 9)
			new Weapon = new Crossbow(theLevel);
		if (random == 0)Z
			new Weapon = new Shortbow(theLevel);
		*/
	}
	public String getName()
	{
		return name;
	}
	public void setName(String newName)
	{
		name = newName;
	}
	public int getPower()
	{
		return power;
	}
	public void setPower(int newPower)
	{
		power = newPower;
	}
	public int getAccuracy()
	{
		return accuracy;
	}
	public void setAccuracy(int newAccuracy)
	{
		accuracy = newAccuracy;
	}
	public int getRange()
	{
		return range;
	}
	public void setRange(int newRange)
	{
		range = newRange;
	}
	public int getCrit()
	{
		return crit;
	}
	public void setCrit(int newCrit)
	{
		crit = newCrit;
	}
	public int getDefense()
	{
		return defense;
	}
	public void setDefense(int newDefense)
	{
		defense = newDefense;
	}
	public int getSpeed()
	{
		return speed;
	}
	public void setSpeed(int newSpeed)
	{
		speed = newSpeed;
	}
	public int getWeight()
	{
		return weight;
	}
	public void setWeight(int newWeight)
	{
		weight = newWeight;
	}
	public int getLevel()
	{
		return level;
	}
	public Attack getAttack()
	{
		if (attacks.size() > 0)
		{
			int i = 1;
			for(Attack theAttack: attacks)
			{
				System.out.println("[" + i + "] " + theAttack.getName() + "\n");
				i++;
			}
			System.out.print("Your Choice: "); 
			int choice = reader.readInt(0,attacks.size());
			return attacks.get(choice);
		}
		else
		{	
			System.out.println("No attacks sorry");
			return null;
		}
	}
	public void setLevel(int newLevel)
	{
		level = newLevel;
	}
}