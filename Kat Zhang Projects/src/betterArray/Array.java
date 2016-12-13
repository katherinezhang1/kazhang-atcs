package betterArray;

//Katherine Zhang 
//Array Remix 
public class Array {
	private int[] array = new int[2];
	int length = 0;

	Array() {
		int a[] = new int[0];
	}

	Array(int[] val) {
	}

	Array(int y) {
		int b[] = new int[y];
	}

	// returns the value at index i in the array
	int getValue(int index) {
		return array[index];
	}

	// adds a number at the end of the array and increases its size by 1
	void push(int val) {
		int[] temp = new int[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		temp[array.length] = val;
		// the next statement is not really an assignment it is having array
		// point to a different memory location
		array = temp;
	}

	// returns the last item from the array and decreases the size of the array
	int pop() {
		int[] temp = new int[array.length - 1];
		for (int i = 0; i < array.length - 1; i++) {
			temp[i] = array[i];
		}
		int lastValue = array[array.length - 1];
		array = temp;
		return lastValue;
	}

	// returns a string with every value in the array, e.g. “1, 2, 3, 4, 5”
	public String toString() {
		String string = "";
		for (int i = 0; i < array.length; i++) 
		{
			string += array[i] + " ";
		}
		string += "";
		return string;
	}

	// adds number into the array + increases its size by 1
	void insert(int index, int val) {
		int[] temp = new int[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		temp[index] = val;
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
		int lastValue = array[array.length - 1];
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
	 int [] getArray() {
		return array;
	}

	// swaps the values in positions 'index1' and 'index2' in the array
	void swap(int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	// sorts the values in the array from least to greatest
	void sort() {
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
	}

	// returns the minimum value in the array
	int min() {
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
		int x = array[0];
		return x;
	}

	// returns the maximum value in the array
	int max() {
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
		int x = array[array.length - 1];
		return x;
	}

	// returns the average of the array
	double average() {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		double average = (double) sum / array.length;
		return average;

	}

}
