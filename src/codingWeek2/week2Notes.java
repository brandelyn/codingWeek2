package codingWeek2;

public class week2Notes {

	public static void main(String[] args) {
		//boolean operators 
		// == equality operator result in a boolean value
		
//		System.out.println(2 == 2);
//		System.out.println(2 > 5);
//		System.out.println(3 <= 5);
//		System.out.println(5 < 5);
		//&& and || or
//		System.out.println(2 == 2 && 1 < 5);
//		System.out.println(true && true);
//		System.out.println(true && false);
//		System.out.println(true || false);
//		System.out.println(false || false);
//		System.out.println(2 == 2 || 1 == 5);
//		System.out.println(2 == 2 && 1 == 5);
		
		//conditional statements 
		
		// example 1:
		String name = "sam";
		
		if (name == "sam") {
			System.out.println("Hello sam!");
		}else {
			System.out.println("You are not sam, " + name);
		}
		
		// example 2:
		int age = 14;
		
		if (age >= 16) {
			System.out.println("you can get your license!");
		}else {
			System.out.println("please wait " + (16 - age) + " year(s) to get your license.");
		}
		
		// example 3:
		double costOfMilk = 2;
		
		if (costOfMilk <=2) {
			System.out.println("buying 2");
		}else if (costOfMilk <= 3) {
			System.out.println("buying 1");
		}else { 
			System.out.println("not buying any milk.");
			
		}
		
		//example 4:
		char grade = 'B'; //change the letter will give a different result in % 
		
		switch (grade) {
		case 'A':
			System.out.println("90%");
			break;//use break to seperate each switch so it only runs one
		case 'B':
			System.out.println("80%");
			break;
		case 'C' :
			System.out.println("70%");
			break;
		default:
			System.out.println("0%");
		}
		
		//example 5:
		if (5 == 5) {
			if (4 == 4) {
				System.out.println("5 is 5 and 4 is 4");
			}else {
				System.out.println("5 is 5");
			}
		}
		
		if (5 == 5 && 4 == 4) { // this is an example of flattening the above example
			System.out.println("yes");
		}
			
	}

}
