package movieBooking2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Theater {
	//declaring a new array lists of object movie 
	ArrayList<Movie> movie = new ArrayList<Movie>();
	
	//creating the string of seats, which is an attribute of the movie object
	String[] s = { "A", "B", "C", "D", "E", "F", "G", "H" };
	String[] s1 = { "A", "B", "C", "D", "E", "F", "G", "H" };
	String[] s2 = { "A", "B", "C", "D", "E", "F", "G", "H" };
	String[] s3 = { "A", "B", "C", "D", "E", "F", "G", "H" };
	String[] s4 = { "A", "B", "C", "D", "E", "F", "G", "H" };
	String[] s5 = { "A", "B", "C", "D", "E", "F", "G", "H" };
	
	//adding new movies into the arrayList
	Theater() {
		movie.add(new Movie("FAST AND FURIOUS", 160, "R", s));
		movie.add(new Movie("LOGAN", 140, "R", s1));
		movie.add(new Movie("GHOST IN THE SHELL", 120, "PG-13", s2));
		movie.add(new Movie("KONG: SKULL ISLAND", 118, "PG-13", s3));
		movie.add(new Movie("THE CIRCLE", 110, "PG-13", s4));
		movie.add(new Movie("SNATCHED", 97, "R", s5));

	}

	/**
	 * Method that gets the index of a movie within the movie arrayList
	 * @param the name of the movie
	 * @return returns the index of the movie, and if the movie does not exist, returns -1
	 */
	int getMovieIndex(String n) {
		for (int i = 0; i < movie.size(); i++) {
			if (movie.get(i).getName().equals(n))
				return i;
		}
		return -1;
	}

	/**
	 * Method that takes all the attributes of the movie object and places them into a string 
	 * @return a string that contains all the attributes of every movie object on different lines
	 */
	public String toString() {
		String s = "";
		for (int i = 0; i < movie.size(); i++) {
			s += movie.get(i).toString() + "\n";
		}
		return s;
	}
	/**
	 * Method that goes through the movie ArrayList, checks to see if the movie is in the movie ArrayList, then takes the array
	 * of seats and places the contents in a string if the movie does exist
	 * @param movieName
	 * @return a string with all the seats associated with the movieName
	 */
	public String toString2(String n) {
		String s = "";
		for(int i =0; i<movie.size(); i++){
			if (movie.get(i).getName().contains(n)){
				s+=movie.get(i).toString2();
			}
		}
		return s;
	}
	
	}
	
