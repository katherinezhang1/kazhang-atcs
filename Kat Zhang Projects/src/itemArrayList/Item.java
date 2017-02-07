
package itemArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import betterArray.Array;

public class Item {
	
	private int price;
	private String name; 
	private int quantity; 
	int[]array; 
	Item(int[] n) {
		array = n;
	}
	Item(String n, int p, int q){
		n = name;
		p = price; 
		q = quantity;
	}
	 void readFile(String fileName){
   	  FileReader fr;
   	  try {
 			fr = new FileReader(fileName);
 			BufferedReader br = new BufferedReader(fr);
 			
 			String input;
 			String[] dataString = null;
 			while ((input = br.readLine()) != null) {
 				
 				System.out.println(input);
 				dataString = input.split("\n");
 			}
 			int[] data = new int[dataString.length];
 			for (int i = 0; i < dataString.length; i++){
 				array[i]=Integer.parseInt(dataString[i]);
 			}
 			
 		} catch (Exception e) {
 		}
     }
	String getName(){
		return name;
	}
	int getPrice(){
		return price;
	}
	int getQuantity(){ 
		return quantity; 

	}
	int setPrice(String n, int x){
		return price;
	}
	int setQuantity(){
		return quantity; 
}
}
