package betterArray;

import java.util.Arrays;

//Katherine Zhang 
//Array Remix 
//This is a rough draft 
public class Array {
	private int [] array= new int [2];
	int length=0;
	Array(){
		int a[]=new int [0];
	}
	Array(int [] val){
	}
	Array(int y){
		int b[]=new int [y];
	}
	//returns the value at index i in the array 
	int getValue(int index){
		return array[index];
	}
	//adds a number at the end of the array and increases its size by 1 
	void push(int val){
		int [] temp = new int [array.length+1];
		for (int i=0;i < array.length; i++) {
			temp [i] = array [i];
		}
		temp[array.length] = val;
		//the next statement is not really an assignment it is having array
		//point to a different memory location 
		array = temp;
	}
	//returns the last item from the array and decreases the size of the array
	int pop() {
		int[] temp = new int[array.length-1];
		for(int i=0; i<array.length-1; i++) {
			temp[i] = array[i];
		}
		int lastValue = array[array.length-1];
		array = temp;
		return lastValue;
	}
	//adds number into the array + increases its size by 1
	void insert (int index, int val){
	}
	
	void remove(){ 
	} 
	//changes the value in the array 
	//at position 'index' to 'val'
	void update (int index, int val){
		array[index]=val;
	}
	//returns a string with every 
	//value in the array, e.g. “1, 2, 3, 4, 5”
	public String toString(){
		String temp = Arrays.toString(array);
		return temp;
		}
	//returns the entire array		
	String getArray(){
		String temp = Arrays.toString(array);
		return temp;
	}
	//swaps the values in positions 
	//'index1' and 'index2' in the array
	void swap(int index1, int index2){
		int temp = array[index1];
		array[index1]=array[index2];		
		array[index2]=temp;
				}
	//sorts the values in the array from least to greatest
	void sort(){
		Arrays.sort(array);
	}
	}

		