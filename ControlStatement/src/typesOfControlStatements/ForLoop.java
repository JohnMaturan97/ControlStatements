package typesOfControlStatements;

public class ForLoop {

	public static void main(String[] args) {
		
		// Calling calcualteInterest
		System.out.println(" 10,0000 at 2% interest = " + calcualteInterest(10000, 2.0));
		System.out.println(" 10,0000 at 7% interest = " + calcualteInterest(10000, 7.0));
		System.out.println(" 10,0000 at 24% interest = " + calcualteInterest(10000, 24.0));
		
		
		// Proper for Loop Statement 
		for(int i = 0; i < 6; i++) { 
			System.out.println("Loop" + i + "Hello!");
			
		}
	}
		
		public static double calcualteInterest (double amount, double interestRate) {
			return(amount *(interestRate / 100));
		}

	}


