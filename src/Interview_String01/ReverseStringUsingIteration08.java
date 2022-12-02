package Interview_String01;

public class ReverseStringUsingIteration08 {

	public static void main(String[] args) {
		
		String a="80,56,42,365,15";
		
		String s[]=a.split(",");
		
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
		
		
	}

}
