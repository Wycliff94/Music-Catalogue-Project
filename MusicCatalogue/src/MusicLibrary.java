import java.util.*;
public class MusicLibrary {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
    	int choice;
    	String name;
	//Creates a new Menu called menuFunctions
    	//which stores all the main methods used in the program
    	Methods menuFunctions = new Methods();  	
    	//Asks for the user to enter their name
    	 System.out.println("Please enter your name:");
    	 name = scan.nextLine();
    	 //Prints a blank line
    	 System.out.println("\n"); 
        //Initial prompt which is only displayed
    	 //when program is first run
        System.out.println("Welcome to " + name +"'s music library!");
        System.out.println("\n"); 
        do {    	
        	 //Prints a menu which allows the user to select a method
       	//for the program to perform
           System.out.println("Main Menu");
           System.out.println("\n"); 
           System.out.println("Press 0 to Exit");
           System.out.println("Press 1 to Add a Song");
           System.out.println("Press 2 to View All Songs");
           System.out.println("Press 3 to Search for an Artist");
           System.out.println("Press 4 to Delete a Song");
           System.out.println("Press 5 to Shuffle Library");
           System.out.println("Press 6 to Remove ALL Songs");
           System.out.println("Press 7 to Re-order Songs");
	    
          choice = scan.nextInt();    
         //"If" statements which are executed if the 
         //boolean expression in the brackets is true.
           if (choice == 0) {  
               //The program will close and print "Goodbye!" onto the console.  
               System.out.println("\n");
               System.out.println("Goodbye!");              
           } else if (choice == 1) {
               //This method allows the user to add a song to the library.
        	   System.out.println("\n");
               menuFunctions.addEntry();           
           } else if (choice == 2) {
   //This method will print all contents of the Array List onto the screen  
               System.out.println("\n");
               menuFunctions.printLibrary();
               System.out.println("\n");           
           } else if (choice == 3) {
           	/*This method allows the user to type a string
           	Then the program will search the ArrayList for a matching string
and returns all matching results*/        	   System.out.println("\n");
        	   menuFunctions.artistSearch();        	
           } else if (choice == 4) {
               //This method allows the user to delete their specified 
        	   //song from the library  
               System.out.println("\n");
               menuFunctions.deleteOne();        
           } else if (choice == 5) {
               //This function uses the Collections.shuffle method in Java
               //to re-arrange the track list in random order
               System.out.println("\n");
               menuFunctions.shuffleSongs();
               System.out.println("\n");
           } else if (choice == 6) {
               //This clears all the contents of the ArrayList
               //(Asks the user to confirm their choice.)
               System.out.println("\n");
               menuFunctions.clearLibrary();
               System.out.println("\n");   
	    } else if (choice == 7) {
              //This function uses the Collections.swap method in Java
//to swap 2 elements in the ArrayList               System.out.println("\n");
               menuFunctions.reorderSongs();
               System.out.println("\n");
           }
           else {
               //If the user chooses an incorrect number or types a string 
        	   //instead of an integer, the console will tell them to try again 
               System.out.println("\n");
               System.out.println("Incorrect Entry. Please try again.");
               System.out.println("\n");
           }
       } //Tells the program to perform the above methods
       	//only if the choice indicated by the user is higher than 0
       while (choice > 0);      
       //Closes the scanner
        scan.close();
       	}
}

