package Array.interview_questions;



public class MErgeofArray02 {

	public static void main(String[] args) {
	
		int a[]= {60,45,75,56};
		int b[]= {45,85,56};
		
	int c[]= new int [a.length+b.length];
	int ci=0;
	for(int i=0; i<a.length;i++)
	{
		c[ci]=a[i];
		ci++;
	}
	
    for (int i=0;i<b.length;i++)
    {
    	c[ci]=b[i];
    	ci++;
    	
    }
	
    for(int i=0; i<c.length;i++)
    {
    	System.out.println("The array of c value is " +c[i]);
    }
	

	}

}
