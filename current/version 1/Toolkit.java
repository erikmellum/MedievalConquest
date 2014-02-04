/**
 * Toolkit was created to allow the programmer to easily create menus, prompt for enter, and also generator random numbers
 *
 * @author Erik Mellum
 * @version 1.0
 */
 
import java.util.*;
import java.io.*;
public class Toolkit implements Serializable
{
	CinReader reader;
	Random generator;
	/**
	* Default Constructor.
	* Creates a new generatory and cinreader
	*/
	public Toolkit()
	{
		reader = new CinReader();
		generator = new Random();
	}
	/**
	* This method allows you to create a menu with 2 - 9 options
	* @param title the title of the menu
	* @param option1 the first option of the menu
	* @param option2 the second option of the menu
	* @return choice the selected option is returned as an integer choice
	*/
	public int newMenu(String title, String option1, String option2)
	{		
		int i = 0;
		String menuOutput[] = {option1,option2};
		
		System.out.println(title + "\n");
		for(String menuOption: menuOutput)
		{
			i++;
			System.out.println("[" + i + "] " + menuOption);
		}
		System.out.print("\nYour Choice: ");
		int choice = reader.readInt(1,2);
		return choice;
	}
	/**
	* This method allows you to create a menu with 2 - 9 options
	* @param title the title of the menu
	* @param option1 the first option of the menu
	* @param option2 the second option of the menu
	* @param option3 the third option of the menu
	* @return choice the selected option is returned as an integer choice
	*/
	public int newMenu(String title, String option1, String option2, String option3)
	{		
		int i = 0;
		String menuOutput[] = {option1,option2, option3};
		
		System.out.println(title + "\n");
		for(String menuOption: menuOutput)
		{
			i++;
			System.out.println("[" + i + "] " + menuOption);
		}
		System.out.print("\nYour Choice: ");
		int choice = reader.readInt(1,3);
		return choice;
	}
	/**
	* This method allows you to create a menu with 2 - 9 options
	* @param title the title of the menu
	* @param option1 the first option of the menu
	* @param option2 the second option of the menu
	* @param option3 the third option of the menu
	* @param option4 the fourth option of the menu
	* @return choice the selected option is returned as an integer choice
	*/
	public int newMenu(String title, String option1, String option2, String option3, String option4)
	{		
		int i = 0;
		String menuOutput[] = {option1,option2,option3,option4};
		
		System.out.println(title + "\n");
		for(String menuOption: menuOutput)
		{
			i++;
			System.out.println("[" + i + "] " + menuOption);
		}
		System.out.print("\nYour Choice: ");
		int choice = reader.readInt(1,4);
		return choice;
	}
	/**
	* This method allows you to create a menu with 2 - 9 options
	* @param title the title of the menu
	* @param option1 the first option of the menu
	* @param option2 the second option of the menu
	* @param option3 the third option of the menu
	* @param option4 the fourth option of the menu
	* @param option5 the fifth option of the menu
	* @return choice the selected option is returned as an integer choice
	*/
	public int newMenu(String title, String option1, String option2, String option3, String option4, String option5)
	{		
		int i = 0;
		String menuOutput[] = {option1, option2, option3,  option4, option5};
		
		System.out.println(title + "\n");
		for(String menuOption: menuOutput)
		{
			i++;
			System.out.println("[" + i + "] " + menuOption);
		}
		System.out.print("\nYour Choice: ");
		int choice = reader.readInt(1,5);
		return choice;
	}
	/**
	* This method allows you to create a menu with 2 - 9 options
	* @param title the title of the menu
	* @param option1 the first option of the menu
	* @param option2 the second option of the menu
	* @param option3 the third option of the menu
	* @param option4 the fourth option of the menu
	* @param option5 the fifth option of the menu
	* @param option6 the sixth option of the menu
	* @return choice the selected option is returned as an integer choice
	*/
	public int newMenu(String title, String option1, String option2, String option3, String option4, String option5, String option6)
	{		
		int i = 0;
		String menuOutput[] = {option1,option2,  option3,  option4,  option5,  option6};
		
		System.out.println(title + "\n");
		for(String menuOption: menuOutput)
		{
			i++;
			System.out.println("[" + i + "] " + menuOption);
		}
		System.out.print("\nYour Choice: ");
		int choice = reader.readInt(1,6);
		return choice;
	}
	/**
	* This method allows you to create a menu with 2 - 9 options
	* @param title the title of the menu
	* @param option1 the first option of the menu
	* @param option2 the second option of the menu
	* @param option3 the third option of the menu
	* @param option4 the fourth option of the menu
	* @param option5 the fifth option of the menu
	* @param option6 the sixth option of the menu
	* @param option7 the seventh option of the menu
	* @return choice the selected option is returned as an integer choice
	*/
	public int newMenu(String title, String option1, String option2, String option3, String option4, String option5, String option6, String option7)
	{		
		int i = 0;
		String menuOutput[] = {option1, option2,  option3,  option4,  option5, option6, option7};
		
		System.out.println(title + "\n");
		for(String menuOption: menuOutput)
		{
			i++;
			System.out.println("[" + i + "] " + menuOption);
		}
		System.out.print("\nYour Choice: ");
		int choice = reader.readInt(1,7);
		return choice;
	}
	/**
	* This method allows you to create a menu with 2 - 9 options
	* @param title the title of the menu
	* @param option1 the first option of the menu
	* @param option2 the second option of the menu
	* @param option3 the third option of the menu
	* @param option4 the fourth option of the menu
	* @param option5 the fifth option of the menu
	* @param option6 the sixth option of the menu
	* @param option7 the seventh option of the menu
	* @param option8 the eighth option of the menu
	* @return choice the selected option is returned as an integer choice
	*/
	public int newMenu(String title, String option1, String option2, String option3, String option4, String option5, String option6, String option7, String option8)
	{		
		int i = 0;
		String menuOutput[] = {option1, option2,  option3,  option4,  option5,  option6,  option7,  option8};
		
		System.out.println(title + "\n");
		for(String menuOption: menuOutput)
		{
			i++;
			System.out.println("[" + i + "] " + menuOption);
		}
		System.out.print("\nYour Choice: ");
		int choice = reader.readInt(1,2);
		System.out.println("\n");
		return choice;
	}
	/**
	* This method allows you to create a menu with 2 - 9 options
	* @param title the title of the menu
	* @param option1 the first option of the menu
	* @param option2 the second option of the menu
	* @param option3 the third option of the menu
	* @param option4 the fourth option of the menu
	* @param option5 the fifth option of the menu
	* @param option6 the sixth option of the menu
	* @param option7 the seventh option of the menu
	* @param option8 the eighth option of the menu
	* @param option8 the ninth option of the menu
	* @return choice the selected option is returned as an integer choice
	*/
	public int newMenu(String title, String option1, String option2, String option3, String option4, String option5, String option6, String option7, String option8, String option9)
	{		
		int i = 0;
		String menuOutput[] = {option1, option2, option3, option4, option5, option6, option7, option8, option9};
		
		System.out.println(title + "\n");
		for(String menuOption: menuOutput)
		{
			i++;
			System.out.println("[" + i + "] " + menuOption);
		}
		System.out.print("\nYour Choice: ");
		int choice = reader.readInt(1,9);
		return choice;
	}
	/**
	* This method allows you to generate a random  number
	* @param maxValue the highest random that you can create
	* @return (generator.nextInt(maxValue)+ 1) your new random number!
	*/
	public int newRandom(int maxValue)
	{
		return (generator.nextInt(maxValue)+ 1);
	}
	/**
	* Allows you to clear the screen from all input
	*/
	public void screenClear(int counter, String heading)
	{
		System.out.println(heading);
		for(int i = 0; i<(20-counter); i++)
		{
			System.out.println();
		}
	}
	/**
	* Allows you to prompt for enter
	*/
	public void promptEnter()
	{
		System.out.print("Press Enter to Continue...");
		String choice = reader.readString();
	}
}