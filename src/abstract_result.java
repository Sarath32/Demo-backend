import abstracrtion.EMPLOYEES;
import abstracrtion.Productionemp;
import abstracrtion.Salesemp;

public class abstract_result {

	public static void main(String[] args) {
	
		System.out.println("The Production Employees Details are......");
		System.out.println();
		EMPLOYEES temp= new Productionemp();
		temp.addemp();
		temp.deleteemp();
		temp.modifyemp();
		
		System.out.println();
		
		System.out.println("The Sales Employees Details are......");
		System.out.println();
		EMPLOYEES tem= new Salesemp();
		tem.addemp();
		tem.deleteemp();
		tem.modifyemp();
		

	}

}
