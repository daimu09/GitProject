
public class method{
	int i=4;
	public static void main(String[] args) {
		method p1=new method();
		p1.marry();
	}
	void marry() {
		method b1=new method();
		System.out.println(this);
		System.out.println(b1);
	}
}



//public class method {
//		int i=4;
//		public static void main(String[] args) {
//			method day=new method();
//			method day1=new method();
//			day.add();
//			day1.add();
//			
//			day1.i=10;
//			System.out.println(day1.i);
//			
//			System.out.println("after updating");
//			day1.add();
//	}
//		void add() {
//			int i=5, j=6;
//			System.out.println(i);
//			System.out.println(this.i);
//			System.out.println(j);
//		}
//}


//public class method {
//		int i=4;
//		public static void main(String[] args) {
//			method day=new method();
//			day.add();
//		}
//		void add() {
//			int i=5, j=6;
//			System.out.println(i);
//			System.out.println(this.i);
//			System.out.println(j);
//		}
//}



//public class method {
//		int i=4;
//		public static void main(String[] args) {
//			method day=new method();
//			
//			day.add();
//		}
//		void add() {
//			i=5;
//			System.out.println(i);
//		}
//}


//public class method {
//		int i=4;
//		public static void main(String[] args) {
//			method day=new method();
//			System.out.println(day);
//			day.add();
//		}
//		void add() {
//			int i=5;
//			System.out.println(this.i);
//			System.out.println(this);
//		}
//}


//public class method {
//		int i=4;
//		public static void main(String[] args) {
//			method day=new method();
//			day.add();
//		}
//		void add() {
//			int i=5;
//			System.out.println(i);
//		}
//}
