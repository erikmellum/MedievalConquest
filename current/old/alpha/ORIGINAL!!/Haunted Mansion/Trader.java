/**
 * Trader is a class created to provide a merchant for user to interact with in the game world
 * It is a child of character and has all of characters methods. It also has methods to allow the user to choose whether they
 * would like to buy or sell, show the inventory, and to actually buy items.
 *
 * @author Erik Mellum
 * @version 1.0
 */
import java.util.*;
import java.io.*;
public class Trader extends Character implements Serializable
{
	Potion thePotion;
	Weapon theWeapon;
	Armor theArmor;
	Toolkit toolkit;
	/**
	* Default Constructor.
	* name is set to East Indie Trader
	* credits is set to 1000
	* 1 response is set to be default: I buy and sell things
	* A new inventory is created and filled with potions, one weapon, and one armor.
	*/
	public Trader()
	{
		name = "East Indie Trader";
		credits = 1000;
		responseCounter = 0;
		responses = new String[1];
		responses[0] = "I buy and sell things";
		quests = new ArrayList<Quest>();
		inventory = new ArrayList<Item>();
		thePotion = new Potion();
		theWeapon = new Weapon();
		theArmor = new Armor();
		inventory.add(thePotion);
		inventory.add(thePotion);
		inventory.add(thePotion);
		inventory.add(thePotion);
		inventory.add(thePotion);
		inventory.add(thePotion);
		inventory.add(thePotion);
		inventory.add(thePotion);
		inventory.add(theWeapon);
		inventory.add(theArmor);
		toolkit = new Toolkit();
	}
	/**
	 * Uses the toolkits new menu method to create a menu and return an integer between one or two indicating whether the user would
	 * like to buy or sell.
	 * @return toolkit.newMenu("Welcome! Would you like to buy or sell today?","Buy","Sell")
	 */
	public int buyOrSell()
	{
		return toolkit.newMenu("Welcome! Would you like to buy or sell today?","Buy","Sell");
	}
	/**
	 * Displays the inventory of the merchant and allows you to select the item you will be buying or selling.
	 * @return choice the index of the merchants inventory that contains the item you select
	 */
	public int showInventory()
	{	
		System.out.println("Trader has : " + getCredits() + " credits");
		int i = 0;
		for(Item output: inventory)
		{
			i++;
			System.out.println("[" + i + "] " + output.getName() + ":  costs: " + output.getValue());  
		}
		System.out.print("\nYour Choice: ");
		int choice = reader.readInt(1,i);
		return choice;
	}
	/**
	 * Allows the user to buy an item as long as you provide the index of the item and the player purchasing the item
	 * @param index the index of the item you will be buying 
	 * @param user the player who will be buying the item
	 */
	public void buyItem(int index, Player user)
	{
		System.out.println("User has : " + user.getCredits() + " credits");
		System.out.println("\nAre you sure you would like to buy " + inventory.get(index).getName() + " for " + inventory.get(index).getValue() + " credits?");
		System.out.println("\n[1] Yes");
		System.out.println("[2] No");
		System.out.print("\nYour Choice: ");
		int choice = reader.readInt(1,2);
		if (choice == 1)
		{
			if (user.getCredits() >= inventory.get(index).getValue())
			{
				user.setCredits(user.getCredits() - inventory.get(index).getValue());
				user.addItem(inventory.get(index));	
				setCredits(getCredits() + inventory.get(index).getValue());
				System.out.println("You have just bought " + inventory.get(index).getName() + " for " + inventory.get(index).getValue() + " credits!");
				inventory.remove(index);
			}
			else 
			{
				System.out.println("Not enough credits!");
			}
		}
	}
	/**
	* Allows you to get the credits the trader has
	* @return credits the amount of credits for the trader
	*/
	public int getCredits()
	{
		return credits;
	}
	/**
	* Allows you to set the credits the trader has
	* @param newCredits the new amount of credits for the trader
	*/
	public void setCredits(int newCredits)
	{
		credits = newCredits;
	}
	/**
	 * Allows the user to sell an item as long as you provide the index of the item and the player selling the item
	 * @param index the index of the item you will be selling
	 * @param user the player who will be selling the item
	 */
	public void sellItem(int index, Player user)
	{
		System.out.println("Trader has : " + getCredits() + " credits");
		Item tempItem = user.getItems().get(index);
		System.out.println("\nAre you sure you would like to sell " + tempItem.getName() + " for " + tempItem.getValue() + " credits?");
		System.out.println("\n[1] Yes");
		System.out.println("[2] No");
		System.out.print("\nYour Choice: ");
		int choice = reader.readInt(1,2);
		if (choice == 1)
		{
			if (getCredits() >= tempItem.getValue())
			{
				setItem(tempItem);
				user.setCredits(user.getCredits() + tempItem.getValue());
				user.removeItem(tempItem);
				
				System.out.println("You have just sold " + tempItem.getName() + " for " + tempItem.getValue() + " credits!");
				inventory.add(tempItem);
			}
			else 
			{
				System.out.println("Merchant does not have enough credits!");
			}
		}
	}
}