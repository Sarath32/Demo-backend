package typesofsorting;

public class Bubble_Sort_02 {

	public static void main(String[] args) {
		
		String[] arr= {"java","c++","react","javascript","c","html","css"};
		
       int n=arr.length;
       
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					String swap=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=swap;
				}
			}
			
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}
