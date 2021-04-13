package typesOfControlStatements;

public class SwitchCase {

	public static void main(String[] args) {
		
		//Using primitive types for switch case 
		int switchValue = 6;
		switch(switchValue) {
		
		//like if statement
		case 1: 
			System.out.println("Value was 1");
			break;
		
		//like else if statement
		case 2: 
			System.out.println("Value was 2");
			break;
			
		case 3: case 4: case 5:
		System.out.println("Was a 3, or a 4, or a 5");
		System.out.println("Actually it was a " + switchValue);
		break;
		
		//like else statement
		default:
			System.out.println("Was not 1, 2, 3, 4, 5");
			break;
		}
		
		
		
		// Using String for switch case
		String month = "Feb";
		switch(month) {
		
		case "Jan":
			System.out.println("Jan");
			break;
			
		case "Feb" :
			System.out.println("Feb");
			break;
			
		default:
			System.out.println("Either");
		}

	}

}
