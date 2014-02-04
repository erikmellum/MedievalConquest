public class Longsword extends MeleeWeapon
{
	power = 6;
	crit = 6;
	accuracy = 6;
	range = 3;
	speed = 3;
	defense = 6;
	level = 1;
	weight = 10;
	public Longsword(int type) 
	{
		if (type == 1)
			name = "stone longsword";
		if (type == 2)
			name = "bronze longsword";
		if (type == 3)
			name = "obsidian longsword";
		if (type == 4)
			name = "iron longsword";
		if (type == 5)
			name = "steel longsword";
		if (type == 6)
			name = "carbon longsword";
		if (type == 7)
			name = "diamond longsword";
		if (type == 8)
			name = "starshard longsword";
		power =* type;
		crit =* type;
		accuracy =* type;
		speed =* type;
		defense =* type;
		defense =* type;
		level = 10*type;
	}
}