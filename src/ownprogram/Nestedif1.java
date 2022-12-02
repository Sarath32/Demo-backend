package ownprogram;

public class Nestedif1 {

	public static void main(String[] args) {
		int num=5;
		
	if(num<=5)
	{
		if(num%2==0)
		{
		 if (num==2)
		{
			System.out.println(num);
		}
		 else
		 {	
			System.out.println(num);
		 }
		 
		}
		if(num%2!=0)
		{
			if(num==1)
			{
				System.out.println(num);
			}
			else if(num==3)
			{
				System.out.println(num);
			}
			else
			{
				System.out.println(num);
			}
		}
	}
	else if(num>5)
	{
		if(num%2==0)
		{
		  if(num==8)
		  {
			  System.out.println(num);
		  }
		  else if(num==6)
		  {
			  System.out.println(num);
		  }
		  else
		  {
			  System.out.println(num);
		  }
		  
		}
		else if(num%2!=2)
		{
		  if(num==7)
		  {
			  System.out.println(num);
		  }
		  else
		  {
			  System.out.println(num);
		  }
		}
	}
		
		
	}

}
