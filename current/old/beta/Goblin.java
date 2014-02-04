public class Goblin extends Monster
{
	public Goblin(int newLevel)
	{
		level = newLevel;
		if (level > 0 && level < 6)
		{
			name = "Weak Goblin";
			description = "He looks pretty weak.";
			weapon = new Weapon(1);
			armor = new Armor(1);
			inventory = new ArrayList<Item>();
			strength = level;
			speed = level;
			defense = level;
			accuracy = level;
			health = level;
			maxHealth = health;
		}
	}
}