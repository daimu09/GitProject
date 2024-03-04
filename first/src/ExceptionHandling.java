




//import java.util.Scanner;
//public class ExceptionHandling{
//	public static void main(String[] args)  {
//		try {
//			ageCheck();
//		}
//		catch(Exception e) {
//			
//		}
//	}
//	static public void ageCheck() {
//		try {
//			Scanner sc=new Scanner(System.in);
//			System.out.println("enter your age");
//			int n=sc.nextInt();
//			
//			if(n>30) {
//				System.out.println("not allowed");
////				throw new ArithmeticException();
//				throw new Below30Allowed();
//			}
//			else {
//				System.out.println("allowed");
//			}
//		}
//		catch(Exception e){
//	
//		}
//	}
//}




//import java.util.Scanner;
//public class ExceptionHandling{
//	public static void main(String[] args) throws Exception {
//		ageCheck();
//	}
//	static public void ageCheck() {
//		try {
//			Scanner sc=new Scanner(System.in);
//			System.out.println("enter your age");
//			int n=sc.nextInt();
//			
//			if(n>30) {
//				System.out.println("not allowed");
////				throw new ArithmeticException();
//				throw new Below30Allowed();
//			}
//			else {
//				System.out.println("allowed");
//			}
//		}
//		catch(Exception e){
//	
//		}
//	}
//}



//import java.util.Scanner;
//public class ExceptionHandling{
//	public static void main(String[] args) throws Exception {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter your age");
//		int n=sc.nextInt();
//		
//		if(n>30) {
//			System.out.println("not allowed");
////			throw new ArithmeticException();
//			throw new Avove30NotAllowed();
//		}
//		else {
//			System.out.println("allowed");
//		}
//	}
//}





//import java.util.Scanner;
//public class ExceptionHandling {
//	static Scanner sc=new Scanner(System.in);
//	public static void main(String[] args) {
//		ExceptionHandling.divider();
//		ExceptionHandling.findIndex();	
//	}
//	static public void divider() {
//		try {
//			int dividend=4;
//			System.out.println("enter divider!");
//			int divider=sc.nextInt();
//			int result=dividend/divider;
//			System.out.println(result);
//		}
//		catch(ArithmeticException e){
//			System.out.println("inside Arithmetic");
//		}
//	}
//	static public void findIndex() {
//		try {
//			Scanner sc=new Scanner(System.in);
//			System.out.println("enter the name");
//			String name=sc.next();
//			System.out.println("Enter the index");
//			int index=sc.nextInt();
//			System.out.println(name.charAt(index));
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("indseide ");
//			findIndex();
//		}
//	}
//
//}


//import java.util.Scanner;
//public class ExceptionHandling {
//	
//	public static void main(String[] args) {
//		try {
//			Scanner sc=new Scanner(System.in);
//			
//			System.out.println("enter divider but not 0");
//			int divider=sc.nextInt();
//			
//			int dividend=4;
//			int result=dividend/divider;
//			System.out.println("the result is" +result);
//			
//			int[] arr= {3,5,1};
//			System.out.println("enter your index");
//			int index=sc.nextInt();
//			System.out.println(arr[index]);
//			
//			System.out.println("enter your name");
//			String name=sc.next();
//			System.out.println("enter index of string");
//			int indexString=sc.nextInt();
//			System.out.println(name.charAt(indexString));
//
//		}
//		catch(ArithmeticException e){
//				System.out.println("inside catch block");
//				main(null);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("inside ArrayIndexOutOfBoundsException");
//		}
//		catch(Exception e) {
//			System.out.println("inside Exception");
//			main(null);
//		}
//	}
//}




//import java.util.Scanner;
//public class ExceptionHandling {
//	
//	public static void main(String[] args) {
//		try {
//			Scanner sc=new Scanner(System.in);
//			
//			System.out.println("enter divider but not 0");
//			int divider=sc.nextInt();
//			
//			int dividend=4;
//			int result=dividend/divider;
//			
//			System.out.println("the result is" +result);
//			
//			int[] arr= {3,5,1};
//			System.out.println("enter your index");
//			int index=sc.nextInt();
//			System.out.println(arr[index]);
//		}
//		catch(ArithmeticException e){
//				System.out.println("inside catch block");
//				main(null);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("inside ArrayIndexOutOfBoundsException");
//		}
//	}
//}






//import java.util.Scanner;
//public class ExceptionHandling {
//	static int counter=0;
//	public static void main(String[] args) {
//		try {
//			Scanner sc=new Scanner(System.in);
//			
//			if(counter==0) {
//				System.out.println("enter divider but not 0");
//			}
//			System.out.println("enter divide!");
//			int divider=sc.nextInt();
//			
//			int dividend=4;
//			int result=dividend/divider;
//			
//			System.out.println("the result is" +result);
//		}
//		catch(Exception e){
//				System.out.println("inside catch block");
//				counter++;
//				main(null);
//		}
//	}
//}





//public class ExceptionHandling {
//	public static void main(String[] args) {
//		try {
//			System.out.println("inside tryyy block");
//			int i=4;
//			int result=i/0;
//			System.out.println(result);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e);
//			System.out.println("inside catch block");
//		}
//	}
//}




//public class ExceptionHandling {
//	public static void main(String[] args) {
//		try {
//			System.out.println("inside tryyy block");
//			int i=4/0;
//			System.out.println("inside try block");
//		}
//		catch(Exception e) {
//			System.out.println("inside catch block");
//		}
//	}
//}
