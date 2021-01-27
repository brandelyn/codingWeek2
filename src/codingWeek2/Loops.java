package codingWeek2;

public class Loops {

	public static void main(String[] args) {
		performWhileLoop0to100();
		performWhileLoop100to0();
		performForLoop1to100();
		performForLoop0to100();
		
	}

	private static void performWhileLoop0to100() {
		
		int i = 0;
		while (i <= 100) {
			System.out.println(i);
			i += 2;
		}	
				
	}

	private static void performWhileLoop100to0() {
		
		int x = 100;
		while (x >= 0) {
			System.out.println(x);
			x -= 3;
			
		}
			
	}

	private static void performForLoop1to100() {
		
		for (int i = 1; i <= 100; i+= 2) {
			System.out.println(i);
		}
			
	}

	private static void performForLoop0to100() {
		
		for (int x = 0; x <= 100; x++) {
		    
			if (x % 3 == 0 && x % 5 == 0) {
			System.out.println("Hello World");
			}
			else if (x % 3 == 0) {
				System.out.println("Hello");
			}
			else if (x % 5 == 0) {
				System.out.println("World");
			}
			else {
				System.out.println(x);
				
			}
		}
		
		
	}

}
