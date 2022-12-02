package statementandloops;

public class NestedSwitch {

	public static void main(String[] args) {
	
		String Department = "Testing";
		int yrsofexp=3;
		
		switch(Department)
		{
		case "Development":
			
		switch(yrsofexp)
		{
		case 1:
			System.out.println("15k");
			break;
		case 2:
			System.out.println("20k");
			break;
		case 3:
			System.out.println("30k");
			break;
		}
		break;
		case "Testing":
		
		switch(yrsofexp)
		{
		case 1:
			System.out.println("10k");
			break;
		case 2:
			System.out.println("15K");
			break;
		case 3:
			System.out.println("30k");
			break;
		}
		break;
		
		
		
		}}}	
		
		
		



