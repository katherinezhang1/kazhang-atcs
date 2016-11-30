package person;
//Katherine Zhang
public class Class1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person elite = new Person("Rick", 20, 65, 140, 1000);
Person trainer = new Person ("Sameer", 45, 80, 260, 11);
Person member = new Person ("Bruce", 30, 70,160 , 100);
Person Bank = new Person (1000000000);
System.out.println(elite);
System.out.println(trainer);	
System.out.println(member);
System.out.println(" ");
elite.loseWeight();
System.out.println(elite);
trainer.loseWeight();
System.out.println(trainer);
System.out.println(Bank);
	}

}