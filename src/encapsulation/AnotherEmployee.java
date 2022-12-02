package encapsulation;

public class AnotherEmployee {

	private String empName;
	private String empAddress;
	private int empAge;
	
	
	public AnotherEmployee(String empName, String empAddress, int empAge) {
		
		this.empName = empName;
		this.empAddress = empAddress;
		this.empAge = empAge;
	}
	
	public void DisplayDetails() {
		
		System.out.println(empName);
		System.out.println(empAddress);
		System.out.println(empAge);
		
		
	}
	
	
	
	
}
