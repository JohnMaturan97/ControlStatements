package typesOfControlStatements;

public class WhileDoStatement {

	public static void main(String[] args) {
		int count = 0;
		while (count != 6) {
			System.out.println("Count value is " + count);
			count++;

		}

		// Same Results
		for (int i = 0; i < 6; i++) {
			System.out.println("count value is " + i);
		}
		// Solution 2
		count = 1;
		while (true) {
			if (count == 6) {
				break;
			}
			System.out.println("Count value is " + count);
			count++;
		}

		// do statement / expression
		count = 1;
		do {
			System.out.println("Count value is " + count);
			count++;

			// used to stop infinite loop until 100
			if (count > 100) {
				break;
			}
		} while (count != 6);

		/*
		 * Solution 2 //for (count = 1; count != 6; count++) { //
		 * System.out.println("Count valu is " + count);
		 * 
		 */
	
		//**************************************************************
		
	//More example w/ break
	
	//init
	int number = 0;
	
	//check condition
	while(number < 15) {
		
		//adding +1 (number = 1)
		number++;
		
		//check if condition 1 <= 5 is true
		if(number <= 5) {
			//execute code
			System.out.println("Skipping number = " + number);
			//continue with a loop
			continue;
		}
		System.out.println("number = " + number);
		
		if(number >= 10) {
			System.out.println("Breaking at " + number);
		}
		
	}
	}

}