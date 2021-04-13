package codingChallenges;

public class CharSwitch {

	public static void main(String[] args) {

		int charValue = 1;

		switch (charValue) {

		case 1:
			System.out.println("A");
			break;

		case 2:
			System.out.println("B");
			break;

		case 3:
			System.out.println("C");
			break;

		case 4:
			System.out.println("D");
			break;

		default:
			System.out.println("It was none of the letters");
			break;

		}
		System.out.print("Another way ----------------------------->   ");
		{

			int myCharValue = 'B';
			switch (myCharValue) {

			case 'A':
				System.out.println("A");
				break;

			case 'B':
				System.out.println("B");
				break;

			case 'C':
				System.out.println("C");
				break;

			case 'D':
				System.out.println("D");
				break;

			default:
				System.out.println("It was none of the letters");
				break;

			}

		}

	}
}