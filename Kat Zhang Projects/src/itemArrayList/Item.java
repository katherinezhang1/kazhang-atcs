package itemArrayList;
//Katherine Zhang 

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
	
	Item(String n, double p){
		name = n;
		price = p; 

	}
		
	public String getName(){
		return name;
	}
	double getPrice(String n){
		return price;
	}
	



	
}