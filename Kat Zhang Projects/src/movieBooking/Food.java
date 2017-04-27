package movieBooking;

public class Food {
	private String name;
	private double price;
	private int quantity;
	Food(String n, double d, int q){
		name = n;
		price = d;
		quantity = q;
}
	/**
	 * Method gets the name of the food
	 * @return returns the name of the food
	 */
	String getName(){
		return name;
	}
	/**
	 * Method gets the price of the food
	 * @return returns the price of the food
	 */
	double getPrice(){
		return price;
	}
	/**
	 * Method gets the quantity of the food
	 * @return returns the quantity of the food 
	 */
	int getQuantity(){
		return quantity;
	}
	/**
	 * Method allows workers to input the quantity of food
	 * @param an integer 
	 * @return the new set quantity for a particular type of food
	 */
	int setQuantity(int n){
		quantity = n;
		return quantity;
	}
	public String toString(){
		return name+ ", $"+ price;
}
}
	