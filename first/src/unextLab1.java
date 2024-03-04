






//SimpleCalculator
//import java.util.Scanner;
//
//public class unextLab1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            // Input first number
//            System.out.println("Enter the first number:");
//            double num1 = scanner.nextDouble();
//
//            // Input operator
//            System.out.println("Enter the operator (+, -, *, /):");
//            char operator = scanner.next().charAt(0);
//
//            // Input second number
//            System.out.println("Enter the second number:");
//            double num2 = scanner.nextDouble();
//
//            double result = 0;
//
//            // Perform calculation based on the operator
//            switch (operator) {
//                case '+':
//                    result = num1 + num2;
//                    break;
//                case '-':
//                    result = num1 - num2;
//                    break;
//                case '*':
//                    result = num1 * num2;
//                    break;
//                case '/':
//                    if (num2 != 0) {
//                        result = num1 / num2;
//                    } else {
//                        System.out.println("Error: Division by zero!");
//                        continue; // Ask for input again
//                    }
//                    break;
//                default:
//                    System.out.println("Invalid operator!");
//                    continue; // Ask for input again
//            }
//
//            // Display the result
//            System.out.println("Result: " + result);
//
//            // Ask if the user wants to perform another calculation
//            System.out.println("Do you want to perform another calculation? (yes/no)");
//            String playAgain = scanner.next().toLowerCase();
//            if (!playAgain.equals("yes")) {
//                break; // Exit the loop if the user does not want to continue
//            }
//        }
//
//        scanner.close();
//    }
//}





//RockPaperScissors
//import java.util.Random;
//import java.util.Scanner;
//
//public class unext {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        while (true) {
//            // Generate computer's choice
//            int computerChoice = random.nextInt(3); // 0 for rock, 1 for paper, 2 for scissors
//            String[] choices = {"Rock", "Paper", "Scissors"};
//            String computerChoiceString = choices[computerChoice];
//
//            // Prompt user for their choice
//            System.out.println("Enter your choice (Rock, Paper, or Scissors):");
//            String userChoice = scanner.nextLine();
//
//            // Convert user's choice to lowercase for case-insensitive comparison
//            userChoice = userChoice.toLowerCase();
//
//            // Determine the winner
//            if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")) {
//                System.out.println("Computer's choice: " + computerChoiceString);
//                if (userChoice.equals(computerChoiceString.toLowerCase())) {
//                    System.out.println("It's a tie!");
//                } else if ((userChoice.equals("rock") && computerChoiceString.equals("Scissors")) ||
//                           (userChoice.equals("paper") && computerChoiceString.equals("Rock")) ||
//                           (userChoice.equals("scissors") && computerChoiceString.equals("Paper"))) {
//                    System.out.println("You win!");
//                } else {
//                    System.out.println("Computer wins!");
//                }
//            } else {
//                System.out.println("Invalid choice. Please enter Rock, Paper, or Scissors.");
//            }
//
//            // Ask if the user wants to play again
//            System.out.println("Do you want to play again? (yes/no)");
//            String playAgain = scanner.nextLine().toLowerCase();
//            if (!playAgain.equals("yes")) {
//                break;
//            }
//        }
//
//        scanner.close();
//    }
//}




//CurrencyConverter
//import java.util.Scanner;
//
//public class unext {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        
//        // Predefined conversion rates
//        final double USD_TO_EUR = 0.88;
//        final double USD_TO_GBP = 0.78;
//        final double EUR_TO_USD = 1.14;
//        final double EUR_TO_GBP = 0.90;
//        final double GBP_TO_USD = 1.28;
//        final double GBP_TO_EUR = 1.11;
//        
//        while (true) {
//            System.out.println("Currency Converter Menu:");
//            System.out.println("1. USD to EUR");
//            System.out.println("2. USD to GBP");
//            System.out.println("3. EUR to USD");
//            System.out.println("4. EUR to GBP");
//            System.out.println("5. GBP to USD");
//            System.out.println("6. GBP to EUR");
//            System.out.println("7. Exit");
//            System.out.println("Enter your choice:");
//
//            int choice = scanner.nextInt();
//
//            double amount;
//            double convertedAmount;
//
//            switch (choice) {
//                case 1:
//                    System.out.println("Enter amount in USD:");
//                    amount = scanner.nextDouble();
//                    convertedAmount = amount * USD_TO_EUR;
//                    System.out.println(amount + " USD is equal to " + convertedAmount + " EUR.");
//                    break;
//                case 2:
//                    System.out.println("Enter amount in USD:");
//                    amount = scanner.nextDouble();
//                    convertedAmount = amount * USD_TO_GBP;
//                    System.out.println(amount + " USD is equal to " + convertedAmount + " GBP.");
//                    break;
//                case 3:
//                    System.out.println("Enter amount in EUR:");
//                    amount = scanner.nextDouble();
//                    convertedAmount = amount * EUR_TO_USD;
//                    System.out.println(amount + " EUR is equal to " + convertedAmount + " USD.");
//                    break;
//                case 4:
//                    System.out.println("Enter amount in EUR:");
//                    amount = scanner.nextDouble();
//                    convertedAmount = amount * EUR_TO_GBP;
//                    System.out.println(amount + " EUR is equal to " + convertedAmount + " GBP.");
//                    break;
//                case 5:
//                    System.out.println("Enter amount in GBP:");
//                    amount = scanner.nextDouble();
//                    convertedAmount = amount * GBP_TO_USD;
//                    System.out.println(amount + " GBP is equal to " + convertedAmount + " USD.");
//                    break;
//                case 6:
//                    System.out.println("Enter amount in GBP:");
//                    amount = scanner.nextDouble();
//                    convertedAmount = amount * GBP_TO_EUR;
//                    System.out.println(amount + " GBP is equal to " + convertedAmount + " EUR.");
//                    break;
//                case 7:
//                    System.out.println("Exiting...");
//                    scanner.close();
//                    return;
//                default:
//                    System.out.println("Invalid choice. Please enter a number from 1 to 7.");
//            }
//        }
//    }
//}






////TemperatureConverter
//import java.util.Scanner;
//
//public class unext {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        
//        while (true) {
//            System.out.println("Enter the temperature value:");
//            double temperature = scanner.nextDouble();
//            
//            System.out.println("Enter the input unit (C for Celsius, F for Fahrenheit):");
//            char inputUnit = scanner.next().charAt(0);
//            
//            if (inputUnit != 'C' && inputUnit != 'F') {
//                System.out.println("Invalid input unit. Please enter C or F.");
//                continue;
//            }
//            
//            char outputUnit;
//            if (inputUnit == 'C') {
//                outputUnit = 'F';
//                double convertedTemperature = (temperature * 9/5) + 32;
//                System.out.println(temperature + " Celsius is equal to " + convertedTemperature + " Fahrenheit.");
//            } else {
//                outputUnit = 'C';
//                double convertedTemperature = (temperature - 32) * 5/9;
//                System.out.println(temperature + " Fahrenheit is equal to " + convertedTemperature + " Celsius.");
//            }
//            
//            System.out.println("Do you want to convert another temperature? (yes/no)");
//            String response = scanner.next();
//            if (!response.equalsIgnoreCase("yes")) {
//                System.out.println("Exiting...");
//                break;
//            }
//        }
//        
//        scanner.close();
//    }
//}





////NUMBERGUESSING
import java.util.Scanner;

public class unext  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowerBound = 1;
        int upperBound = 100;
        int difficulty = 1;
        int attempts = 0;
        
        while (true) {
            System.out.println("Choose difficulty level:");
            System.out.println("1. Easy (1-100)");
            System.out.println("2. Medium (1-500)");
            System.out.println("3. Hard (1-1000)");
            difficulty = scanner.nextInt();
            switch (difficulty) {
                case 1:
                    upperBound = 100;
                    break;
                case 2:
                    upperBound = 500;
                    break;
                case 3:
                    upperBound = 1000;
                    break;
                default:
                    System.out.println("Invalid input. Please choose a valid difficulty level.");
                    continue;
            }
            int randomNumber = lowerBound + (int) (Math.random() * ((upperBound - lowerBound) + 1));
            System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ". Guess what it is:");
            
            while (true) {
                int userGuess = scanner.nextInt();
                attempts++;
                if (userGuess < randomNumber) {
                    System.out.println("Too low! Try a higher number.");
                } else if (userGuess > randomNumber) {
                    System.out.println("Too high! Try a lower number.");
                } else {
                    System.out.println("Congratulations! You've guessed the number correctly.");
                    System.out.println("It took you " + attempts + " attempts.");
                    break;
                }
            }
            
            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
        
        scanner.close();
    }
}

