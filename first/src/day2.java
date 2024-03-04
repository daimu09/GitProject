public class day2 {
	
	public static void main(String[] args) {
		day2 Day=new day2();
		int returnedValue = Day.add(35, 65);
		System.out.println(returnedValue);
	}
	int add(int val1, int val2) {
		int result=val1+val2;
		return result;
		
	}
}

//public class day2 {
//	
//	public static void main(String[] args) {
//		day2 Day=new day2();
//		Day.add(35, 65);
//	}
//	void add(int val1, int val2) {
//		int result=val1+val2;
//		System.out.println("inside add()..."+result);
//		
//	}
//}


//public class day2 {
//	int i=4, j=5, k;
//	public static void main(String[] args) {
//		day2 Day=new day2();
//		int returnedvalue= Day.add();
//		System.out.println(Day.k);
//		System.out.println("the returned value is"+" "+ returnedvalue);
//	}
//	int add() {
//		
//		int value=100;
//		value= i*value+j*k;
//		return value;
//	}
//}


//public class day2 {
//	int i=4, j=5, k;
//	public static void main(String[] args) {
//		day2 Day=new day2();
//		int returnedvalue= Day.add();
//		System.out.println("the returned value is"+" "+ returnedvalue);
//	}
//	int add() {
//		k=i+j;
//		int value=100;
//		System.out.println("value is"+ " " +value);
//		return value;
//	}
//}
