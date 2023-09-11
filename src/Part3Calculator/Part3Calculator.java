package Part3Calculator;

import java.util.Scanner;
public class Part3Calculator {
    static Scanner in = new Scanner(System.in);
    static double result = 0;
    public static void main(String[] args) {
        showGreetings();
        while (true) {
            double operand1 = getUserOperand("Enter the first number: ");
            char operation = getUserOperation();
            double operand2 = getUserOperand("Enter the second number: ");

            calculate(operand1, operand2, operation);

            System.out.printf("Result: " + result + '\n');
            if (!askToContinue()) {
                break;
            }
        }
        showGoodbye();
    }
    public static void showGreetings() {
        System.out.println("Hello and welcome to the Basic Calculator");
    }
    public static double getUserOperand(String message) {
        while (true) {
            System.out.println(message);
            if (in.hasNextDouble()) {
                double value = in.nextDouble();
                in.nextLine();
                return value;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.nextLine();
            }
        }
    }
    public static char getUserOperation() {
        System.out.println("Enter the operator (+, -, *, /): ");
        return in.next().charAt(0);
    }
    public static void calculate(double operand1, double operand2, char operation) {
        switch (operation) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Error: Division by zero!");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
        }
    }
    public static boolean askToContinue() {
        System.out.print("Do you want to continue (Y/N)? ");
        char response = in.next().charAt(0);
        return response == 'Y' || response == 'y';
    }
    public static void showGoodbye() {
        System.out.println("Thank you for using the Basic Calculator. Goodbye!");
    }
}
