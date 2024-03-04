public class day2_static{
	static int result;
	int FirstNo=4, SecondNo=5;
	public static void main(String[] args) {
		day2_static day1=new day2_static();
		day2_static day2=new day2_static();
		
		day1.add();
		day2.add();
		
		System.out.println(result);
	}
	void add() {
		int result=50;
		result=FirstNo+SecondNo+result;
		System.out.println(result);
	}
}



//public class day2_static{
//	static int result;
//	int FirstNo=4, SecondNo=5;
//	public static void main(String[] args) {
//		day2_static day1=new day2_static();
//		day2_static day2=new day2_static();
//		
//		day1.add();
//		day2.add();
//		
//		System.out.println(result);
//	}
//	void add() {
//		result= FirstNo+SecondNo;
//		System.out.println(result);
//	}
//}


//public class day2_static{
//	static int firstNo=4;
//	public static void main(String[] args) {
//		System.out.println(firstNo);
//	}
//}



//public class day2_static {
//	int height=1;
//	int aptitude=20;
//	int mascularStrength=10;
//	int firstNo=4 , secondNo= 5, result;
//	
//	public static void main(String[] args) {
//		day2_static Day= new day2_static();
//		System.out.println(Day.height);
//		System.out.println(Day.aptitude);
//		System.out.println(Day.mascularStrength);
//		System.out.println(Day.firstNo);
//		System.out.println(Day.secondNo);
//		System.out.println(Day.result);
//		
//		Day.studying();  Day.gyming();  Day.gyming();  Day.gyming();
//		Day.add();
//		
//		System.out.println("after calling methods...");
//		
//		System.out.println(Day.height);
//		System.out.println(Day.aptitude);
//		System.out.println(Day.mascularStrength);
//		System.out.println(Day.firstNo);
//		System.out.println(Day.secondNo);
//		System.out.println(Day.result);
//
//	}
//	void playingBasketball() {
//		height++;
//	}
//	void gyming() {
//		mascularStrength++;
//	}
//	void studying() {
//		aptitude++;
//	}
//	void add() {
//		result= firstNo+secondNo;
//	}
//}
