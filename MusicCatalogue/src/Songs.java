
public class Songs {

	/*Contains all the attributes related to the Song
	Sets all song related attributes to private 
	so they cannot be accessed from other classes.*/
		private int songNumber;
		private String songTitle;
		private String songArtist;
		private int songMinutes;
	    private int songSeconds;
	    private int songRating;
	    //Initialisation of the variables
	    public Songs(int sn, String st, String sa, int sm, int ss, int sr){
	        songNumber = sn;
	        songTitle = st;
	        songArtist = sa;
	    	songMinutes = sm;
	        songSeconds = ss;
	        songRating = sr;
	    }
	    //Get methods which are used to return the private values
	    //and make them publicly accessible 
	public int getNumber(){
		return songNumber;
	    }    
	public String getTitle(){
	    return songTitle;
	   }
	public String getArtist(){
	    return songArtist;
	    }
	public int getMinutes() {
	    return songMinutes;
		}
	public int getSeconds(){
	    return songSeconds;
	            }
	public int getRating(){
	    return songRating;
	        }
	//Set method which sets the private values
	public void setNumber(int sn){
	    songNumber = sn;
	}
	public void setTitle(String st){
	    songTitle = st;
	}    
	public void songArtist(String sa){
	    songArtist = sa;
	}       
	public void setMinutes(int sm){
	    songMinutes = sm;
	}
	 public void setSeconds(int ss){
	    songSeconds = ss;
	}
	public void setRating(int sr){
	    songRating = sr;
	}
	public void printSong() {
		System.out.println("\n"); 
		//The format  specifiers outline how the songs
		// will be printed onto the console.
		System.out.format("%6d%28s%24s%18s%6s", songNumber, songTitle, songArtist, songMinutes +":"+songSeconds, songRating);
	}
}
