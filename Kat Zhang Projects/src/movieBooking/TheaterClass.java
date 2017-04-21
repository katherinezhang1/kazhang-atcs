package movieBooking;
import java.util.ArrayList; 

public class TheaterClass {
	ArrayList <Movie> movie = new ArrayList<Movie>();
	ArrayList <Food> food = new ArrayList <Food> ();
	ArrayList <Seat> seat = new ArrayList <Seat>();
	TheaterClass (){
		movie.add(new Movie("Fast and Furious", 160,"With Dom and Letty married, Brian and Mia retired and the rest of the crew exonerated, the globe-trotting team has found some semblance of a normal life. They soon face an unexpected challenge when a mysterious woman named Cipher forces Dom to betray them all. Now, they must unite to bring home the man who made them a family and stop her from unleashing chaos on a grand scale.", "R" ));
		movie.add(new Movie("Logan",140,"In the near future, a weary Logan (Hugh Jackman) cares for an ailing Professor X (Patrick Stewart) at a remote outpost on the Mexican border. His plan to hide from the outside world gets upended when he meets a young mutant (Dafne Keen) who is very much like him. Logan must now protect the girl and battle the dark forces that want to capture her.", "R"  ));
		movie.add(new Movie ("Ghost in the Shell", 120, "In the near future, Major is the first of her kind: a human who is cyber-enhanced to be a perfect soldier devoted to stopping the world's most dangerous criminals. When terrorism reaches a new level that includes the ability to hack into people's minds and control them, Major is uniquely qualified to stop it. As she prepares to face a new enemy, Major discovers that her life was stolen instead of saved. Now, she will stop at nothing to recover her past while punishing those who did this to her", "PG-13" ));
		movie.add(new Movie ("Kong: Skull Island", 118, "Scientists, soldiers and adventurers unite to explore a mythical, uncharted island in the Pacific Ocean. Cut off from everything they know, they venture into the domain of the mighty Kong, igniting the ultimate battle between man and nature. As their mission of discovery soon becomes one of survival, they must fight to escape from a primal world where humanity does not belong.", "PG-13"));
		food.add(new Food("Popcorn", 4.5, 50));
		food.add(new Food("Nachos", 3.5, 30));
		food.add(new Food("Hot Dogs", 2.5, 10));
		seat.add(new Seat("1A"));
		seat.add(new Seat("1B"));
		seat.add(new Seat("1C"));
		seat.add(new Seat("1D"));
		seat.add(new Seat("1E"));
		seat.add(new Seat("2A"));
		seat.add(new Seat("2B"));
		seat.add(new Seat("2C"));
		seat.add(new Seat("2D"));
		seat.add(new Seat("2E"));
	}
	/**
	 * Method that gets the names of all the movies and puts them in an array
	 * @return returns the array of movie names 
	 */
	String [] getMoviesArray(){
		String [] m = new String[movie.size()];
		for(int i = 0; i < m.length; i++)
			m[i]= movie.get(i).getName();
		return m;
	}
	/**
	 * Method that takes all the information on the movie objects and turns it into a string 
	 * @return returns the string that contains ALL the movie information
	 */
	public String toString(){
		String s = "";
		for(int i = 0; i < movie.size(); i++){
			s += movie.get(i).toString() + "\n";
		}
		return s;
	}
	/**
	 * This method takes the seat name and removes it from the ArrayList to act as "booking"
	 * @param takes the seat name in a string
	 * @return returns true if the seat has been booked (removed)
	 */
	boolean bookSeat(String m){
		for(int i = 0; i < seat.size(); i++){
			if(seat.get(i).getSeat().equals(m)){
				seat.remove(i);
				return true;	
			}
		}
		return false;
	}
}
