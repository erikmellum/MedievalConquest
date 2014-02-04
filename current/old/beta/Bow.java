public class Bow extends RangedWeapon
{
	public Bow(int theLevel)
	{
		theType = generator.nextInt(4);
		Weapon weapon = new Weapon(theLevel);
		if (theType == 1)
			weapon = new Shortbow(theLevel);
		if (theType == 2)
			weapon = new Longbow(theLevel);
		if (theType == 3)
			weapon = new Slingshot(theLevel);
		if (theType == 0)
			weapon = new Crossbow(theLevel);	
		return weapon;
	}
}