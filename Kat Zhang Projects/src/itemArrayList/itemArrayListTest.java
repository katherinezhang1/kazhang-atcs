package itemArrayList;
//Katherine Zhang
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import betterArray.Array;
import java.util.Scanner;
import java.lang.String;
import java.util.Collections;
public class itemArrayListTest {
	public static void main(String[] args) {
		// creating a new arrayList of type Item in order to store what is read
		// from the file
		ArrayList<Item> a = new ArrayList<Item>();
		// arraylist is being filled with the contents of the file
		// "booklist.csv"
		a = readFile("books.csv");
		
		// the arraylist is being sorted using the sort method
		sort(a);
		// calling the method menu that brings the interface for the user
		menu(a);

	}

	// method menu, which gives the user its interface
	static void menu(ArrayList<Item> a) {
		// tempSearch + tempAdd are the options the user can choose
		String tempSearch = "search";
		String tempAdd = "add";
		// Asks which command the user would like to do, then stores the user's
		// answer in the input variable
		System.out.println("Would You Like to Search For An Item or Add One?");
		Scanner input = new Scanner(System.in);
		// Declaring a new variable that holds the user's input, then making all
		// the letters lowercase
		String temp = input.nextLine().toLowerCase();
		// comparing the user's answers to guide them to the next method
		if (temp.compareTo(tempSearch) == 0) {
			Search(a);
		} else if (temp.compareTo(tempAdd) == 0) {
			addInventory(a);
			sort(a);
		}
		// if command is not recognized, then the user is asked to attempt again
		else {
			System.out.println("Command not recognized. Please try again");
			menu(a);
		}

	}

	// method that sorts the arraylist using comparisons 
	static void sort(ArrayList<Item> a) {
		Item temp;
		Item temp2;
		Item temp3;
		for (int x = 0; x < a.size(); x++) {
			for (int i = 0; i < a.size() - 1; i++) {
				if (a.get(i).getName().compareTo(a.get(i + 1).getName()) > 0) {
					temp = a.get(i);
					temp2 = a.get(i + 1);
					a.set(i, temp2);
					a.set(i + 1, temp);

				}
			}
		}
	}
	
//It is not the most effective way to search, but I could not figure out how to get the binary
	//search to work. Instead, this method compares the item name with the elements of the array.
		static void Search(ArrayList<Item> a) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your item:");
		String temp = input.nextLine();
		for (int i =0; i< a.size(); i++){
		if (a.get(i).getName().compareTo(temp) == 0) {
			double output = a.get(i).getPrice(temp);
			System.out.println("The price of your item is " + output + " dollars.");
		}
		
	}}
	

		 
//this method adds inventory to the store		  
	static void addInventory(ArrayList<Item> a) {
		Scanner input = new Scanner(System.in);

		Item n;
		System.out.println("Please enter the name of the new item, followed by the price");
		String searchin = input.nextLine();
		//this takes the input, cleaves the name and the price and places them in different variables 
		String[] dataString = searchin.split(",");
		double price = Double.parseDouble(dataString[1]);
		String name = dataString[0];
		//this adds the new item into the inventory 
		a.add(new Item(name, price));
		System.out.println("Your item " + name + " has been added. Its price is " + price + " dollars.");
	}
	//this method reads in the "books.csv" file 
	static ArrayList<Item> readFile(String fileName) {
		FileReader fr;
		ArrayList<Item> books = new ArrayList<Item>();
		try {
			fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String input;
			while ((input = br.readLine()) != null) {
				String[] dataString = input.split(",");
				double price = Double.parseDouble(dataString[1]);
				String name = dataString[0];
				books.add(new Item(name, price));
			}
		} catch (Exception e) {
		}

		return books;
	}

}