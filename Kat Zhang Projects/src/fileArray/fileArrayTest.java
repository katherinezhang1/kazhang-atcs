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
		
		fileArray a = new fileArray(concertPopulation);
		String filename = "john"; 
		a.writeFile("john.txt");
		a.readFile("john.txt");
		System.out.println(a.returnArray());
		System.out.println(a.enterArray(concertPopulation));
	}

}
