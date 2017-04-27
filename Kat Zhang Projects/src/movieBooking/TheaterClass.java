package movieBooking;
import java.util.ArrayList;
public class TheaterClass {

	ArrayList <Movie> movie = new ArrayList<Movie>();
	ArrayList <Food> food = new ArrayList <Food> ();
	ArrayList <Seat> seat = new ArrayList <Seat>();
	TheaterClass (){
		movie.add(new Movie("Fast and Furious", 160, "R" ));
		movie.add(new Movie("Logan",140,"R"));
		movie.add(new Movie ("Ghost in the Shell", 120 , "PG-13"));
		movie.add(new Movie ("Kong: Skull Island", 118, "PG-13"));
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
	String [] getFoodArray(){
		String [] m = new String[food.size()];
		for(int i = 0; i < m.length; i++)
			m[i]= food.get(i).getName();
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
	public String toString1(){
		String s = "";
		for(int i = 0; i < food.size(); i++){
			s += food.get(i).toString() + "\n";
		}
		return s;
	}
	public String toString2(){
		String s = "";
		for(int i = 0; i < seat.size(); i++){
			s += seat.get(i).toString() + ",";
		}
		return s;
	}
	/**
	 * This method takes the seat name and removes it from the ArrayList to act as "booking"
	 * @param takes the seat name in a string
	 * @return returns true if the seat has been booked (removed)
	 */
	boolean bookSeat(String seatName){
		for(int i = 0; i < seat.size(); i++){
			if(seat.get(i).getSeat().equals(seatName)){
				seat.remove(i);
				return true;	
			}
		}
		return false;
	}
}

