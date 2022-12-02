package aggregation;

public class EmployeePersonal {

	private String name;
	private String age;
	private String address;
	
	
	public EmployeePersonal(String name, String age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void display() {
		
		System.out.println("The Employee Name is "+name);
		System.out.println("The Employee Age is "+age);
		System.out.println("The Employee Address is "+address);
	}
	
	
}
