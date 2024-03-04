class car{
	void tyres() {
		System.out.println("inside tyres() of car");
	}
}
class Swift extends car{
		void steeringWheel() {
		System.out.println("inside steeringWheel()");
	}
}
public class day2_inheritance {
	public static void main(String[] args) {
		car car1=new car();
		car car2=new car();
		Swift swift1=new Swift();
		Swift swift2=new Swift();
		
		car[] cars= {car1,car2};
		
		for (car Car:cars) {
			Car.tyres();
			if(Car instanceof car) {
				System.out.println("instance of car");
			}
			
			if(Car instanceof Swift) {
				Swift sw= (Swift)Car;
				sw.steeringWheel();
			}
		}
	}
}





//class car{
//	void tyres() {
//		System.out.println("inside tyres() of car");
//	}
//}
//class Swift extends car{
//		void steeringWheel() {
//		System.out.println("inside steeringWheel()");
//	}
//}
//public class day2_inheritance {
//	public static void main(String[] args) {
//		car car1=new car();
//		Swift swift1=new Swift();
//		car car2=new Swift();
//		
////		car car3=swift1; 
////		here i am assigning reference variable and is implicit type-casted 
////		since upcasting is automatic
//		
//		car car=new Swift();
////		down-casting is not automatic
//		Swift swift2=(Swift) car;
//		
//		
//		System.out.println(swift1);
//		
//		}
//	}






//class car{
//	void tyres() {
//		System.out.println("inside tyres() of car");
//	}
//}
//class Swift extends car{
//	int i=4;
//	void steeringWheel() {
//		System.out.println("inside steeringWheel()");
//	}
//}
//public class day2_inheritance {
//	public static void main(String[] args) {
//		Swift swift1= new Swift();
//		Swift swift2= new Swift();
//		Swift swift3= new Swift();
//		
//		Swift swifts[]= {swift1, swift2, swift3};
//		
//		swift1.i=4;
//		swift2.i=6;
//		
//		int sum=0;
//		for(Swift value:swifts) {
////			System.out.println(value.tyres()); // this is an error because 
//			//because we are calling a method that is not returning anything
//			//the problem is with sysout 
////			since sysout is unable to print anything
//			//but if we add return in tyres it wont be an error anymore
//			
//			sum= sum+value.i;
//		}
//		System.out.println(sum);
//	}
//}



//class car{
//	void tyres() {
//		System.out.println("inside tyres() of car");
//	}
//}
//class Swift extends car{
//	void steeringWheel() {
//		System.out.println("inside steeringWheel()");
//	}
//}
//public class day2_inheritance {
//	public static void main(String[] args) {
//		Swift swift1= new Swift();
//		Swift swift2= new Swift();
//		Swift swift3= new Swift();
//		
//		Swift swifts[]= {swift1, swift2, swift3};
//		
//		for(Swift value:swifts) {
////			System.out.println(value.tyres()); // this is an error because 
//			//because we are calling a method that is not returning anything
//			//the problem is with sysout 
////			since sysout is unable to print anything
//			//but if we add return in tyres it wont be an error anymore
//			value.tyres();
//			value.steeringWheel();
//		}
//	}
//}
