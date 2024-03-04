package mew;

public class Employee {
	//no argument constructor
	private int id;
	private String name;
	private int salary;
	//parameterized constructor
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void setId(int id) {
		this.id=id;
	}
	public  int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
