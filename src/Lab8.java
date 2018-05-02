
//Allison Farr & Mike DeCoopman 5-1-18 Lab 8

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] names = { "Allison", "John", "Mike", "Jill", "Julhasur", "Jonah", "Vicky", "Ben", "Brent", "Tim",
				"Anthony" };
		String[] hometown = { "Dallas", "Detroit", "Chicago", "Seattle", "Traverse City", "San Diego", "Boston",
				"Austin", "Grand Rapids", "Nashville", "Miami" };
		String[] favFood = { "tacos", "pizza", "sushi", "cake", "spaghetti", "potato salad", "fried chicken", "steak",
				"eggs", "pork chops", "spinach pie" };
		String cont = "yes";

		System.out.println("Welcome to our Java class!");

		while (cont.equalsIgnoreCase("yes")) {

			try {
				System.out.println("Which student would you like to learn more about? (enter a number 1-10)");
				int userNum = scan.nextInt();
				int index = userNum - 1;

				if (userNum >= 1 && userNum <= 10) { // validating num1 is between 1 and 10

					System.out.println(
							"Student " + userNum + " is " + names[index] + ". What would you like to know about "
									+ names[index] + "? (Enter \"hometown\" or \"favorite food\"):");
					scan.nextLine(); // garbage line
					String userInput = scan.nextLine();

					if (userInput.equalsIgnoreCase("hometown")) {

						System.out.println(names[index] + " is from " + hometown[index]
								+ ". Would you like to know more? (enter yes or no)");

						cont = scan.next();

					}

					else if (userInput.equalsIgnoreCase("favorite food")) {

						System.out.println(names[index] + "'s favorite food is " + favFood[index]
								+ ". Would you like to know more? (enter yes or no)");

						cont = scan.next();

					} else {
						System.out.println(
								"That data does not exist. Please try again. (Enter \"hometown\" or \"favorite food\"):");
					}

				} else {
					System.out.println("That student does not exist. Please try again.");

				}

				// working on modifying try/catch statement
			} catch (IndexOutOfBoundsException e) {
				scan.nextLine();
				System.out.println("An error has occured");
				e.printStackTrace();
			} catch (IllegalArgumentException f) {
				scan.nextLine();
				System.out.println("An error has occured");
				f.printStackTrace();
			} catch (InputMismatchException g) {
				System.out.println("An error has occured....");
				g.printStackTrace();
			}
		}
		System.out.println("Goodbye!");

	}

}
