
class Employee{
	String name;
	String ssn;
	String dept;
	int salary;
	public Employee(String name, String ssn, String dept, int salary) {
		this.name=name;
		this.ssn=ssn;
		this.dept=dept;
		this.salary=salary;
	}
}
class EmployeeImplementation{
	public static Employee getEmployeeInfo(String str) {
		String[] parts=str.split("@|-|#");
		String name=parts[0];
		String ssn=parts[1];
		String dept=parts[2];
		int salary=Integer.parseInt(parts[3]);
		
		return new Employee(name, ssn, dept, salary);
		
//		return new Employee(str.substring(0,str.indexOf("@")),
//				str.substring(str.indexOf("@")+1,str.indexOf("-")),
//				str.substring(str.indexOf("-")+1,str.indexOf("#")),
//				Integer.valueOf(str.indexOf("#")+1));
	}
	public static String getEmployeeDept(Employee e) {
		String lastThreeDigits= e.ssn.substring(e.ssn.length()-3);
		int digits=Integer.parseInt(lastThreeDigits);
		if(digits>=001 && digits<=060)
			return "L1";
		else if(digits>=061 && digits<=120)
			return "L2";
		else if(digits>=121 && digits<=180)
			return "L3";
		else 
			return "L4";
//		return digits;
	}
	public class employeeInformation{
		public static void main(String[] args) {
			String str="Amit Rai@1PC16CS046-ALU#8";
			EmployeeImplementation emp= new EmployeeImplementation();
			
			Employee employee=emp.getEmployeeInfo(str);
			System.out.println(employee.name);
			System.out.println(employee.ssn);
			System.out.println(employee.dept);
			System.out.println(employee.salary);
			
			String department=emp.getEmployeeDept(employee);
			System.out.println(department);
			
		}
	}
}


















//class Employee{
//	String name;
//	String ssn;
//	String dept;
//	int salary;
//	
//	public Employee(String name, String ssn, String dept, int salary) {
//		this.name=name;
//		this.ssn=ssn;
//		this.dept=dept;
//		this.salary=salary;
//	}
//}
//class EmployeeImplementation{
//	public static Employee getEmployeeInfo(String str){
//		String[] parts=str.split("[@\\-#]");
//		
//		String name=parts[0];
//		String ssn=parts[1];
//		String dept=parts[2];
//		int salary=Integer.parseInt(parts[3]);
//		
//		return new Employee(name,ssn,dept,salary);
//	}
//	public static String getEmployeeDept(Employee s){
//		String lastThreeDigits=s.ssn.substring(s.ssn.length()-3);
//		int ssnNo=Integer.parseInt(lastThreeDigits);
//		
//		if(ssnNo>=1 && ssnNo<=60) {
//			return "L1";
//		}
//		else if(ssnNo>=61 && ssnNo<=120) {
//			return "L2";
//		}
//		else if(ssnNo>=121 && ssnNo<=180) {
//			return "L3";
//		}
//		else {
//			return "L4";
//		}
////		return lastThreeDigits;
//	}
//	
//}
//public class employeeInformation {
//	public static void main(String args[]) {
//		String str="Amit Rai@1PC16CS046-ALU#8";
//		EmployeeImplementation emp= new EmployeeImplementation();
//		
//		Employee employee=emp.getEmployeeInfo(str);
//		System.out.println(employee.name);
//		System.out.println(employee.ssn);
//		System.out.println(employee.dept);
//		System.out.println(employee.salary);
//		
//		String department=emp.getEmployeeDept(employee);
//		System.out.println(department);
//		
//	}
//}
