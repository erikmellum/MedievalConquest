/**
 * Storage was created to allow you to save UI objects from the haunted mansion game
 *
 * @author Erik Mellum
 * @version 1.0
 */
 
import java.io.*;
import java.lang.*;
public class Storage implements Serializable
{
		/**
		* Attempts to load a UI object from a save file
		* @param filename the file name of the save file to be loaded
		*/
		public static UserInterface loadUI (String filename)
		{
			UserInterface theUI = null;
			try
			{
				FileInputStream fis = new FileInputStream(filename);
				ObjectInputStream ois = new ObjectInputStream(fis);
				theUI = (UserInterface)ois.readObject();
				ois.close();
			}
			catch (IOException ioe)
			{
				System.err.println("Problem loading UI. Creating new UI object instead.\n");
			}
			catch (ClassNotFoundException cfe)
			{
				System.err.println("Problem loading UI. Creating new farm object instead.\n");
			}
			
			if (theUI == null)
				theUI = new UserInterface();
				
			return theUI;
		}
		
		/**
		 * Store a UI object to a file as a serialized object.
		 * @param theUI the UI object to be serialized
		 * @param filename the file to write the object (file will be overwritten if it exists)
		 * @return true if the UI is successfully serialized to file, else false
		 */
		public static boolean storeUI (UserInterface theUI, String filename)
		{
			try
			{
				FileOutputStream fos = new FileOutputStream(filename);
				//System.err.println("File Could open.");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(theUI);
				oos.close();
				return true;
			}
			catch (IOException ioe)
			{
				System.err.println("Unable to store UI object.\n");
				System.err.println(ioe.getMessage());
				return false;
			}
		}

}
/*
REQUIREMENTS

	1. a "storage" class that handles storing/retrieving the "world" and everything in it to/from a file in serialized form 
*/