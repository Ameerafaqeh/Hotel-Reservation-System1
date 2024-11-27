import java.util.Scanner;

public class HotelRrservationSystem {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// In Main I called the menu printing method
		mainMenu(); // And the main meun Method , which contains all operations
		printline();// Barrier printing method
	}

	public static void mainMenu() { /*
									 * A method that contains the switch. When the user enters the number of the
									 * switch, it goes to the method that was called. Enter it
									 */

		printMainMenu();

		Scanner in = new Scanner(System.in);
		int number  = in.nextInt();// The user enters numbers from 1 to 7
		switch (number) {

		case 1: // In the first case, the reservation method is called

			reserveRoom();

			break;
		case 2: // In the second case, a method is called to specify the room type

			selectRoomType();

			break;

		case 3:// In the third case, the room change method was called

			changeRoom();

			break;
		case 4:// In the fourth case, a method was called to delete the room

			deleteReservedRoom();

			break;
		case 5:// In the fifth case, the delete all reservation method was called
			deleteAllReservedRoom();

			break;
		case 6://
			showAllReservedRoomsInformation();

			break;
		case 7:// In the sixth case, the method of displaying all reservations was called
			ExitSystem();

			break;

		default:// If you enter other than numbers, how many 1 to 7
			System.out.println("Sorry , you have enter a wrong number ");
			printline();
			mainMenu();

			break;

		}

	}

	public static void printMainMenu() { // The main menu method that prints the menu
		System.out.println("please Select an Option(1-7):\n1- Reserve an available room.\r\n"
				+ "2- Choose room type.\r\n" + "3- Change room\r\n" + "4- Delete the reserved room.\r\n"
				+ "5- Delete all reserved rooms.\r\n" + "6- Show all reserved rooms information.\r\n"
				+ "7- Exit System.");
	}

	public static void reserveRoom() {
		Scanner input = new Scanner(System.in);
		int number;

		do {
			System.out.println("plese enter a valid room number between 1 and 50:");
			number = input.nextInt();
			if (number <= 50) {
				System.out.println("Thank you, room numner  " + number + "  has been reserved for you.");
				printline();
				mainMenu();
				break;
			} else if (number >= 50) {
				System.out.println("sorry , you have enterd an invalid room number .");
				continue;
			}

		} while (number != 0);

	}

	public static void selectRoomType() {// Method for determining the type of room

		Scanner input = new Scanner(System.in);
		int type;
		do {
			System.out.println("please select the number of room type as foll0w:\n1-Single\n" + "2-Double \n"
					+ "3-King\n" + "4-Deluxe");
			type = input.nextInt();
			if (type <= 4) {
				System.out.println("Thank you, the King room has been reserved for your");
				printline();
				mainMenu();
				break;// If the condition is met, stop

			} else if (type >= 4) {
				System.out.println("sorry , there is no room type with numbr "+type);
				continue;// If the condition is met, return the entry until the desired entry is entered
			}

		} while (type != 0);

	}

	public static void printline() { // Barrier printing method
		System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
	}

	public static void changeRoom() { // Methode change room

		Scanner input = new Scanner(System.in);
		int number;

		do {
			System.out.println("plese enter a valid room number between 1 and 50 ");

			number = input.nextInt();
			if (number <= 50) {
				System.out.println("Thank you, room numner  " + number + "  has been reserved for you");
				printline();
				mainMenu();
				break;// If the condition is met, stop
			} else if (number >= 50) {
				System.out.println("sorry , you have enterd an invalid room number ");
				continue;// If the condition is met, return the entry until the desired entry is entered
			}

		} while (number != 0);

	}

	public static void deleteReservedRoom() {// Methode delete reservation
		Scanner input = new Scanner(System.in);
		int number;

		do {
			System.out.println("plese enter the room number that you want to delete ");
			number = input.nextInt();
			if (number <= 50) {
				System.out.println("Thank you, room number  " + number + "  has been deleted");
				printline();
				mainMenu();
				break; // If the condition is met, stop
			} else if (number >= 50) {
				System.out.println("Sorry, you have enterd an delete room number ");
				continue;// If the condition is met, return the entry until the desired entry is entered
			}

		} while (number != 0);

	}

	public static void deleteAllReservedRoom() {// Method delete all reservations

		System.out.println("Thank you , all your reserved room has been deleted");
		printline();// Call the barrier printing method
		mainMenu();// Call menu method
	}

	public static void showAllReservedRoomsInformation() {// Method show all reservations

		System.out.println("Thank you for booking with us ");
		printline();
		mainMenu();
	}

	public static void ExitSystem() {// Method exit the program

		System.out.println("you are exting the syste, thank you!");

	}
}