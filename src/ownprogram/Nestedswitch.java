package ownprogram;

public class Nestedswitch {

	public static void main(String[] args) {
	
		String Department="testing";
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
		
	 case "testing":
		 switch (yrsofexp)
		 {
		 case 1:
			 System.out.println("10k");
			 break;
		 case 2:
			 System.out.println("15k");
			 break;
		 case 3:
			 System.out.println("30k");
			 break;
			 
		 }
			 
		 
	 }
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
	}	
	}


