package itemArrayList;

public class itemArrayListTest {
	public static void main(String[] args) {
	int[] products = new int [0];
	Item a = new Item (products);
	a.readFile("books.csv");
	System.out.println(a);


	}
}
