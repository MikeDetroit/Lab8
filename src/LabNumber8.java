import java.util.Scanner;

//Alli Farr 5-1-18 Lab 8

public class LabNumber8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] names = { "Allison", "John", "Mike", "Julhasur", "Jill", "Jonah", "Vicky", "Ben", "Brent", "Tim", "Anthony" };
		String[] hometown = { "Dallas", "Detroit", "Chicago", "Seattle","Traverse City", "San Diego", "Boston", "Austin",
				"Grand Rapids", "Nashville", "Miami" };
		String[] favFood = { "tacos", "pizza", "sushi", "cake", "spaghetti"," ribs", "fried chicken", "steak", "eggs benedict",
				"pork chops", "spinach pie" };
		String cont = "yes";

		System.out.println("Welcome to our Java class!");

		int userNum = Validator.getInt(scan, "Which student would you like to learn more about? (enter a number 1-11)\n",
				1, 11);

		int index = userNum - 1;
		
		

//		System.out.println("Student " + userNum + " is " + names[index] + ". What would you like to know about "
//				+ names[index] + "? (Enter \"hometown\" or \"favorite food\"):");
		
		
		
		
		//scan.nextLine(); // garbage line
		String userInput = Validator.getString(scan,"Student " + userNum + " is " + names[index] + ". What would you like to know about "
				+ names[index] + "? (Enter \"hometown\" or \"favorite food\"):\n");
		System.out.println(userInput);
		
		//validating hometown
		String answer = Validator.getString(scan, names[index] + " is from " )
		
		
		//validating favorite food
		
		

		
		
		
		
		
		
		
		
		
		

	}
	
	
	
}