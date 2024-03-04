




//package runner;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//import mew.Employee;
//
//public class runner {
//	public static void main(String[] args) {
//		Map<Integer,Employee> employees=new HashMap<Integer,Employee>();
//		
//		List<Employee> list=new ArrayList<Employee>();
//		//creating objects containing name and salary 
//		Employee e1= new Employee();
//		Employee e2= new Employee();
//		Employee e3= new Employee();
//		Employee e4= new Employee();
//		
//		employees.put(e1.getId(), e1);
//		employees.put(e2.getId(), e2);
//		employees.put(e3.getId(), e3);
//		employees.put(e4.getId(), e4);
//		
//		Set<Integer> keys= employees.keySet();
//		
//		for(int key: keys) {
//			if(employees.get(keys).getSalary()>5000) {
//				list.add(employees.get(key));
//			}
//		}
//		for(Employee employee:list) {
//			System.out.println(employee);
//		}
//	}
//}
