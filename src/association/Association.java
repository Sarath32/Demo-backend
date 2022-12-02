package association;

public class Association {

	public static void main(String[] args) {

		Bank c=new Bank("Canara");
		Employee emp=new Employee("Jessie");
	
		System.out.println(emp.getName()+" is employee of "+c.getName());
		
		
	}

}
