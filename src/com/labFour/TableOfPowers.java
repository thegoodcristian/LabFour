package com.labFour;

import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {

		//new scanner to allow for user input, as well as a variable to allow the while loop to continue
		
		Scanner scnr = new Scanner(System.in);
		String cont = "yes";
		

		while (cont.equalsIgnoreCase("yes")) {
			
			System.out.println("This table will help you to learn your squares and cubes! Yay!" + "\n"
					+ "\nIf you're ready to see some extreme computation, please enter an integer:");

			//initialize a variable to store the user input number

			
			int userInputNumber = scnr.nextInt();
			
			//I use the printf method to format the table headers properly.
			
			System.out.println();
			System.out.printf("%-9s %-9s %-9s", "Number", "Squared", "Cubed");
			System.out.println();
			System.out.printf("%-9s %-9s %-9s", "=======", "=======", "=======");
			System.out.println();

			//I utilize a for loop to cycle through the numbers, beginning at 1 and ending at userInputNumber
			//I store the squared and cubed valued within variables of corresponding names.
			//I print the formatted results to the console.
			
			for (int i = 1; i <= userInputNumber; i++) {

				System.out.printf("%-10d", i);
				int squared = i * i;
				System.out.printf("%-10d", squared);
				int cubed = i * i * i;
				System.out.println(cubed);
			}

			//I ask if the user if they would like to continue, if "yes", while loop will begin again.
			
			System.out.println("\nDo you want to continue? (yes/no)");
			cont = scnr.next();

		}

		//Otherwise, I bed farewell to the user. I close the scanner to avoid resource leak.
		
		System.out.println("Goodbye!");
		scnr.close();

	}

}
