package movieBooking2;

public class Movie {
	//variables used 
	private String movieName;
	private int movieLength;
	private String movieRating;
	private String[] movieSeats;

	//constructor for a movie that contains the name, length, rating, and seat array of that movie
	Movie(String n, int l, String r, String[] s) {
		movieName = n;
		movieLength = l;
		movieRating = r;
		movieSeats = s;

	}

	/**
	 * Method that returns the name of a movie
	 * 
	 * @return returns the name of a movie
	 */
	String getName() {
		return movieName;
	}

	/**
	 * Method that returns the length of a movie
	 * 
	 * @return returns the length of a movie
	 */
	int getLength() {
		return movieLength;
	}

	/**
	 * Method that returns the rating of a movie
	 * 
	 * @return the rating of a movie
	 */
	String movieRating() {
		return movieRating;
		
	}

	/**
	 * Method that returns the array of seats of a movie
	 * @return the array of seats of the movie
	 */
	String[] movieSeats() {
		return movieSeats;
	}

	/**
	 * Method that takes all the variables/information of a movie and returns it
	 * all
	 * 
	 * @return movieName + movieLength + movieSummary + movieRating
	 */
	public String toString() {
		return movieName + ", " + movieLength + " minutes, " + "Rated: " + movieRating;

	}
	/**
	 * Method that creates a string out of the elements of an array of seats
	 * 
	 * @return returns the string containing the elements of an array of
	 *         seats
	 */
	public String toString2() {
		String s = "";
		for (int i = 0; i < movieSeats.length; i++) { //loops through the whole array
			s += movieSeats[i] + " "; //adds contents to a string
		}
		return s;
	}
}
