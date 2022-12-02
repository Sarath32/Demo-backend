package aggregation;

public class EmployeeDetails {

	private String designation;
	private int exp;
	private EmployeePersonal empper;
	
	
	public EmployeeDetails(String designation, int exp, EmployeePersonal empper) {
		super();
		this.designation = designation;
		this.exp = exp;
		this.empper = empper;
	}
	
	public void display() {
		empper.display();
		System.out.println("The Employee Designation is "+designation);
		System.out.println("The Employee Year of Experiance is "+exp);
		
	}
}
