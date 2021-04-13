package codingChallenges;

public class ForLoop {

	public static void main(String[] args) {

		// using the for statement, call the calculateInterest method with
		// the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
		// and print the results to the console window.
		for (int i = 2; i < 9; i++) {
			// Adding the " String.format("%.2f", " will placed all output value into 2
			// decimal places
			System.out
					.println(" 10,0000 at " + i + "% interest = " + String.format("%.2f", calcualteInterest(10000, i)));

		}

		System.out.println("********************************");
		// How would you modify the for loop above to do the same thing as
		// shown but to start from 8% and work back to 2%

		for (int i = 8; i >= 2; i--) {

			// Adding the " String.format("%.2f", " will placed all output value into 2
			// decimal places
			System.out
					.println(" 10,0000 at " + i + "% interest = " + String.format("%.2f", calcualteInterest(10000, i)));

		}
		
		

	}

	public static double calcualteInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}

}
