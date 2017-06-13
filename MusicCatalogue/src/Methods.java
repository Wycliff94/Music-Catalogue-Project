
import java.util.*;
public class Methods {

	Scanner input = new Scanner(System.in);
	//Creates a new Array list called songLibrary
	public ArrayList<Songs> songLibrary;  
	public Methods() {
        songLibrary = new ArrayList<Songs>(); 
	}
	public void addEntry() {
		//Automatically gives the songs a track number
		//which is the total number of elements in the Array List
		int songNumber;
		songNumber = songLibrary.size();
		//Asks the user to enter the track title.
			System.out.println("What is the track title?");
			String songTitle;
			songTitle = input.nextLine();
			////Asks the user to enter the artist's name.			
			System.out.println("Who is the artist of this track?");		
			String songArtist;
			songArtist = input.nextLine();
			//Asks the user to enter the minutes in the song.
			System.out.println("How many minutes does this song last?");
			int songMinutes;
			songMinutes = input.nextInt();	
			//Asks the user to enter the seconds in the song.
			System.out.println("How many seconds does this song last?");
			int songSeconds;
			songSeconds = input.nextInt();		
			//Asks the user to enter a rating from 0 to 5
			System.out.println("Rate this track out of 5 stars");	
            int songRating;
            songRating = input.nextInt();
             //Adds the information entered by the user
            	//to the songLibrary array list
            Songs s = new Songs(songNumber, songTitle, songArtist, songMinutes, songSeconds, songRating);
            songLibrary.add(s);
          //Prints a blank line
            System.out.println("\n"); 
            //Tells the user that the information has been added.
            System.out.println(songTitle + " by " + songArtist + " has been added!");
            System.out.println("\n");
            }

		public void artistSearch() {
			System.out.println("Please enter an artist to search for:");
			String searchName;
			searchName = input.nextLine();
//Uses the "i" counter to search for the string in each ArrayList element.
			for (int i = 0; i < songLibrary.size(); i++) {
                Songs s = songLibrary.get(i);
                if (songLibrary().equalsIgnoreCase(searchName))    
                s.printSong();
			}
	        }
		public void deleteOne(){
			try {         		 
        		//Asks the user to choose which song they want to delete
System.out.println("Which song would you like to delete? (0 of " + songLibrary.size() + ")");
        	        //prints  blank space
        	        System.out.println("\n"); 
        	      //Calls the printLibrary method to print the current library 
           		 //onto the console
        	        printLibrary();
        	        //Prints a blank line.
        	        System.out.println("\n");
        	        //Scans the user's input and matches it to the index
        	        //of the song in the Array List (starting with 0)
        	        int delete = input.nextInt();
//If user types a number higher than the highest index of the Array List, it will show an error and go back to the menu
        	        if (delete > songLibrary.size()) {
        	            System.out.println("Invalid entry. Please try again.");
        	            System.out.println("\n");
        	                       	        }
        	        else { 
        	        	//Prepares the chosen Array element to be deleted
        	            Songs s = songLibrary.get(delete);
        	            //Asks them to confirm whether they would like to
        	            //delete the retrieved track
System.out.println("Are you sure you would like to delete the following track from your music library? ");
        	            //Prints a blank line
        	            System.out.println("\n"); 
        	          //Prints the song that the user has chosen to delete
        	            s.printSong();
        	            System.out.println("\n");
        	            System.out.print("1: Yes \n2: No");
        	            int confirmDelete = input.nextInt();
        	            System.out.println("\n");
        	            if (confirmDelete == 1) {
        	            	//Song is removed from the Array List if user enters 1
        	                songLibrary.remove(delete);
        	                //Confirms the deletion to the user
        	                System.out.println( "This song has been deleted.");
        	                //Prints a blank line
        	                System.out.println("\n"); 
        	                //Prints the new Library
        	                //without the deleted item
        	                printLibrary();
        	                System.out.println("\n");
        	            } else if (confirmDelete == 2) {
        	            	//Program does not change the Array List and 
        	                System.out.println("\n" + "Okay, the song will not be deleted.");
        	                System.out.println("\n");        	                
        	            } else {
        	                //If the user types anything other than 1 or 2, 
        	            	//an error message will show.
        	                System.out.println("\n" + "Invalid option.");
        	                System.out.println("\n");

        	            }
        	        }   
        	           
        	        }
        	//This Cleanup method will execute whether or not an error has occurred.
        	 catch (ArrayIndexOutOfBoundsException x) {
                 System.out.println("Please select a valid entry");
             }
        	 }
        public void clearLibrary() {
            System.out.println("Are you sure you want to clear your library?");
            System.out.println("\n");
            System.out.print("1: Yes \n2: No" + "\n");
            int confirmDelete = input.nextInt();
            //if the user types 1, this will clear the Array List.
            if (confirmDelete == 1) {
                songLibrary.clear();
                //Confirms to the user that the library has been cleared.
                System.out.println("\n" + "Your music library has been cleared!" + "\n");
            }
        }
        	public void shuffleSongs() {
        	//All the attributes of the songs get shuffled together because they 
            //are all linked by the same seed.
            long seed = System.nanoTime();
          //The Collections.shuffle function in Java shifts the elements in the songLibrary 
          //into new positions randomly.
            Collections.shuffle(songLibrary, new Random(seed));

            System.out.println("Your library is now shuffled!");
            //Prints a blank line
            System.out.println("\n"); 
          //Prints the new Array List with the songs in the shuffled order.
            printLibrary();
        }
          public void reorderSongs() {
            	int song1;
            	int song2;
            	printLibrary();
            	System.out.println("\n"); 
                System.out.println("Please enter the position of a song (The list begins at 0)");
                song1 = input.nextInt();
                System.out.println("Now enter the position you would like to swap it with.");
                song2 = input.nextInt();
 //Uses the Java collections swap method to swap one specified //element in the ArrayList with the second specified element.
            Collections.swap(songLibrary,song1,song2);
            System.out.println("\n"); 
            printLibrary();      	
            }
        public void printLibrary() 
        {
        	//Tells the user that the library is empty
        	//if there is nothing in the Array List
            if (songLibrary.isEmpty()) {
                System.out.println("Your library is currently empty!");
            } 
            else 
            {
            	System.out.println("Your Music Library");
            	//Prints a blank line
            	System.out.println("\n"); 
//Uses format specifiers in the print format method to print the library
            	//edit how the Array List is shown on the console
            	System.out.format("%8s%17s%20s%24s%15s","Track number", "Song Title", "Artist", "Duration", "Rating"); 
/*A loop which tells the program that every time "i" is smaller than the songLibrary size, to execute what is in the code block {} Whenever "i" reaches the total songLibrary size, it should stop. After each iteration of the loop, it should increment "i" by 1 (i++),	Loop will eventually stop when it meets the total songLibrary size, since "i" becomes the library size and no longer applies to the smaller than condition.*/            		
for (int i = 0; i < songLibrary.size(); i++) {
//Searches for the Songs class elements in the song Library
            			//Array List and retrieves them with the counter "i"
             			Songs s = songLibrary.get(i);
            			 //Prints the songs
            			 s.printSong();
            			;
            		}
            }
        }
}
