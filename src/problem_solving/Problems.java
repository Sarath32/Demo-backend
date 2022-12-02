package problem_solving;

public class Problems {

	public static void main(String[] args) {
//Problem: 1
		//To Display the Message
		
		System.out.println("1.Welcome");
		
		
//Problem: 2
		//To Display user Data
		
		int RollNo = 256;
		String Name = "Ganesh";
		double salary = 25300.536;
		
		System.out.println("2.Welcome to the trio trend ---> "+RollNo);
		System.out.println("3.Welcome to the Trio Trend ---> Mr."+Name);
		System.out.println("4.Welcome to the Trio Trend ---> "+salary);
		
		
//Problem: 3
		//To sum of two values
		int x = 256;
		int y = 247;
		int a=x+y;
		System.out.println("5."+a);
		
		
//Problem: 4;
		//To find the Area of rectangle
		double length,breath,area;
		length= (double)22.5;
		breath=(double) 25.3;
		area=length*breath;
		System.out.println("6.The length of the rectangle is --> "+length+"\nthe breath of the rectangle is --> "+breath);
        System.out.println("The area of the rectangle is --> "+area);	
        
        
//Problem: 5;
        // if else program;
        int mark=80;
        
        if (mark<35)
        {
        	System.out.println("fail");
        	
        }else if (mark>35)
        {
        	System.out.println("Average");
        	
        }else if (mark>75)
        {
        	System.out.println("Good Mark");
        }
		
		
//Problem :6
        //To Display numbers from 1 to 10 using Do While
        
        int no=1;
        do
        {
        	System.out.println(no);
        	no++;
        }while(no<=10);
		
		
//Problem :7
        //To Display numbers from 1 to 10 using While loop
        
        int a1=1;
        while(a1<=10)
        {
        	System.out.println(a1);
        	a1++;
        }

        
//Problem :8
        //To Display numbers from 1 to 10 using for loop    
        
        for(int b1=1; (b1<=10); b1++)
        {
        	System.out.println(b1);
        }
        



        
        
        
        
        
        
        
        
        
        
        
        
        
        //Program :10
        // To Display Even Number
        for(int c1=0; (c1<=10); c1+=2)
        {
        	System.out.println(c1);
        
        }
        //To Display Odd Number
        for(int d1=1; (d1<=10); d1+=2)
        {
        	System.out.println(d1);
        }

	}

}
