
 class TypeException extends Exception{
	 public String toString() {
		 return "Vehicle Type Not Set";
	 }
}
 class Vehicles{
	 String type;
	 String model_no;
	 String model_name;
	 String owner_name;
	 String owner_details;
	 
	 public Vehicles(String type,String model_no,String model_name,String owner_name,String owner_details) {
		 this.type=type;
		 this.model_name=model_name;
		 this.model_no=model_no;
		 this.owner_details=owner_details;
		 this.owner_name=owner_name;
	 }
	 public Vehicles(){
		 
	 }
	 public String get_type() {
		 return type;
	 }
	 public String retrieve() {
		 return "null";
	 }
 }
 class Car extends Vehicles{
	 public Car(String type,String model_no,String model_name,String owner_name,String owner_details) {
		 super(type, model_no, model_name, owner_name, owner_details);
	 }
	 public Car() {
		 
	 }
	 public String get_type() {
		 return type;
	 }
	 public void set_type() {
		 this.type=type;
	 }
	 public String retrieve() {
		if(type==null) {
			try {
				throw new TypeException();
			}
			catch(Exception e) {
				return e.toString();			}
		}
		else {
			return model_no+" "+model_name+" "+owner_details+" "+owner_name;
		}
	 }
 }
 
public class customExceptions {
	public static void main(String[] args) {
		Car car=new Car("1234","toyota","john doe","ffff");
		car.set_type("Suv");
	}
}
