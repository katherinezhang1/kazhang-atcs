package betterArray;
//Katherine Zhang 
//Array Remix 

public class ArrayTest {

	public static void main(String[] args) {
		Array a = new Array(2);

		//testing toString method
		System.out.println(a.toString());
		//testhing insert method
		a.insert(0, 2);
		
		System.out.println(a.toString());

		a.sort();
		System.out.println(a.toString());
	
		
}
}
