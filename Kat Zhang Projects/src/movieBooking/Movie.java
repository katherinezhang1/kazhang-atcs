package movieBooking;

public class Movie {
	private String movieName; 
	private int movieLength;
	private String movieSummary;
	private String movieRating;
	
	Movie(String n, int l,String s, String r) {
		movieName=n;
		movieLength=l;
		movieSummary=s;
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
	 * Method that returns the summary of a movie
	 * @return returns the summary of a movie
	 */
	String movieSummary(){
		return movieSummary;
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
		return movieName + movieLength + movieSummary + movieRating;
	}
}
