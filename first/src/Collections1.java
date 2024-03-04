//import java.util.HashSet;
//import java.util.Set;
//
//class A{
//	int i=4, j=8;
//	public boolean equals(Object o) {
//		System.out.println("equals");
//		A a=(A)o;
//		
//		if(this.i==a.i) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	public int hashCode() {
//		System.out.println("hashcode");
//		return 7;
//	}
//}
//public class Collections1 {
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
//		System.out.println(A.size());
//		
//		for(A a:set) {
//			System.out.println(a);
//		}
//		
//	}
//}




//import java.util.HashSet;
//import java.util.Set;
//
//class A{
//	int i=4, j=8;
//	
//}
//public class Collections1 {
//	public static void main(String[] args) {
//		
//		A a1=new A();  A a2=new A();   A a3=new A();
//		// hashcode is not a part of collections it comes under object 
//		System.out.println(a1.hashCode());  
//		System.out.println(a2.hashCode());
//		System.out.println(a3.hashCode());
//		
//	}
//}




//import java.util.HashSet;
//import java.util.Set;
//
//class A{
//	int i=4, j=8;
//	public boolean equals(Object o) {
//		A a=(A)o;
//		
//		if(this.i==a.i) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//}
//public class Collections1 {
//	public static void main(String[] args) {
//		Set<A> set=new HashSet<A>();  //homogeneous meaning the list will store only integer type elements
//		
//		A a1=new A();  A a2=new A();   A a3=new A();
//		set.add(a1);  set.add(a2);  set.add(a3);
//		
//		for(A a:set) {
//			System.out.println(a);
//		}
//	}
//}





//import java.util.HashSet;
//import java.util.Set;
//
//public class Collections1 {
//	
//	public static void main(String[] args) {
//		Set<String> set=new HashSet<String>();  //homogeneous meaning the list will store only integer type elements
//		
//		set.add("Dona");  set.add("Divya");   set.add("Daimu");
//		//since set is unordered the elements are added randomly so it prints- divya dona daimu
//		//no indexing is maintained
//		for(String name:set) {
//			System.out.println(name);
//		}
//	}
//}




//import java.util.LinkedList;
//import java.util.List;
//
//public class Collections1 {
//	
//	public static void main(String[] args) {
//		List<String> linkedlist=new LinkedList<String>();  //homogeneous meaning the list will store only integer type elements
//		
//		linkedlist.add("4");    //inserts the element in the list with add(E)method
//		linkedlist.add("five");    
//		  
//		for(String str: linkedlist) {
//			System.out.println(str);
//		}
//		
//		
//	}
//}




//import java.util.ArrayList;
//import java.util.List;
//
//public class Collections1 {
//	
//	public static void main(String[] args) {
//		List<Integer> list=new ArrayList<Integer>();  //homogeneous meaning the list will store only integer type elements
//		
//		list.add(4);    //inserts the element in the list with add(E)method
//		list.add(5);    
//		list.add(1);   
//		
//		list.set(0,5);    //replacing the value present in 0 index to 5
//		System.out.println(list);
//		
//		list.set(1, 21);    //replacing the value present in 1 index to 21
//		System.out.println(list);
//		
//		System.out.println(list.indexOf(21));   //prints the index of the element 21
//		System.out.println(list.indexOf(22));   //index of an element not present in the list returns -1
//		System.out.println(list.contains(4));   //checks whether the element is present in the list or not
//	}
//}




//import java.util.ArrayList;
//import java.util.List;
//
//public class Collections1 {
//	
//	public static void main(String[] args) {
//		List<Integer> list=new ArrayList<Integer>();  //homogeneous meaning the list will store only integer type elements
//		List<Integer> list1=new ArrayList<Integer>();
//		
//		list.add(4);    list1.add(1);
//		list.add(5);    list1.add(10);
//		list.add(1);   list1.add(17);
//		
//		System.out.println(list);
//		System.out.println(list1);
//		
//		System.out.println(list==list1);  //checks the address
//		System.out.println(list.equals(list1));   //checks the content of the list
//		
//	}
//}




//import java.util.ArrayList;
//import java.util.List;
//
//public class Collections1 {
//	
//	public static void main(String[] args) {
//		List<Integer> list=new ArrayList<Integer>();   //homogeneous meaning the list will store only integer type elements
//		
//		list.add(4);
//		list.add(5);
//		list.add(10);
//		list.add(1);
//		list.add(17);
//		
//		System.out.println(list);
//		
//		for(int val:list) {
//			System.out.println(val);
//		}
//		
//		System.out.println("removed element: " +list.remove(1));  //removes element from index 1
//		System.out.println("After removal");
//		
//		for(int val:list) {
//			System.out.println(val);
//		}
//		
//		Integer removalElement=4;     //creating a wrapper class to remove an element
//		 							//by specifying the  element present in the list
//		System.out.println("removed element: " +list.remove(removalElement));   //removes the element from the list
//	}
//}





//import java.util.ArrayList;
//import java.util.List;
//
//public class Collections1 {
////	public String toString() {   //overriding by using toString so that it prints something
////		return "Hi, Sakshi";     
////}
//	public static void main(String[] args) {
//		List list=new ArrayList();     //heterogeneous list which can store any type of element
//		Collections1 collections1=new Collections1();
////		System.out.println(list.isEmpty());
////		System.out.println(list.size());
//		
//		list.add(4);
//		list.add(3);
//		list.add(10);
////		System.out.println(list.isEmpty());
////		System.out.println(list.size());
//		
//		list.add(3,10);
////		System.out.println(list);
////		System.out.println(list.get(2));
//		list.add("divya");
//		
//		list.add(collections1);     //it returns the address since it wasn't overridden by toString
//		for(Object y :list){
//			System.out.println(y);   //toString is done automatically
//		}
//		
////		for(int i=0;i<list.size();i++) {
////			System.out.println(list.get(i));
////		}	
//	}
//}






//import java.util.ArrayList;
//
//public class Collections1 {
//	public static void main(String[] args) {
//		ArrayList list=new ArrayList();    //heterogeneous list which can store any type of element
//		Integer i1=4;
//		Integer i2=5;
//		list.add(i1);
//		list.add(i2);
//		list.add(10);
//	}
//}
