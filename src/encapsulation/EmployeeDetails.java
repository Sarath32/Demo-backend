package encapsulation;

public class EmployeeDetails  {
	public static void main(String[] args) {
		
	
	Employee emp =new Employee();
	emp.setAddempname("Rajan");
    emp.setAddempAddress("Cbe");
    emp.setAddAgeemp(50);
    
    
    System.out.println(emp.getAddempname());
    System.out.println(emp.getAddempAddress());
    System.out.println(emp.getAddAgeemp());
    
    
    
	}
}
