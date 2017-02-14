package fileArray;

import betterArray.Array;

public class fileArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] concertPopulation = new int[7];
		concertPopulation[0] = 10000; // Sunday
		concertPopulation[1] = 14120; // Monday
		concertPopulation[2] = 10411; // Tuesday
		concertPopulation[3] = 9000; // Wednesday
		concertPopulation[4] = 10131; // Thursday
		concertPopulation[5] = 9801; // Friday
		concertPopulation[6] = 7649; // Saturday
		
		int[] test = new int [3];
		test[0]=1;
		test[1]=2;
		test[2]=3;
		
		fileArray a = new fileArray(concertPopulation);
		fileArray b = new fileArray(test);
		String filename = "john"; 
		b.writeFile("john.txt");
		b.readFile("out.txt");
		
		System.out.println(b.toString());
	}
}
