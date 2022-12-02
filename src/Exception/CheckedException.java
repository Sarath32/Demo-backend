package Exception;

import java.io.FileInputStream;


public class CheckedException {

	public static void main(String[] args)  {

		try {
			FileInputStream ip= new FileInputStream("C:\\users\\Sugumar\\Documents\\Documents\\Exception\\20. EXCEPTION HANDLING.docx");
		}
		catch(Exception e)
		{
			System.out.println("System cannot found the file location");
		}
		finally {
			System.out.println("Checked Exception");
		}
		
		
	}

}
