package codingWeek2;

public class Week2Homework {

	public static void main(String[] args) {
		
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(false && false);
		System.out.println(true && (false || true));
		System.out.println(false || (true && false));
		System.out.println(false || 1 < 5);
		System.out.println(5 >= 4 && 1 > 3);
		System.out.println(10 < 4 || 1 > 4);
		System.out.println(12 >= 2 && 1 < 24);
		System.out.println("Hello" .charAt(0) == 'h');
		
		boolean isHotOutside = true;
		boolean isWeekDay = false;
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 2.75;
		double moneyInWallet = 54.67;
		int thirstLevel = 2;
		
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && !isWeekDay;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekDay;
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= (2 * costOfMilk);
		
		System.out.println(shouldBuyIcecream);
		System.out.println(willGoSwimming);
		System.out.println(isAGoodDay);
		System.out.println(willBuyMilk);
		
		
		if (isHotOutside && hasMoneyInPocket) {
			System.out.println("I should buy ice cream!");
		}else {
			System.out.println("I should not buy ice cream.");
			
		}
		
		if (isHotOutside && !isWeekDay) {
			System.out.println("I will go swimming!");
		}else {
			System.out.println("I will not go swimming.");
		}
		
		
		if (isHotOutside && hasMoneyInPocket && !isWeekDay) {
			System.out.println("Today is a good day!");
		}else {
			System.out.println("Today is not a good day.");
			
		}
		
		
		if (isHotOutside && thirstLevel >= 3 && moneyInWallet >= (2 * costOfMilk)) {
			System.out.println("I will buy milk.");
		}else {
			System.out.println("I will not buy any milk.");
	}
	}

}
