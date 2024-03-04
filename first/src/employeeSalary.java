import java.util.HashMap;

class Salary{
	HashMap<String, Integer> empList= new HashMap<>(); 
	String designation;
	Integer salary;
	public int totalSalary() {
		int total=0;
		for(int i: empList.values()) {
			total=total+i;
		}
		return total;
	}
	public String getSalary(String designation) {
		if(empList.containsKey(designation)) {
			return "Salary is "+empList.get(designation);
		}
		else {
			return "No designation Match";
		}
	}
	public void updateSalary(String designation, int newSalary) {
		empList.put(designation, newSalary);
	}
}

public class employeeSalary {
	public static void main(String[] arg) {
		Salary obj=new Salary();
		obj.empList.put("CEO",20000);
		obj.empList.put("DEVELOPER",20000);
		
		System.out.println(obj.totalSalary());
		obj.updateSalary("DEVELOPER", 60000);
		System.out.println(obj.getSalary("DEVELOPER"));
		
	}
}
