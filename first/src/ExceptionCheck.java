






//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ExceptionCheck {
//	public ArrayList<String> numberCheck(String str) {
//        ArrayList<String> result = new ArrayList<>();
//
//        for (char c : str.toCharArray()) {
//            try {
//                int num = Integer.parseInt(String.valueOf(c));
//                result.add(String.valueOf(num));
//            } catch (NumberFormatException e) {
//                result.add("For input string: \"" + c + "\"");
//            }
//        }
//
//        return result;
//    }
//
//    // Method to check if the file exists and handle FileNotFoundException
//    public String fileCheck(String filename) {
//        try {
//            File file = new File(filename);
//            if (file.exists()) {
//                return "File Found";
//            } else {
//                throw new FileNotFoundException("File not found: " + filename);
//            }
//        } catch (FileNotFoundException e) {
//            return e.getMessage();
//        }
//    }
//
//    // Main function for testing
//    public static void main(String[] args) {
//        ExceptionCheck exceptionCheck = new ExceptionCheck();
//        Scanner scanner = new Scanner(System.in);
//
//        // Get user input for string
//        System.out.print("Enter a string: ");
//        String str = scanner.nextLine();
//
//        // Test numberCheck method
//        ArrayList<String> numberCheckResult = exceptionCheck.numberCheck(str);
//        System.out.println("Number Check Result: " + numberCheckResult);
//
//        // Get user input for filename
//        System.out.print("Enter a filename: ");
//        String filename = scanner.nextLine();
//
//        // Test fileCheck method
//        String fileCheckResult = exceptionCheck.fileCheck(filename);
//        System.out.println("File Check Result: " + fileCheckResult);
//
//        // Close scanner
//        scanner.close();
//    }
//}

