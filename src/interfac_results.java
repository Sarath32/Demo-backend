import interfac.Employee;
import interfac.Production_employees;
import interfac.sales_employees;

public class interfac_results {

	public static void main(String[] args) {
		
		Employee t= new sales_employees();
				t.addemp();
		t.deleteemp();
		t.editemp();
		
		
		System.out.println();
		
		Employee t1= new Production_employees();
		t1.addemp();
		t1.deleteemp();
		t1.editemp();

	}

}
