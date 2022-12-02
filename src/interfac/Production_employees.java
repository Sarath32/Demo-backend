package interfac;

public class Production_employees implements Employee {

	@Override
	public void addemp() {
		System.out.println("The Addition of production employees");
		
	}

	@Override
	public void editemp() {
		System.out.println("The Edit of production employees");
	}

	@Override
	public void deleteemp() {
		System.out.println("The Deletion of production employees");
	}

}
