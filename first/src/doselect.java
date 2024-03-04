//public class doselect {
//    public String decodeMessage(String message) {
//        // Remove all vowels from the string        
//        return message.replaceAll("[aeiouAEIOU]", "");
//    }
//
//    public String encodeMessage(String message) {
//        StringBuilder encodedMessage = new StringBuilder();
//        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
//        int vowelIndex = 0;
//
//        for (char c : message.toCharArray()) {
//            if (Character.isWhitespace(c)) {
//                encodedMessage.append(c); // Space, no need to add a vowel
//            } else {
//                // Add vowels in a circular way                
//                if (Character.isLowerCase(c)) {
//                    encodedMessage.append(vowels[vowelIndex]);
//                } else {
//                    encodedMessage.append(Character.toUpperCase(vowels[vowelIndex]));
//                }
//                vowelIndex = (vowelIndex + 1) % vowels.length;
//            }
//        }
//        return encodedMessage.toString();
//    }
//
//    public static void main(String[] args) {
//        doselect obj = new doselect();
//
//        String decodedMessage = obj.decodeMessage("oriGinal MessAge");
//        System.out.println(decodedMessage);
//
//        String encodedMessage = obj.encodeMessage("QWRT cvbN MnKL");
//        System.out.println(encodedMessage);
//    }
//}







//class StringPlay {
//    public int convert;
//
//    public StringPlay() {
//        // Empty constructor
//    }
//}
//
//class StringMethods {
//    public int convertToInt(StringPlay sp, String str) {
//        sp.convert = Integer.parseInt(str);
//        return sp.convert;
//    }
//
//    public int getMax(StringPlay sp, String str, char ch) {
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == ch) {
//                count++;
//            }
//        }
//        sp.convert = count;
//        return count;
//    }
//}
//
//public class doselect {
//    public static void main(String[] args) {
//        StringMethods sm = new StringMethods();
//        StringPlay sp = new StringPlay();
//
//        System.out.println(sm.getMax(sp, "fgfgfgf", 'g')); // Output: 3
//        System.out.println(sm.convertToInt(sp, "123")); // Output: 123
//    }
//}









//import java.util.Scanner;
//
//class MinAge {
//    String mla;
//    String factory;
//    String governor;
//}
//
//class IllegalAgeException extends Exception {
//    public IllegalAgeException(String s) {
//        super(s);
//    }
//}
//
//class ExceptionCheck {
//    public String mlaCheck(MinAge a, int age) {
//        try {
//            if (age < 21) {
//                a.mla = "illegal";
//                throw new IllegalAgeException("Illegal MLA age");
//            } else {
//                a.mla = "legal";
//            }
//        } catch (IllegalAgeException e) {
//            return e.getMessage();
//        }
//        return a.mla;
//    }
//
//    public String factoryCheck(MinAge a, int age) {
//        try {
//            if (age < 14) {
//                a.factory = "illegal";
//                throw new IllegalAgeException("Illegal factory age");
//            } else {
//                a.factory = "legal";
//            }
//        } catch (IllegalAgeException e) {
//            return e.getMessage();
//        }
//        return a.factory;
//    }
//
//    public String governorCheck(MinAge a, int age) {
//        try {
//            if (age < 35) {
//                a.governor = "illegal";
//                throw new IllegalAgeException("Illegal governor age");
//            } else {
//                a.governor = "legal";
//            }
//        } catch (IllegalAgeException e) {
//            return e.getMessage();
//        }
//        return a.governor;
//    }
//}
//
//public class doselect {
//    public static void main(String[] args) {
//        MinAge minAge = new MinAge();
//        ExceptionCheck exceptionCheck = new ExceptionCheck();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter age: ");
//        int age = scanner.nextInt();
//
//        System.out.println("MLA: " + exceptionCheck.mlaCheck(minAge, age));
//        System.out.println("Factory: " + exceptionCheck.factoryCheck(minAge, age));
//        System.out.println("Governor: " + exceptionCheck.governorCheck(minAge, age));
//
//        scanner.close();
//    }
//}








//CATCH ME IF YOU CAN
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//class ExceptionCheck {
//    // Method to check if the input string contains numbers
//    public ArrayList<String> numberCheck(String str) {
//        ArrayList<String> result = new ArrayList<>();
//
//        for (char c : str.toCharArray()) {
//            try {
//                // Attempt to parse the character as a number
//                int num = Integer.parseInt(String.valueOf(c));
//                result.add(String.valueOf(num));
//            } catch (NumberFormatException e) {
//                // Catch NumberFormatException and add the default exception message
//                result.add(e.getMessage());
//            }
//        }
//
//        return result;
//    }
//
//    // Method to check if the file exists in the current directory
//    public String fileCheck(String filename) {
//        try {
//            File file = new File(filename);
//            if (file.exists()) {
//                return "File Found";
//            } else {
//                throw new FileNotFoundException(filename + " " + "(No such file or directory)");
//            }
//        } catch (FileNotFoundException e) {
//            return e.getMessage();
//        }
//    }
//}
//
//public class doselect {
//    public static void main(String args[]) throws Exception {
//        // Implement main() to check your program
//        ExceptionCheck exceptionCheck = new ExceptionCheck();
//
//        // Test numberCheck method
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a string to check for numbers: ");
//        String str = sc.nextLine();
//        ArrayList<String> resultNumberCheck = exceptionCheck.numberCheck(str);
//        System.out.println("Number Check Result: " + resultNumberCheck);
//
//        // Test fileCheck method
//        System.out.print("Enter a filename to check its existence: ");
//        String filename = sc.nextLine();
//        String resultFileCheck = exceptionCheck.fileCheck(filename);
//        System.out.println("File Check Result: " + resultFileCheck);
//
//        sc.close();
//    }
//}










////QUESTION 6
//import java.util.Scanner;
//
//
//public class Source {
//    public static void main(String[] args) throws Exception{
//        try {
//            Scanner scanner = new Scanner(System.in);
//            int size = scanner.nextInt();
//            scanner.nextLine(); // Consume newline character
//            
//            if (size < 0) {
//                
//               System.out.println("INVALID INPUT"); 
//            }
//            
//            String[] designations = new String[size];
//
//            for (int i = 0; i < size; i++) {
//                designations[i] = scanner.nextLine();
//            }
//
//            int count = 0;
//            for (String designation : designations) {
//                if (designation.contains("HR")) {
//                    count++;
//                }
//            }
//            if (count > 0) {
//                System.out.println("Total " + count + " designations in HR Department");
//                for (String designation : designations) {
//                    if (designation.contains("HR")) {
//                        System.out.println(designation.toUpperCase());
//                    }
//                }
//            } else {
//                System.out.println("No designation of HR department found in given data");
//            }
//            scanner.close();
//        } catch (Exception e) {
//            e.getMessage();
//        }
//    }
//}


//import java.util.Scanner;
//import java.util.*;
// 
//class Encryption{
//  // Write your code here..
//  public String decodeMessage(String message){
//	  String m1 = message.replaceAll("[aeiouAEIOU]","");
//	  return m1;
// 
//  }
// 
//  public String encodeMessage(String message){
//		String s2 = "aeiou";
//		String f = "";
//		for(int i=0;i<message.length();i++){
//			char current = message.charAt(i);
//			if(current == ' ') {
//				f=f+" ";
//			}
//			else {
//				int j= i% s2.length();
//				f= f+current + String.valueOf(s2.charAt(j));
//			}
//		}
//
//
//	  return f;
// 
//  }
//}
// 
//public class doselect {
//	public static void main(String args[] ) throws Exception {
//		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
//		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		//String s2 = sc.next();
//		Encryption e = new Encryption();
//		String decoded = e.decodeMessage(s);
//		System.out.println(decoded);
//		String encoded = e.encodeMessage("QWRT cvbN MnKL");
//		System.out.println(encoded);
//	}
//}




////QUESTION 05(one testcase not passed)
//import java.util.*;
//
//public class doselect {
//    // Global variable to store the consolidated feedback
//    static List<Integer> feedback = new ArrayList<>();
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Read the size of the arrays
//        int size = scanner.nextInt();
//        if (size < 0) {
//            System.out.println("Invalid array size");
//            return;
//        }
//
//        // Read the MetLife feedback array
//        int[] metlife = new int[size];
//        for (int i = 0; i < size; i++) {
//            metlife[i] = scanner.nextInt();
//            if (metlife[i] < 0) {
//                System.out.println("Invalid input");
//                return;
//            }
//        }
//
//        // Read the Hartford feedback array
//        int[] hartford = new int[size];
//        for (int i = 0; i < size; i++) {
//            hartford[i] = scanner.nextInt();
//            if (hartford[i] < 0) {
//                System.out.println("Invalid input");
//                return;
//            }
//        }
//
//        // Consolidate the feedback
//        highestFeedback(metlife, hartford, size);
//
//        // Print the consolidated feedback
//        for (int i = 0; i < feedback.size(); i += 2) {
//            System.out.println(feedback.get(i) + "\n" + feedback.get(i + 1));
//        }
//
//        scanner.close();
//    }
//
//    // Method to create consolidated feedback for managers
//    public static void highestFeedback(int[] metlife, int[] hartford, int size) {
//        Map<Integer, Integer> map = new HashMap<>();
//        
//        // Store MetLife feedback
//        for (int i = 0; i < size; i += 2) {
//            int employeeId = metlife[i];
//            int score = metlife[i + 1];
//            map.put(employeeId, Math.max(map.getOrDefault(employeeId, 0), score));
//        }
//        
//        // Store Hartford feedback
//        for (int i = 0; i < size; i += 2) {
//            int employeeId = hartford[i];
//            int score = hartford[i + 1];
//            map.put(employeeId, Math.max(map.getOrDefault(employeeId, 0), score));
//        }
//
//        // Convert map to list for output
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            feedback.add(entry.getKey());
//            feedback.add(entry.getValue());
//        }
//    }
//}







////QUESTION 04
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//// Class name should be "Source",
//// otherwise solution won't be accepted
//public class doselect {
//    public static void main(String[] args) {
//        
//        Scanner in = new Scanner(System.in);
//        int a;
//        a = in.nextInt();
//        
//        if(a<0){
//            System.out.println("Number too small");
//        }
//        else if(a>32767){
//            System.out.println("Number too large");
//        }
//        else if(isPowerOfTwo(a)){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }
//        in.close();
//   }
//   public static boolean isPowerOfTwo(int n){
//       return n>0 && (n & (n-1))==0;
//   }
//}






//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//// Class name should be "Source",
//// otherwise solution won't be accepted
//public class doselect {
//    public static void main(String[] args) {
//        
//        Scanner in = new Scanner(System.in);
//        int a;
//        a = in.nextInt();
//        if(a<0){
//            System.out.println("Invalid array size");
//        }
//
//        int[] b= new int[a];
//        for(int i=0; i<a;i++){
//            b[i]=in.nextInt();
//            if(b[i]<0){
//                System.out.println("Invalid input");
//                return;
//            }
//        }
//        System.out.println(maximumSum(b, a));
//        in.close();
//   }
//   public static int maximumSum(int numbers[], int size){
//            int evenSum=0;
//            int oddSum=0;
//           for(int i=0; i<size; i++){
//           
//               if(numbers[i]%2 == 0){
//                   evenSum += numbers[i];
//               }
//               else{
//                   oddSum+=numbers[i];
//               }
//           }
//           return Math.max(evenSum,oddSum);
//        }
//}






//
////QUESTION 2
//import java.util.Scanner;
//
//public class doselect{
//    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            // System.out.println("Enter the first integer:");
//            int n1 = scanner.nextInt();
//
//            // System.out.println("Enter the second integer:");
//            int n2 = scanner.nextInt();
//             if (n1==n2) {
//                System.out.println(0);
//            }
//            else if (isPrime(n1) && isPrime(n2)) {
//                System.out.println( Math.max(n1, n2));
//            } 
//            else  {
//                System.out.println( Math.min(n1, n2));
//            }
//             
//        } catch (Exception e) {
//            System.out.println( e.getMessage());
//        } 
//            scanner.close();
//        
//    }
//
//    public static boolean isPrime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//        for (int i = 2; i * i <= n; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}






//import java.util.ArrayList;
//import java.util.List;
//
//class Company {
//    private String companyName;
//    private String type;
//    private int turnover;
//
//    public Company(String companyName, String type, int turnover) {
//        this.companyName = companyName;
//        this.type = type;
//        this.turnover = turnover;
//    }
//
//    public String getCompanyName() {
//        return companyName;
//    }
//
//    public void setCompanyName(String companyName) {
//        this.companyName = companyName;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public int getTurnover() {
//        return turnover;
//    }
//
//    public void setTurnover(int turnover) {
//        this.turnover = turnover;
//    }
//}
//
//class Record {
//    public List<Company> companies;
//
//    public Record() {
//        this.companies = new ArrayList<>();
//    }
//
//    public String addCompany(Company company) {
//        companies.add(company);
//        return "Added";
//    }
//
//    public String filterData(String query) {
//        String[] parts = query.split("==|>=|<=");
//        if (parts.length < 3) {
//            return "Invalid query";
//        }
//        String attribute = parts[0].trim();
//        String operator = parts[1].trim();
//        String value = parts[2].trim().replace("\"", "");
//
//        if (!operator.equals("==") && !operator.equals(">=") && !operator.equals("<=")) {
//            return "Invalid operator";
//        }
//
//        if (attribute.equals("type") && !operator.equals("==")) {
//            return "Invalid operator";
//        }
//
//        if (!attribute.equals("type")) {
//            return "Invalid";
//        }
//
//        return byType(value);
//    }
//
//    private String byType(String value) {
//        StringBuilder result = new StringBuilder();
//        for (Company company : companies) {
//            if (company.getType().equals(value)) {
//                result.append(company.getCompanyName()).append(", ");
//            }
//        }
//        return result.length() > 0 ? result.substring(0, result.length() - 2) : "No companies found";
//    }
//}
//
//public class doselect {
//    public static void main(String[] args) throws Exception{
//        try {
//            Company c1 = new Company("Doselect", "IT", 300);
//            Record record = new Record();
//            System.out.println(record.addCompany(c1)); // Output: Added
//
//            // Example of filtering data
//            String query = "type == \"IT\"";
//            System.out.println(record.filterData(query)); // Output: Doselect
//        } catch (Exception e) {
//            System.out.println("An error occurred: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
//}




//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class doselect {
//    HashMap<String, ArrayList<String>> mobileList = new HashMap<>();
//
//    public String addMobile(String company, String model) {
//        if (!mobileList.containsKey(company)) {
//            mobileList.put(company, new ArrayList<>());
//        }
//        ArrayList<String> modelsList = mobileList.get(company);
//        if (!modelsList.contains(model)) {
//            modelsList.add(model);
//            return "model successfully added";
//        } else {
//            return "model already exists";
//        }
//    }
//
//    public ArrayList<String> getModels(String company) {
//        if (mobileList.containsKey(company)) {
//            return mobileList.get(company);
//        } else {
//            return null;
//        }
//    }
//
//    public String buyMobile(String company, String model) {
//        if (mobileList.containsKey(company)) {
//            ArrayList<String> modelsList = mobileList.get(company);
//            if (modelsList.contains(model)) {
//                modelsList.remove(model);
//                return "mobile sold successfully";
//            } else {
//                return "item not available";
//            }
//        } else {
//            return "item not available";
//        }
//    }
//
//    public static void main(String[] args) {
//        doselect obj = new doselect();
//        System.out.println(obj.addMobile("Oppo", "K3")); // model successfully added
//        System.out.println(obj.getModels("Oppo")); // [K3]
//        System.out.println(obj.buyMobile("Oppo", "K3")); // mobile sold successfully
//    }
//}





//QUESTION 12
//class Rating {
//  //Your Code Goes Here..
//  int imdbRating;
//  int nominee;
//  public Rating(int imdbRating, int nominee){
//	  this.imdbRating=imdbRating;
//	  this.nominee=nominee;
//  }
//}
//
//class Validator {
//  //Your Code Goes Here..
//  int imdbRating;
//  int nominee;
//  public String canBeConsideredForTheAward(Rating rating) throws Exception{
//	  try{
//		  if(rating.imdbRating < 7){
//			  throw new MovieRatingException ("Movie not eligible for Filmfare award");
//		  }
//		   if(rating.nominee<4){
//			  throw new MovieRatingException ("Minimum 4 nominee required");
//		  }
//		  return "Considered for the award";
//	  }
//	  catch(MovieRatingException e){
//		  throw e;
//	  }
//  }
//  public String sendInvite(Rating rating) throws Exception{
//	  try{
//		  canBeConsideredForTheAward(rating);
//		  return "Actors and Directors Invited";
//	  }
//	  catch(MovieRatingException e){
//		  return "Not invited";
//	  }
//	  catch(Exception e){
//		  return "other exception";
//	  }
//  }
//}
//class MovieRatingException extends Exception{
//	public MovieRatingException(String msg){
//		super (msg);
//	}
//}
//
//public class doselect{
//	public static void main(String args[] ) throws Exception {
//		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
//		Rating rating = new Rating(9, 7);
//		Validator v = new Validator();
//
//		String s = v.canBeConsideredForTheAward(rating);
//		String t = v.sendInvite(rating);
//		s.toLowerCase();
//		t.toLowerCase();
//		System.out.println(s);
//		System.out.println(t);	
//	}
//}




//QUESTION 10
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Customer {
  // Write code from here..
    int  id;
          String name;
		  double walletBalance;
		  String address;
      public Customer(int  id,String name,double walletBalance,String address){
        this.id=id;
        this.name=name;
        this.walletBalance=walletBalance;
        this.address=address;
      }
}
class Item {
  // Write code from here..
  int id;
 	   String name;
  	   String companyName;
  	   double price;
  	   boolean isInStock;

       public Item(int id,String name,String companyName,double price,boolean isInStock){
         this.id=id;
         this.name=name;
         this.companyName=companyName;
         this.price=price;
         this.isInStock=isInStock;
       }
}

class ShoppingWebsite {
  // Write code from here..
  public String purchaseItem(Item i, Customer c) throws ItemOutOfStockException, InsufficientBalanceException{
    if(!i.isInStock){
      throw new ItemOutOfStockException("item is out of stock");
    }
    else if(i.price>c.walletBalance){
      throw new InsufficientBalanceException("customer wallet balance is not sufficient");
    }
    else{
      return "Order Successful";
    }
  }
}


class InsufficientBalanceException extends Exception {
  // Write code from here..
  public InsufficientBalanceException(String message){
      
  }
}
class ItemOutOfStockException extends Exception{
  // Write code from here..
  public ItemOutOfStockException(String message){
     
  }
}
public class doselect {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
    Customer cusDet=new Customer(927392, "Steve" ,5000.0, "USA");
    Item itemDet = new Item(27392, "T-Shirt", "US polo", 800, true);
    ShoppingWebsite obj = new ShoppingWebsite();
    try{
      
      String out = obj.purchaseItem(itemDet, cusDet);   
      System.out.println(out);
    }
    catch(InsufficientBalanceException | ItemOutOfStockException e){
      System.out.println(e.getMessage());
    }
	}
}


//VACCINATION
//import java.util.ArrayList;
//
//class Vaccine {
//    private int age;
//    private float dosage;
//
//    public Vaccine(int age) {
//        this.age = age;
//    }
//
//    // Getter and setter for age
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    // Getter and setter for dosage
//    public float getDosage() {
//        return dosage;
//    }
//
//    public void setDosage(float dosage) {
//        this.dosage = dosage;
//    }
//}
//
//class VaccinationCamp {
//    ArrayList<Vaccine> list = new ArrayList<>();
//
//    public void assignVaccine() {
//        for (Vaccine vaccine : list) {
//            int age = vaccine.getAge();
//            if (age >= 45) {
//                vaccine.setDosage(250f);
//            } else if (age >= 20) {
//                vaccine.setDosage(200f);
//            } else {
//                vaccine.setDosage(100f);
//            }
//        }
//    }
//
//    public float vaccineInjected() {
//        float totalDosage = 0f;
//        for (Vaccine vaccine : list) {
//            totalDosage += vaccine.getDosage();
//        }
//        return totalDosage;
//    }
//}
//
//public class doselect {
//    public static void main(String[] args) {
//        VaccinationCamp vc = new VaccinationCamp();
//        vc.list.add(new Vaccine(49));
//        vc.list.add(new Vaccine(26));
//        vc.list.add(new Vaccine(19));
//        vc.assignVaccine();
//        System.out.println(vc.vaccineInjected()); // Output: 550.0
//    }
//}





//import java.util.ArrayList;
//
//class Vaccine {
// private int age;
//  private float dosage;
//
//  public Vaccine(int age){
//	  this.age=age;
//	 setDosage();
//  }
//  public int getAge(){
//	  return age;
//  }
//  public void setAge(int age){
//	  this.age=age;
//	  setDosage();
//  }
//  public float getDosage(){
//	  return dosage;
//  }
//  private void setDosage(){
//	 if(age>=45) {
//		 dosage=250.0f;
//	 }
//	 else if(age>=20) {
//		 dosage =200.0f;
//	 }
//	 else {
//		 dosage=100.0f;
//	 }
//  }
//}
//
//class VaccinationCamp {
//  ArrayList<Vaccine> list=new ArrayList<Vaccine>();
//  	public VaccinationCamp() {
//  		
//  	}
//	public void assignVaccine(){
//		
//	}
//
//public float vaccineInjected() {
//	float totalDosage=0.0f;
//	for(Vaccine vaccine:list) {
//		totalDosage+=vaccine.getDosage();
//	}
//	return totalDosage;
//}
//}
//
//public class doselect {
//	public static void main(String args[] ) throws Exception {
//		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
//	VaccinationCamp vc=new VaccinationCamp();
//	vc.list.add(new Vaccine(49));
//	vc.list.add(new Vaccine(26));
//	vc.list.add(new Vaccine(19));
//	vc.assignVaccine();
//	System.out.println(vc.vaccineInjected());
//	}
//}


//import java.util.ArrayList;
//import java.util.List;
//
//class Company {
//    private String companyName;
//    private String type;
//    private int turnover;
//
//    public Company(String companyName, String type, int turnover) {
//        this.companyName = companyName;
//        this.type = type;
//        this.turnover = turnover;
//    }
//
//    // Getters and setters
//    public String getCompanyName() {
//        return companyName;
//    }
//
//    public void setCompanyName(String companyName) {
//        this.companyName = companyName;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public int getTurnover() {
//        return turnover;
//    }
//
//    public void setTurnover(int turnover) {
//        this.turnover = turnover;
//    }
//}
//
//class Record {
//    public List<Company> companies = new ArrayList<>();
//
//    public String addCompany(Company company) {
//        companies.add(company);
//        return "Added";
//    }
//
//    public String filterData(String query) {
//        String[] parts = query.split(" == ");
//        if (parts.length != 2) {
//            return "Invalid query";
//        }
//        String attributeName = parts[0];
//        String[] operatorAndValue = parts[1].split(" ");
//        if (operatorAndValue.length != 2) {
//            return "Invalid query";
//        }
//        String operator = operatorAndValue[0];
//        String value = operatorAndValue[1];
//        if (!operator.equals("==") && !operator.equals(">=") && !operator.equals("<=")) {
//            return "Invalid operator";
//        }
//        if (!attributeName.equals("type")) {
//            return "Invalid";
//        }
//        return byType(value);
//    }
//
//    private String byType(String type) {
//        StringBuilder result = new StringBuilder();
//        for (Company company : companies) {
//            if (company.getType().equals(type)) {
//                result.append(company.getCompanyName()).append("\n");
//            }
//        }
//        return result.toString();
//    }
//}
//
//public class doselect {
//    public static void main(String[] args) {
//        Company c1 = new Company("Doselect", "IT", 300);
//        Record record = new Record();
//        System.out.println(record.addCompany(c1)); // Output: Added
//    }
//}


//RECORD IT
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//class Company{
//  private String companyName;
//  private String type;
//  private int turnover;
//  public Company(String companyName, String type, int turnover){
//	  this.companyName=companyName;
//	  this.type=type;
//	  this.turnover=turnover;
//  }
//  public String getcompanyName(){
//	  return companyName;
//  }
//  public void setcompanyName(String companyName){
//	  this.companyName=companyName;
//  }
//  public String gettype(){
//	  return type;
//  }
//  public void settype(String type){
//	  this.type=type;
//  }
//  public int getturnover(){
//	  return turnover;
//  }
//  public void setturnover(int turnover){
//	  this.turnover=turnover;
//  }
//}
//
//class Record{
//  //Define all the variables and methods here
// public List<Company> companies=new ArrayList<Company>();
//  public String addCompany(Company company){
//	  companies.add(company);
//	  return "Added";
//  }
//  public String filterData(String query){
//	  String[] entities= query.split("\\s+");
//	  if(entities.length<3){
//		  return "Invalid query";
//	  }
//	  String attribute= entities[0];
//	  String operator= entities[1];
//	  String value= entities[2];
//	  if(!operator.equals ("==") && !operator.equals (">=") && !operator.equals("<="))
//			 {
//		  return "Invalid operator";
//	  }
//	  if(attribute.equals("type") && operator.equals("==")){
//		  return "Invalid operator";
//	  }
//	  if(!attribute.equals("type") ){
//		  return "Valid";
//	  }
//	  if(attribute.equals("type")&& operator.equals("==")){
//		  return filterByType(value);
//	  }
//		return "Invalid";
//  }
//  private String filterByType(String type) {
//	  List<Company> filteredCompanies=new ArrayList<>();
//	  for(Company company:companies) {
//		  if(company.gettype().equals(type)) {
//			  filteredCompanies.add(company);
//		  }
//	  }
//	  StringBuilder result=new StringBuilder("Filtered Companies");
//	  for (Company company : filteredCompanies) {
//	        result.append(company.getcompanyName()).append(", ").append(company.gettype()).append(", ").append(company.getturnover()).append("\n");
//	    }
//	    return result.toString();
//  }
//}
//public class doselect{
//	public static void main(String args[] ) throws Exception {
//		
//		Company c1=new Company("Doselect","IT",300);
//		Record record= new Record();
//		System.out.println(record.addCompany(c1));
//	}
//}


//VALID COUPON
// class Product {
//    // Data members
//    String name;
//    double price;
//    String coupon;
//
//    // Parameterized constructor
//    public Product(String name, double price, String coupon) {
//        this.name = name;
//        this.price = price;
//        this.coupon = coupon;
//    }
//}
//
//class InvalidCouponException extends Exception {
//    // Parameterized constructor
//    public InvalidCouponException(String msg) {
//        super(msg);
//    }
//}
//
//class Validator {
//    // Method to validate coupon
//    public String validateCoupon(Product p) throws InvalidCouponException {
//        if (!isValidCouponFormat(p.coupon)) {
//            throw new InvalidCouponException("Invalid Coupon");
//        }
//
//        String[] couponParts = p.coupon.split("-");
//        String couponName = couponParts[0];
//        int discountValue;
//        try {
//            discountValue = Integer.parseInt(couponParts[1]);
//        } catch (NumberFormatException e) {
//            throw new InvalidCouponException("Invalid Coupon");
//        }
//
//        if (!isValidDiscountValue(discountValue)) {
//            throw new InvalidCouponException("Invalid Coupon");
//        }
//
//        return "valCop = \"Valid Coupon\"";
//    }
//
//    // Method to check if coupon format is valid
//    private boolean isValidCouponFormat(String coupon) {
//        return coupon != null && coupon.matches("^[A-Za-z]+-[0-9]+$");
//    }
//
//    // Method to check if discount value is valid (between 10 and 25)
//    private boolean isValidDiscountValue(int discountValue) {
//        return discountValue >= 10 && discountValue <= 25;
//    }
//
//    // Method to calculate net price
//    public double netPrice(Product p) {
//        try {
//            validateCoupon(p);
//            double discount = Integer.parseInt(p.coupon.split("-")[1]);
//            double discountAmount = (discount / 100.0) * p.price;
//            return p.price - discountAmount;
//        } catch (InvalidCouponException e) {
//            return p.price; // Coupon is invalid, return total price
//        }
//    }
//}
//
//public class doselect {
//    public static void main(String[] args) throws Exception {
//
//        Product obj = new Product("IPhone", 25000, "IPhone-10");
//
//        Validator val = new Validator();
//
//        try {
//
//            String valCop = val.validateCoupon(obj);
//            System.out.println(valCop);
//
//            double price = val.netPrice(obj);
//            System.out.println("price = " + price);
//        } catch (InvalidCouponException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}



//WORK HARD
//class Employee {
//    String name;
//    String projectName;
//    int workingHrs;
//    int bonus;
//
//    public Employee(String name, String projectName, int workingHrs) {
//        this.name = name;
//        this.projectName = projectName;
//        this.workingHrs = workingHrs;
//        this.bonus = 0;
//    }
//
//    public String setBonus() {
//        if (isProject() && workingHrs >= 30) {
//            bonus = workingHrs / 10;
//            return "Congrats";
//        } else {
//            return "Work hard";
//        }
//    }
//
//    public String generateId() {
//        int minLength = Math.min(name.length(), projectName.length());
//        StringBuilder generatedId = new StringBuilder();
//        for (int i = 0; i < minLength; i++) {
//            generatedId.append(name.charAt(i)).append(projectName.charAt(i));
//        }
//        generatedId.append(workingHrs);
//        return generatedId.toString();
//    }
//
//    private boolean isProject() {
//        String[] isProjects = { "web", "tech", "hack", "SD", "PD" };
//        for (String isProjectss : isProjects) {
//            if (isProjectss.equals(projectName)) {
//                return true;
//            }
//        }
//        return false;
//    }
//}
//
//
//public class doselect {
//	public static void main(String args[] ) throws Exception {
//		// Scanner sc=new Scanner(System.in);
//		// String name=sc.nextLine();
//		// String projectName=sc.nextLine();
//		// int workingHrs=sc.nextInt();
//
//		Employee e=new Employee("doselect","hack",30);
//
////		String bMsg= e.setBonus();
////		System.out.println(bMsg);
//
//		String generateId= e.generateId();
//		System.out.println(generateId);
//		// sc.close();
//
//	}
//}







//DISTANCING
//public class doselect {
// 
//    public int distance(String word1, String word2) {
//        int m = word1.length();
//        int n = word2.length();
// 
//        int[][] dp = new int[m + 1][n + 1];
// 
//        for (int i = 0; i <= m; i++) {
//            for (int j = 0; j <= n; j++) {
//                if (i == 0) {
//                    dp[i][j] = j;
//                } else if (j == 0) {
//                    dp[i][j] = i;
//                } else if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
//                    dp[i][j] = dp[i - 1][j - 1];
//                } else {
//                    dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
//                }
//            }
//        }
// 
//        return dp[m][n];
//    }
// 
//    public static void main(String[] args) {
//        doselect source = new doselect();
// 
//        // Sample Input
//        String word1 = "horse";
//        String word2 = "ros";
// 
//        // Method call
//        int result = source.distance(word1, word2);
// 
//        // Output
//        System.out.println(result);  // Expected Output: 3
//    }
//}






//TRANSPOSE
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
// 
//// Class name should be "Source",
//// otherwise solution won't be accepted
//public class doselect {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        // Declare the variable
//        int a;
//        // Read the variable from STDIN
//        a = s.nextInt();
//        // Output the variable to STDOUT
//
// 
//        int[][] arr = new int[a][a];
// 
//        for(int i=0;i<a;i++){
//            for(int j=0;j<a;j++){
// 
//                arr[i][j]=s.nextInt();
//            }
//        }
// 
//        int[][] transposeMatrix= new int[a][a];
//        for(int i=0;i<a;i++){
//            for(int j=0;j<a;j++){
// 
//                transposeMatrix[j][i]= arr[i][j];
//            }
//        }
// 
//        for(int i=0;i<a;i++){
//            for(int j=0;j<a;j++){
//                System.out.print(transposeMatrix[i][j]);
//                if(j<a-1){
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
// 
//        }
// 
// 
//    }
//}




//POWER OF TWO
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//// Class name should be "Source",
//// otherwise solution won't be accepted
//public class doselect {
//    public static void main(String[] args) {
//        
//        Scanner in = new Scanner(System.in);
//        int n=in.nextInt();
//         if(n<0){
//            System.out.println("Number too small");
//        }
//        else if(n>32767){
//            System.out.println("Number too large");
//        }
//        else {
//            boolean isPowerOfTwo= false;
//            int i=1;
//
//            while(i<=n){
//                if(n==i){
//                    isPowerOfTwo=true;
//                    break;
//                }
//                i*=2;
//            }
//            if(isPowerOfTwo){
//                System.out.println("Yes");
//            }
//            else{
//                System.out.println("No");
//            }
//        }
//        in.close();
//   }
//}




//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//// Class name should be "Source",
//// otherwise solution won't be accepted
//public class doselect {
//    public static void main(String[] args) {
//        
//        Scanner in = new Scanner(System.in);
//        int size=in.nextInt();
//        if(size<0){
//            System.out.println("Invalid array size");
//            return;
//        }
//
//        int[] numbers=new int[size];
//        for(int i=0;i<size;i++){
//            int num=in.nextInt();
//            if( num<0){
//                System.out.println("Invalid input");
//            }
//            numbers[i]=num;
//        }
//        in.close();
//        int maxSum=maximumSum(numbers,size);
//        System.out.println(maxSum);
//   }
//   static int maximumSum(int numbers[],int size){
//       int evenSum=0, oddSum=0;
//       for(int i=0;i<size;i++){
//           if(numbers[i]%2==0){
//               evenSum= evenSum+numbers[i];
//           }
//           else{
//               oddSum += numbers[i];
//           }
//       }
//       return(int)Math.max(evenSum,oddSum);
//   }
//}











//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//
//class Utility {
//	public static int fahrenheitToCelcius(double farhenheit) {
//		double celsius=(farhenheit - 32) * 5 / 9;
//		return(int)Math.round(celsius);
//	}
//	
//	
//	public static String getLevel(int[] array) {
//		int sum=0;
//		for(int i:array){
//			sum=sum+i;
//		}
//		if(sum>=100){
//			return"HIGH";
//		}
//		else if(sum>=70){
//			return"MEDIUM";
//		}
//		else{
//			return"LOW";
//		}
//	}
//}
//public class doselect {
//	public static void main(String args[] ) throws Exception {
//		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		try{
//			if(n==1){
//				// System.out.println("Enter Temperature in Fahrenheit:");
//				double farhenheit=sc.nextDouble();
//				int celsius=Utility.fahrenheitToCelcius(farhenheit);
//				System.out.println(celsius);
//			}
//			else if(n==2){
//				// System.out.println("Enter number of elements in array");
//				int m=sc.nextInt();
//				int[] array=new int[m];
//				for(int i=0;i<m;i++){
//					array[i]=sc.nextInt();
//				}
//				String level=Utility.getLevel(array);
//				System.out.println(level);
//			}
//			else{
//				throw new Exception("Invalid Option");
//			}
//		}
//			catch(Exception e){
//				System.out.println(e.getMessage());
//		}
//		sc.close();
//	}
//}







