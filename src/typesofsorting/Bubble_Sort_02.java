package typesofsorting;

public class Bubble_Sort_02 {

	public static void main(String[] args) {
		
		String[] arr= {"java","c++","react","javascript","c","html","css"};
		
       int n=arr.length;
       
		for(int j=0;j<n;j++)
		{
			for(int i=0;i<n-j-1;i++)
			{
				if(arr[i].compareTo(arr[i+1])>0)
				{
					String swap=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=swap;
				}
			}
			
			
		}
		for(int j=0;j<n;j++)
		{
			System.out.print(arr[j]+" ");
		}
		
	}
}
