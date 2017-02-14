package itemArrayList;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import betterArray.Array;
import java.util.Scanner;
import java.lang.String;
public class itemArrayListTest {
	public static void main(String[] args) {
//		String searchin;
//		int outprice;
//		int[] products = new int [0];
		ArrayList<Item> a = new ArrayList<Item>();
		a = readFile("books.csv");
		//ArrayList<String> b = new ArrayList<String>();
		sort(a);
		menu(a);
	}
	
	static void menu(ArrayList<Item> a){
		String tempsearch = "Search";
		String tempadd = "Add";
		String temp404;
		System.out.println("please enter your command");
		Scanner input = new Scanner(System.in);
String temp;
		temp = input.nextLine();
		if(temp.compareTo(tempsearch) == 0){
			Search(a);
		}
		else if(temp.compareTo(tempadd) == 0){
			addinventory(a);
			sort(a);
		}
		else{
			System.out.println("command not recognized. Please try again");
			menu(a);
		}
		//return outprice;
}
	
	static void sort(ArrayList<Item> a) {
		Item temp;
		Item temp2;
		Item temp3;
		for (int x = 0; x < a.size(); x++) {
			for (int i = 0; i < a.size() - 1; i++) {
				if (a.get(i).getName().compareTo(a.get(i + 1).getName()) > 0) {
					temp = a.get(i);
					temp2 = a.get(i+1);
					a.set(i, temp2);
					a.set(i+1, temp);
					// not sure if works
				}
			}
		}
	}
	
	
	
	static void Search(ArrayList<Item> a){	
		Scanner input = new Scanner(System.in);
int temp = 0;
double output = 0;
		System.out.println("please enter your item");
		String searchin = input.nextLine();

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getName().compareTo(searchin) == 0) {
			//Do whatever you want here
				output = a.get(i).getPrice();
				System.out.println("your items price is " + output);
			}
			}
		
	}
		
	static void addinventory(ArrayList<Item> a){
		Scanner input = new Scanner(System.in);
		int temp;
		Item n;
				System.out.println("please enter the new item and its details");
				String searchin = input.nextLine();
				String[] dataString = searchin.split(",");
  				double price = Double.parseDouble(dataString[1]);
  				String name = dataString[0];
  				a.add(new Item(name, price));
		        int place = a.size();
		        System.out.println("This new item is the " + place + "th unique item our store sells.");
	}
	
	static ArrayList<Item> readFile(String fileName){
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