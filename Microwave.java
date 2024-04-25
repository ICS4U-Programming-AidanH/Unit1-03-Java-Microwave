
/***

 A program to calculate how long you must warm up your food for in the microwave.

* @author  Aidan Harvey

* @version 1.1

* @since   04-24-2024

*/

import java.util.Scanner;
//Imports the scanner

public class Microwave {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Creates a new scanner class

        int time = 0;
        //Sets a base value for microwave time

        try {
        System.out.println("Choose an item to warm up:");
        //Asks user for input
        System.out.println("1: Sub");
        System.out.println("2: Soup");
        System.out.println("3: Pizza");
        //Gives users choices

        int userInput = sc.nextInt();
        //Creates an int for user input
        

        if (userInput > 3) {
            System.out.println("This is not an option. Please select from the listed choices above.");
        } else if (userInput == 3) {
            System.out.println("You have selected: Pizza");
        } else if (userInput == 2) {
            System.out.println("You have selected: Soup");
        } else if (userInput == 1) {
            System.out.println("You have selected: Sub");
        }
        //Various dialogue for confirmation of food item selection

        System.out.println("How many of your selected food choice do you have?");
        int quantity = sc.nextInt();
        //Asks for amount of items for time calculations

        if (userInput == 3) {
            if (quantity == 1) {
                time = 45; //Base
            }
        }
        
        if (userInput == 3) {
            if (quantity == 2) {
                time = 90; //Base + 50%
            }
        }
        
        if (userInput == 3) {
            if (quantity == 3) {
                time = 120; //Base + 100%
            }
        }
        //Pizza times

        if (userInput == 2) {
            if (quantity == 1) {
                time = 105; //Base
            }
        }
        
        if (userInput == 2) {
            if (quantity == 2) {
                time = 158; //Base + 50%
            }
        }
        
        if (userInput == 2) {
            if (quantity == 3) {
                time = 210; //Base + 100%
            }
        }
        //Soup times

        if (userInput == 1) {
            if (quantity == 1) {
                time = 60;
            }
        }
        
        if (userInput == 1) {
            if (quantity == 2) {
                time = 90;
            }
        }
        
        if (userInput == 1) {
            if (quantity == 3) {
                time = 120;
            }
        }

        int minutes = time / 60;
        int seconds = time % 60;
        //Base calculation times

        System.out.println("You must heat your food for:" + minutes + "minute(s)," + seconds + "seconds.");

        sc.close();
        //Closes scanner


         } catch (Exception e) {
        System.out.println("Invalid input. Please select a food option.");
        }

    }
}