package fileArray;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileArray {

		int[] array;
		fileArray(int[] n) {
			array = n;
		}
	void writeFile(String fileName){
        try {
            FileWriter fw = new FileWriter(fileName);
			String s = "";
			for (int i = 0; i < array.length; i++){
				s += array[i]+ "\n";
			}
			fw.write(s);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
      void readFile(String fileName){
    	  FileReader fr;
    	  try {
  			fr = new FileReader(fileName);
  			BufferedReader br = new BufferedReader(fr);
  			
  			String input;
  			String[] dataString = null;
  			while ((input = br.readLine()) != null) {
  				// System.out.println(input);
  				dataString = input.split("\n");
  			}
  			int[] data = new int[dataString.length];
  			for (int i = 0; i < dataString.length; i++){
  				array[i]=Integer.parseInt(dataString[i]);
  			}
  			
  		} catch (Exception e) {
  		}
      }
     int[] returnArray() {
    			return array;
    		}
     String enterArray(int[]a){
    	 String s = " ";
			for (int i = 0; i < array.length; i++){
				s += array[i]+ "\n";
			}
			return s;

  	}

}




