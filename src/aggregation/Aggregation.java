package aggregation;

public class Aggregation {

	public static void main(String[] args) {

		EmployeePersonal emp1=new EmployeePersonal("Cersi","40", "Lanister House");
		EmployeePersonal emp2=new EmployeePersonal("Denariyes","25", "Targeriyan House");
		
		
		EmployeeDetails empdet1=new EmployeeDetails("Developer",5, emp1);
		EmployeeDetails empdet2=new EmployeeDetails("Tester",1, emp2);
		
		empdet2.display();
		
		
		
	}

}
