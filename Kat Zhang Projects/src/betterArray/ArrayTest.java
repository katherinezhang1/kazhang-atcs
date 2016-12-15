package betterArray;
//Katherine Zhang 

//Array Remix 

public class ArrayTest {

	public static void main(String[] args) {

		int[] concertPopulation = new int[7];
		concertPopulation[0] = 10000; // Sunday
		concertPopulation[1] = 14120; // Monday
		concertPopulation[2] = 10411; // Tuesday
		concertPopulation[3] = 9000; // Wednesday
		concertPopulation[4] = 10131; // Thursday
		concertPopulation[5] = 9801; // Friday
		concertPopulation[6] = 7649; // Saturday

		Array a = new Array(concertPopulation);
		Array b = new Array(5);
		Array c = new Array();

		// Testing toString()
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());

		// Testing getValue()
		System.out.println("Number of people at the hall on Tuesday: " + a.getConcertPopulation(2));
		// Testing push()
		// Relation to context: one worker added information from the beginning
		// of one week
		// to the end of another week by accident.
		a.push(10421);
		System.out.println("Push 10421: " + a);
		// Testing pop()
		// Relation to context: the worker removes the added information but
		// keeps the added value
		// so that they can add it to the next week's data
		a.pop();
		System.out.println("Pop 10421: " + a);
		// Testing remove()
		// Relation to context: the same worker realizes that they added the
		// wrong data for Saturday,
		// so they decide to take it out of the array
		a.remove(6);
		System.out.println("Removed Saturday from Array: " + a);
		// Testing insert()
		// Relation to context: the worker adds the correct data back into the
		// array
		a.insert(10000, 6);
		System.out.println("Inserted new data for Saturday: " + a);
		// Testing size()
		// Relation to context: the worker forgot how many days were in a week,
		// so he wants to know by using this method
		System.out.println("Size: " + a.size());
		// Testing getArray()
		// Relation to context: worker just wants to see the array
		a.getArray();
		System.out.println("Returned array: " + a.getArray());
		// Testing update()
		// Relation to context: worker forgot that he was also their attending
		// the concert
		a.update(0, 10001);
		System.out.println("Updated Monday: " + a);
		// Testing swap ()
		// Relation to context: worker put tuesday and wednesday data in the
		// wrong place
		a.swap(2, 3);
		System.out.println("Swapped Tuesday and Wednesday: " + a);
		// Testing sort()
		a.sort();
		System.out.println("Sorted Array: " + a);
		// Testing min()
		// Relation to context: worker is curious about which day was the least
		// popular
		System.out.println("Min: " + a.min());
		// Testing max()
		// Relation to context: worker is curious about which day was the most
		// popular
		System.out.println("Max: " + a.max());
		// Testing average()
		// Relation to context: worker wants to see the average of people in
		// this week
		System.out.println("Average: " + a.average());

	}
}
