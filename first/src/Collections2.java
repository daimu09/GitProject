public class Collections2{
	public static void main(String[] args) {
		String s1="messa";
		String s2="aisas";
		
		
	}
}





//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//class Employee{
//	int id,salary;
//	String name;
//	
//	public Employee( String name,int salary) {
//		super();
//		
//		this.salary = salary;
//		this.name = name;
//	}
//	@Override
//	public String toString() {
//		return salary+ " "+ name;
//	}	
//}
//	
//
//public class Collections2 {
//	public static void main(String[] args) {
//		Map<Integer, Employee> employees=new HashMap<Integer, Employee>();
//		
//		Employee e1=new Employee("di",334455);
//		Employee e2=new Employee("abc",75000);
//		Employee e3=new Employee("cba",67589);
//		Employee e4=new Employee("tyu",3455);
//		
//		employees.put(1, e1);
//		employees.put(2, e2);
//		employees.put(3, e3);
//		employees.put(4, e4);
//		
//		
//		Set<Integer> keySet= employees.keySet();
//		int[] sal=new int[3];
//		int i=0;
//		for(int key: keySet) {
//			int j=(employees.get(key).salary);
//			if(j>50000) {
//				sal[i]=j;
//				i++;
//			}
//		}
//		for(int k:sal) {
//			System.out.println(k);
//		}
//		}
//}




//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//class Employee{
//	int employeeId;
//	String name;
//	public Employee(int employeeId, String name) {
//		this.employeeId = employeeId;
//		this.name = name;
//	}
//	
//}
//
//public class Collections2 {
//	public static void main(String[] args) {
//		Map<Integer, String> employees=new HashMap<Integer, String>();
//		
//		employees.put(101, "divya");
//		employees.put(145, "mew");
//		employees.put(123,"ghgh");
//		employees.put(null,"ghgh");
//		employees.put(null,null);
//		employees.put(234,null);
//		
//		
//		System.out.println(employees.get(102));
//		System.out.println(employees.remove(105));
//		
//		Set<Integer> keySet= employees.keySet();
//		
//		for(int key: keySet) {
//			System.out.println(key+" "+ employees.get(key));
//		}
//		}
//}





//import java.util.ArrayList;
//import java.util.List;
//
//class Employee{
//	int employeeId;
//	String name;
//	public Employee(int employeeId, String name) {
//		this.employeeId = employeeId;
//		this.name = name;
//	}
//	
//}
//
//public class Collections2 {
//	public static void main(String[] args) {
//		List<Employee> employees=new ArrayList<Employee>();
//		
//		Employee employee1=new Employee(101,"eeee");
//		Employee employee2=new Employee(102,"ghg");
//		
//		employees.add(employee1);
//		employees.add(employee2);
//		}
//}






//import java.util.Comparator;
//import java.util.Set;
//import java.util.TreeSet;
//
//class Iphone implements Comparable<Iphone>{
//	int manufactoringdate;
//	int price;
//	String color;
//	
//	public int compareTo(Iphone o) {
//		int value=0;
//		System.out.println("compareTo");
//		////by interchanging the value of value then sorting is done in ascending
////		if(this.price<o.price) {
////			value=-1;
////		}
////		else if(this.price>o.price){
////			value=1;
////		}
//		//by interchanging the value of value then sorting is done in descending
//		if(this.price<o.price) {
//			value=1; 
//		}
//		else if(this.price>o.price){
//			value=-1;
//		}
//			return value;
//	}
//	public String toString() {
//		return "Color is " +color+" price is "+price+", manufacturing date is"+manufactoringdate
//				;
//	}
//}
//
//class ManufacturingDate implements Comparator<Iphone>{
//	
//	@Override
//	public int compare(Iphone o1, Iphone o2) {
//		int value =0;
//		if(o1<o2) {
//			
//		}
//		return 0;
//	}
//}
//
//public class Collections2 {
//	public static void main(String[] args) {
//		Set<Iphone> set=new TreeSet<Iphone>();  ///sorted
//		Iphone i1=new Iphone();  Iphone i2=new Iphone(); Iphone i3=new Iphone();
//		i1.price=56;  i2.price=12;  i3.price=78;//sorting is done on the basis of price
//		
//		set.add(i1);  set.add(i2);   set.add(i3);
//		
//		
//		for(Iphone a:set) {
//			System.out.println(a);
//		}
//}
//}






//import java.util.Set;
//import java.util.TreeSet;
//
//
//public class Collections2 {
//	public static void main(String[] args) {
//		Set<String> set=new TreeSet<String>();  ///sorted
//		set.add("abc");  set.add("bcs");   set.add("hull");
//		for(String value:set) {System.out.println(value);
//		}
//}
//}




//import java.util.LinkedHashSet;
//import java.util.Set;
//
//
//public class Collections2 {
//	public static void main(String[] args) {
//		Set<String> set=new LinkedHashSet<String>();   ///ordered
//		set.add("abc");  set.add("bcs");   set.add("hull");
//		for(String value:set) {System.out.println(value);
//		}
//}
//}





//import java.util.HashSet;
//import java.util.Set;
//
//public boolean equals(Object o) {
//	System.out.println("inside equals");
//	A a=(A)o;
//	boolean status= false;
//	if(this.i==a.i) {
//		status=true;
//	}
//	System.out.println("inside equals "+status);
//	return status;
//}
//
//public int hashCode() {
//	return 34567;
//}
//
//public class Collections2 {
//	public static void main(String[] args) {
//		Set<A> set=new HashSet<A>();
//		
//		A a1=new A();  A a2=new A();   A a3=new A();
//		// hashcode is not a part of collections it comes under object 
//		set.add(a1);  set.add(a2);  set.add(a3);
//		
//		System.out.println(a1.hashCode());  
//		System.out.println(a2.hashCode());
//		System.out.println(a3.hashCode());
//		System.out.println(set.size());
//		
//		
//	}
//}
//}




//import java.util.HashSet;
//import java.util.Set;
//
//public class Collections2 {
//	public static void main(String[] args) {
//		Set<String> set=new HashSet<String>();  //creates a bucket
//		set.add("abc"); //creates a hashcode for object abc then it looks for the hashcode in the bucket
//		//and if that is empty then abc is added to that bucket with hashcode of abc
//		
//		set.add("abc");  //it hsould have the same hashcode as one before
//		String str="bcs";
//		System.out.println(str.hashCode());
//		
//	}
//}
