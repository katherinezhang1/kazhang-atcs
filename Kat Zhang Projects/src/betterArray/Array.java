package betterArray;

//Katherine Zhang 
//Array Remix 
//CONTEXT: A concert hall wants to keep track of the amount of people attending concerts 
//in a week for statistical purposes. They are interested in learning patterns to bring more
//people into their venue. 

public class Array {
	// defining array variable
	int[] array;

	// constructors
	// Takes no arguments and initializes an empty array of size zero
	Array() {
		array = new int[0];
	}

	// Takes an array of integers as the arg
	Array(int[] n) {
		array = n;
	}

	// Takes an int and creates an array of that size with all values set to
	// zero
	Array(int x) {
		array = new int[x];
		for (int i = 0; i < array.length; i++) {
			array[i] = 0; // make each index 0
		}
	}

	// returns the value at "index" in the array
	// get() method tailored to Concert Population context
	int getConcertPopulation(int index) {
		return array[index];
	}

	// adds a number at the end of the array and increases its size by 1
	void push(int val) {
		int[] temp = new int[array.length + 1]; // temporary place holder
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		temp[array.length] = val;
		// the next statement is not really an assignment, it is having array
		// point to a different memory location
		array = temp;
	}

	// returns the last item from the array and decreases the size of the array
	int pop() {
		int[] temp = new int[array.length - 1]; // temporary place holder
		for (int i = 0; i < array.length - 1; i++) {
			temp[i] = array[i];
		}
		// returning last value in array
		int lastValue = array[array.length - 1];// array.length - 1 bc its the
												// last term
		array = temp;
		return lastValue;
	}

	// returns a string with every value in the array, e.g. “1, 2, 3, 4, 5”
	public String toString() {
		String string = "[";
		// runs a loop through the array to place all values in the string
		for (int i = 0; i < array.length; i++) {
			string += array[i];// takes values and add a space between
								// them
			if (i != array.length - 1) {
				string += ", " + "";
			}
		}
		string += "]";
		return string; // returns the array
	}

	// takes arg index + value, adds val into the array @ index + increases its
	// size by 1
	void insert(int val, int index) {
		int[] temp = new int[array.length + 1]; // creating a temporary array
												// that has an increased size
		for (int i = 0; i < index; i++) { // loops through the int of the array
											// to fill in the temp array
			temp[i] = array[i];
		}
		temp[index] = val;// overrides the value at temp[index] with the value
							// argument
		for (int i = index; i < array.length; i++) {// loops through the temp
													// array to fill the array
													// array
			temp[i + 1] = array[i];

		}
		array = temp;
	}

	// deletes the value from the array and to location specified in 'index' and
	// shrinks the array
	void remove(int index) {
		for (int i = index; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
		int[] temp = new int[array.length - 1];
		for (int i = 0; i < array.length - 1; i++) {
			temp[i] = array[i];
		}
		int lastValue = array[array.length - 1];// index starts @ 0, so its the
												// array.length - 1 to account
												// for the 0
		array = temp;

	}

	// returns the length of the array
	int size() {
		return array.length;
	}

	// changes the value in the array
	// at position 'index' to 'val'
	void update(int index, int val) {
		array[index] = val;
	}

	// returns array
	int[] getArray() {
		return array;
	}

	// swaps the values in positions 'index1' and 'index2' in the array
	void swap(int index1, int index2) {
		int temp = array[index1]; // created a temporary variable to store first
									// index
		array[index1] = array[index2]; // swapped the int in first index for the
										// int in second index
		array[index2] = temp; // made int in 2nd index into temp variable, which
								// holds the previous int in first index
	}

	// sorts the values in the array from least to greatest
	void sort() {
		int n = array.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (array[j - 1] > array[j]) { // if the first term is larger
												// than the last term, then the
												// temp holds the previous term
					temp = array[j - 1];
					array[j - 1] = array[j];// swaps places within the array
					array[j] = temp;
				}

			}
		}
	}

	// returns the minimum value in the array
	int min() {
		// added my sort method in the beginning to sort our array
		int n = array.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
		// finds the first term in the array --> first term should be min if
		// sorted
		int x = array[0];
		return x;
	}

	// returns the maximum value in the array
	int max() {
		// added my sort method in the beginning to sort out array
		int n = array.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {

				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
		// finds the last term in the array --> if array is sorted then the last
		// term should be max
		int x = array[array.length - 1];
		return x;
	}

	// returns the average of the array
	double average() { // used double b/c I want decimal places
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		double average = (double) sum / array.length;
		return average;

	}

}
