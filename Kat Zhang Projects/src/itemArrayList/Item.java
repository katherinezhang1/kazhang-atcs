package itemArrayList;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import betterArray.Array;

public class Item {
	private double price;
	private String name; 
	//private int quantity; 
	int[]array; 
	Item(int[] n) {
		array = n;
	}
	Item(String n, double p){
		name = n;
		price = p; 

	}
		
	String getName(){
		return name;
	}
	double getPrice(){
		return price;
	}
	
	double setPrice(String n, int x){
		return price;
	}

	//ArrayList<String> a = new ArrayList<String>();
//	int Search(){
//		int temp;
//		searchin = input;
//		temp = indexOf(searchin);
//		outprice = get(temp);
//		
//		
//		return outprice; 
//}
	
}