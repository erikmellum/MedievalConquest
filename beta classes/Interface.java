import java.util.*;
public class Interface
{
	
	Random generator = new Random();
	CinReader reader = new CinReader();
	Toolkit toolkit = new Toolkit();
	Player user;
	public void go()
	{
		user = new Player();
		mainMenu();
	}
	public void mainMenu()
	{
		boolean loop = true;
		String toString;
		do
		{
			toolkit.screenClear(4, "===========================Arena===========================");
			int userChoice = toolkit.newMenu("toString","Check Character","Examine","Create","Quit");
			switch (userChoice)
			{
				case 1:
					characterMenu(user);
				break;
				case 2:
					
				break;
				case 3:
					create();
				break;
				default:
					loop = false;
				break;
			}
		} while(loop == true);
	}
	public void viewAbility(Ability ability)
	{
		System.out.println(ability.getName());
		System.out.println("Stats: ");

	}
	public void create()
	{
		switch(toolkit.newMenu("Welcome to the Creation Engine!","Create","Modify","Quit"))
		{
			case 1:
				switch(toolkit.newMenu("What would you like to create?","Monster","Weapon","Armor","Go Back"))
				{
					case 1:
					
					break;
					case 2:
					break;
					case 3:
					break;
					case 4:
					break;
				}
			break;
			case 2:
			break;
			case 3:
			break;
			default:
			break;
		}
	}
	public void characterMenu(Character character)
	{
        int choice = toolkit.newMenu("Character Menu","Inventory","Equipped Items","Abilities","Stats","Quests","Active Effects");
        switch(choice)
        {
            case 1:
                Iterator it = character.get("Items").entrySet().iterator();
                while(it.hasNext())
                {
                    Map.Entry pairs = (Map.Entry)it.next();
                    System.out.println(pairs.getKey() + " = " + (GameObject)(pairs.getValue()).getName());
                }
            break;
        }
	}	
}