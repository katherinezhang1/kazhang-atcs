package person;
//Katherine Zhang
public class Person {
//A super nice gym that gives you 20 dollars every time you lose five pounds
		private String name;
		private int age;
		private int height;
		private int weight;
		private int currency; 
		private int transferCurrency;
		private int loseWeight;


		//database that includes all your information you applied to the gym with
		//as well as your bank account for direct deposits for money 
		Person(String n, int a, int h, int w, int c) {
			name=n;
			age=a;
			height=h;
			currency=c;
			weight=w; 
		}	
		//takes the name of the person 
		Person(int m) {
			currency=m;
		}
		//returns the name of the person 
		String getName() {
			return name;
		}
		//returns the age of the person 
		int getAge() {
			return age;
		}
		//ages the person by a year
		void growUp() {
			age++;
		}
		void growUp(int x) {
			age+=x;
		}
		//returns the amount of money in the bank account 
		int getCurrency(){
			return currency;
		}
		//subtracts five pounds from the weight of the specified person 
		int loseWeight(){
			weight-=5;
			currency+=20;
	
			return weight;
		//transferring money from gym's bank account into the bank account of the person 
		}
		void pay(int amount, Person p){
			currency-=amount;
				p.changeBal(amount);
			}
			void changeBal (int amount){
				currency+=amount;
		}
		//the status of a person with all of their information 
		public String toString(){
			return "My name is " + name + ". My age is " + age + ". My height is " + height + " inches."+ "I weigh " + weight + " pounds." + " I have " + currency + " in my bank account."; 
		}
		//returns the height of a specific person 
		int getHeight(){
			return height;
		}
	}