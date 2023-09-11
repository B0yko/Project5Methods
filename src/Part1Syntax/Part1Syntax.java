package Part1Syntax;

import java.util.Scanner;
public class Part1Syntax {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hi, now we're going to compare numbers");
        while (true) {
            // Get the first number (fnum) from the user
            double fnum = getNumber("Enter first number:");
            // Get the second number (snum) from the user
            double snum = getNumber("Enter second number:");
            // Calculate the sum of the two numbers
            double equals = fnum + snum;
            // Compare the numbers and show the results through 'comparable' method
            comparable(fnum, snum, equals);
            // Ask the user if he wants to continue
            clarification();
            String answer = in.nextLine();
            if (!answer.equalsIgnoreCase("Y")) {
                System.out.println("Thanks for using our program");
                break;
            }
        }
    }
    // Function for checking the validity of numbers
    public static double getNumber(String request) {
        while (true) {
            System.out.println(request);
            if (in.hasNextDouble()) {
                double num = in.nextDouble();
                in.nextLine();
                return num; // return demonstration
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.nextLine();
            }
        }
    }
    /*
    A function for comparing numbers and showing
    how much should be added to a smaller number to make them equal
    */
    public static void comparable(double fnum, double snum, double equals) {
        if (fnum > snum) {
            System.out.println("First number is bigger");
        } else if (fnum == snum) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Second number is bigger");
        }
        difference(fnum, snum); // Method inside method demonstration
        sum(fnum, snum); // Another method inside method demonstration
        System.out.println("The sum is: " + equals);
    }
    public static void clarification() {
        System.out.println("Do you want to continue?");
    }
    // Function for calculating the sum of numbers
    public static double sum(double fnum, double snum) {
        System.out.println("Do you want to know the sum of these numbers? (Y/N)");
        String sanswer = in.nextLine();
        double equals = fnum + snum;
        if (!sanswer.equalsIgnoreCase("Y")) {
            System.out.println("You will not know their sum :)");
        }
        return equals; // Return demonstration.
    }
    public static void difference(double fnum, double snum) {
        double difference = Math.abs(fnum - snum);
        if (!(fnum == snum)) {
            System.out.println("To make them equal, add " + difference + " to the smaller number.");
        }
    }
}

