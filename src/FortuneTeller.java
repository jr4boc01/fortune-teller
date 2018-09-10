import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

// PART 1  - Accept User Input	
//		
		Scanner input = new Scanner(System.in);

		System.out.println("What is your First Name? ");
		String firstName = input.nextLine();

		System.out.println("What is your Last Name? ");
		String lastName = input.nextLine();

		System.out.println("What is your Age? ");
		int age = input.nextInt();
		input.nextLine();

		System.out.println("What is your Birth Month? ");
		int birthMonth = input.nextInt();
		input.nextLine();

		System.out.println("What is your Favorite ROYGBIV Color? If you are unfamiliar with ROYGBIV type 'Help' ");
		String favColor = input.nextLine();

		// Display ROYGBIV colors at user request for "help"
		if (favColor.equals("help")) {
			System.out.println("The ROYGBIV colors include red, orange, yellow, green, blue, indigo, and violet");
			System.out.println("What is your Favorite ROYGBIV Color?");
			favColor = input.nextLine();
		}

		System.out.println("How many Siblings do you have? ");
		int nbrOfSiblings = input.nextInt();

// PART 2 - Determine Retirement Status 				
//
		// Calculate Years Until Retirement
		int yearsUntilRetirement;
		int remainder = age % 2;
		if (remainder == 0) {
			yearsUntilRetirement = 12;
		} else {
			yearsUntilRetirement = 14;
		}

		// Determine Location of Vacation Home
		String vacationHomeLocation = " ";

		if (nbrOfSiblings < 0) {
			vacationHomeLocation = "Gary, Indiana";
		} else if (nbrOfSiblings == 0) {
			vacationHomeLocation = "Talladega, Alabama";
		} else if (nbrOfSiblings == 1) {
			vacationHomeLocation = "Nassau, Bahamas";
		} else if (nbrOfSiblings == 2) {
			vacationHomeLocation = "Java, Indonesia";
		} else if (nbrOfSiblings == 3) {
			vacationHomeLocation = "Bali, Indonesia";
		} else if (nbrOfSiblings > 3) {
			vacationHomeLocation = "Baton Rouge, LA";
		} else {
			System.out.println("Program error - vacation home");
		}

		// Determine Mode of Transportation
		String modeOfTransportation = " ";

		if (favColor.equals("red")) {
			modeOfTransportation = "Maserati";
		} else if (favColor.equals("orange")) {
			modeOfTransportation = "Bugatti Veyron";
		} else if (favColor.equals("yellow")) {
			modeOfTransportation = "Tesla Model 3";
		} else if (favColor.equals("green")) {
			modeOfTransportation = "skateboard";
		} else if (favColor.equals("blue")) {
			modeOfTransportation = "canoe";
		} else if (favColor.equals("indigo")) {
			modeOfTransportation = "G6";
		} else if (favColor.equals("violet")) {
			modeOfTransportation = "UFO";
		} else {
			System.out.println("Program error - mode of transportation");
		}

		// Determine Bank Balance
		String bankBalance = " ";
		if (birthMonth < 0) {
			System.out.println("Program error - vacation home location");
		} else if (birthMonth <= 4) {
			bankBalance = "$256,000.76";
		} else if (birthMonth <= 8) {
			bankBalance = "$3,687,105.42";
		} else if (birthMonth <= 12) {
			bankBalance = "$86.23";
		} else {
			bankBalance = "$0.00";
		}

// Part 3 - Print/Display Fortune

		System.out.println(firstName + " " + lastName + " will retire in " + yearsUntilRetirement + " years with "
				+ bankBalance + " in the bank, a vacation home in " + vacationHomeLocation + " and travel by "
				+ modeOfTransportation + ".");

		input.close();

	}

}
