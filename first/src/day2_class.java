class Aircraft{
	int altitude=0;
	
	int fly() {
		altitude=35000;
		return altitude;
	}
}
class Human{
	double longitude=23.45;
	double latitude=6677.23423;
	double altitude=0;
	
	void getAltitude() {
		Aircraft aircraft= new Aircraft();
		altitude= aircraft.fly();
	}
	void walk() {
		longitude=longitude+10.00;
		latitude=latitude+4565.23;
	}
}
public class day2_class {

public static void main(String[] args) {
	Human human=new Human();
	System.out.println(human.longitude);
	System.out.println(human.latitude);
	System.out.println(human.altitude);
	
	human.getAltitude();  human.walk(); 
	
	System.out.println(human.longitude);
	System.out.println(human.latitude);
	System.out.println(human.altitude);
	}
}


//class Arithmetic{
//	int i=4;
//	void display() {
//		System.out.println(i);
//		
//		day2_class day1=new day2_class();
//		day1.print();
//	}
//}
//public class day2_class {
//	int j=5;
//	public static void main(String[] args) {
//		Arithmetic arithmetic=new Arithmetic();
//		
//		System.out.println(arithmetic.i);
//		
//		day2_class day=new day2_class();
//		
//		System.out.println(day.j);
//	}
//}



//class Arithmetic{
//	int i=4;
//}
//public class day2_class {
//	int j=5;
//	public static void main(String[] args) {
//		Arithmetic arithmetic=new Arithmetic();
//		System.out.println(arithmetic.i);
//		day2_class day=new day2_class();
//		System.out.println(day.j);
//	}
//}
