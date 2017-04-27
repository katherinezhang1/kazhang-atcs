package movieBooking;

import javax.swing.ListModel;

public class Movie {
	private String movieName; 
	private int movieLength;
	private String movieRating;
	
	Movie(String n, int l, String r) {
		movieName=n;
		movieLength=l;
		movieRating=r;
	 
	}
	/**
	 Method that returns the name of a movie
	 * @return returns the name of a movie
	 */
	String getName(){
		return movieName;
	}
	/**
	 Method that returns the length of a movie
	 * @return returns the length of a movie
	 */
	int getLength(){
		return movieLength;
	}
	
	/**
	 * Method that returns the rating of a movie
	 * @return the rating of a movie
	 */
	String movieRating(){
		return movieRating;
	}
	/**
	 * Method that takes all the variables/information of a movie and returns it all
	 * @return movieName + movieLength + movieSummary + movieRating
	 */
	public String toString(){
		return movieName +", " +  movieLength + " minutes, "  +"Rated: " + movieRating;
	}

	}

