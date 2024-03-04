










//GroceryListManager
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//
//public class unextLab2  {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Map to store items by category
//        Map<String, List<String>> groceryList = new HashMap<>();
//
//        // Initialize categories
//        groceryList.put("Fruits", new ArrayList<>());
//        groceryList.put("Vegetables", new ArrayList<>());
//        groceryList.put("Dairy", new ArrayList<>());
//
//        // Grocery list management loop
//        boolean exit = false;
//        while (!exit) {
//            System.out.println("\nGrocery List Manager");
//            System.out.println("1. Add Item");
//            System.out.println("2. Remove Item");
//            System.out.println("3. Check Off Item");
//            System.out.println("4. Print List");
//            System.out.println("5. Exit");
//            System.out.print("Enter your choice: ");
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline
//
//            switch (choice) {
//                case 1:
//                    addItem(scanner, groceryList);
//                    break;
//                case 2:
//                    removeItem(scanner, groceryList);
//                    break;
//                case 3:
//                    checkOffItem(scanner, groceryList);
//                    break;
//                case 4:
//                    printList(groceryList);
//                    break;
//                case 5:
//                    exit = true;
//                    System.out.println("Exiting Grocery List Manager. Goodbye!");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//                    break;
//            }
//        }
//
//        scanner.close();
//    }
//
//    private static void addItem(Scanner scanner, Map<String, List<String>> groceryList) {
//        System.out.print("Enter item name: ");
//        String item = scanner.nextLine();
//        System.out.print("Enter category (Fruits/Vegetables/Dairy): ");
//        String category = scanner.nextLine();
//
//        if (groceryList.containsKey(category)) {
//            groceryList.get(category).add(item);
//            System.out.println(item + " added to " + category + ".");
//        } else {
//            System.out.println("Invalid category. Item not added.");
//        }
//    }
//
//    private static void removeItem(Scanner scanner, Map<String, List<String>> groceryList) {
//        System.out.print("Enter item name to remove: ");
//        String item = scanner.nextLine();
//
//        for (List<String> itemList : groceryList.values()) {
//            if (itemList.remove(item)) {
//                System.out.println(item + " removed from the list.");
//                return;
//            }
//        }
//        System.out.println(item + " not found in the list.");
//    }
//
//    private static void checkOffItem(Scanner scanner, Map<String, List<String>> groceryList) {
//        System.out.print("Enter item name to check off: ");
//        String item = scanner.nextLine();
//
//        for (List<String> itemList : groceryList.values()) {
//            if (itemList.contains(item)) {
//                System.out.println(item + " checked off.");
//                return;
//            }
//        }
//        System.out.println(item + " not found in the list.");
//    }
//
//    private static void printList(Map<String, List<String>> groceryList) {
//        System.out.println("\nGrocery List:");
//        for (Map.Entry<String, List<String>> entry : groceryList.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//    }
//}




//PasswordStrengthChecker
//import java.util.Scanner;
//
//public class unextLab2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user for a password
//        System.out.print("Enter your password: ");
//        String password = scanner.nextLine();
//
//        // Analyze the password
//        boolean hasUppercase = false;
//        boolean hasLowercase = false;
//        boolean hasDigit = false;
//        boolean hasSpecialChar = false;
//
//        for (int i = 0; i < password.length(); i++) {
//            char ch = password.charAt(i);
//            if (Character.isUpperCase(ch)) {
//                hasUppercase = true;
//            } else if (Character.isLowerCase(ch)) {
//                hasLowercase = true;
//            } else if (Character.isDigit(ch)) {
//                hasDigit = true;
//            } else {
//                hasSpecialChar = true;
//            }
//        }
//
//        // Assign a strength level based on the analysis
//        String strengthLevel;
//        if (password.length() < 8) {
//            strengthLevel = "Weak";
//        } else if (hasUppercase && hasLowercase && hasDigit && hasSpecialChar) {
//            strengthLevel = "Strong";
//        } else if ((hasUppercase || hasLowercase) && hasDigit && hasSpecialChar) {
//            strengthLevel = "Medium";
//        } else {
//            strengthLevel = "Weak";
//        }
//
//        // Display the strength level
//        System.out.println("Password Strength: " + strengthLevel);
//
//        scanner.close();
//    }
//}





//import java.util.Scanner;
//
//public class TextAdventureGame {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Game setup
//        String[] locations = {"Forest", "Cave", "Castle"};
//        String[] objects = {"Sword", "Key", "Potion"};
//        String[] characters = {"Wizard", "Dragon", "Knight"};
//
//        // Game introduction
//        System.out.println("Welcome to the Text Adventure Game!");
//        System.out.println("You find yourself in a forest. Your goal is to reach the castle.");
//
//        // Game loop
//        String currentLocation = locations[0]; // Starting location: Forest
//        boolean hasKey = false;
//        boolean hasSword = false;
//
//        while (!currentLocation.equals("Castle")) {
//            // Display current location description
//            System.out.println("\nYou are in the " + currentLocation + ".");
//
//            // Display available options
//            System.out.println("Available actions:");
//            System.out.println("1. Explore");
//            System.out.println("2. Interact with objects");
//            System.out.println("3. Quit");
//
//            // Process user input
//            System.out.print("Enter your choice: ");
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("You explore the surroundings.");
//                    // Add logic for exploring (e.g., encountering characters)
//                    break;
//                case 2:
//                    System.out.println("You look around for objects.");
//                    // Add logic for interacting with objects
//                    break;
//                case 3:
//                    System.out.println("Exiting the game. Goodbye!");
//                    return;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//                    break;
//            }
//        }
//
//        // Player reaches the Castle
//        System.out.println("\nCongratulations! You have reached the Castle and completed the game!");
//        scanner.close();
//    }
//}




//StudentGradeAnalyzer
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class unextLab2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of students: ");
//        int numStudents = scanner.nextInt();
//        scanner.nextLine(); // Consume newline
//
//        String[] studentNames = new String[numStudents];
//        double[] grades = new double[numStudents];
//
//        // Input student names and grades
//        for (int i = 0; i < numStudents; i++) {
//            System.out.print("Enter name of student " + (i + 1) + ": ");
//            studentNames[i] = scanner.nextLine();
//            System.out.print("Enter grade of student " + (i + 1) + ": ");
//            grades[i] = scanner.nextDouble();
//            scanner.nextLine(); // Consume newline
//        }
//
//        // Calculate average, maximum, and minimum grades
//        double sum = 0;
//        double maxGrade = grades[0];
//        double minGrade = grades[0];
//        for (double grade : grades) {
//            sum += grade;
//            maxGrade = Math.max(maxGrade, grade);
//            minGrade = Math.min(minGrade, grade);
//        }
//        double averageGrade = sum / numStudents;
//
//        // Display analysis report
//        System.out.println("\nAnalysis Report:");
//        System.out.println("Student Name\tGrade");
//        for (int i = 0; i < numStudents; i++) {
//            System.out.println(studentNames[i] + "\t\t" + grades[i]);
//        }
//        System.out.println("\nStatistics:");
//        System.out.println("Average Grade: " + averageGrade);
//        System.out.println("Highest Grade: " + maxGrade);
//        System.out.println("Lowest Grade: " + minGrade);
//
//        scanner.close();
//    }
//}
