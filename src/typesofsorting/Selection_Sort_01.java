package typesofsorting;

public class Selection_Sort_01 {

	public static void main(String[] args) {
		
		int[] arr= {80,90,52,23,48,63};
		
		for(int i=0;i<arr.length;i++)
		{
			int shortest=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					shortest=arr[i];
					arr[i]=arr[j];
					arr[j]=shortest;
				}
			}
			System.out.println(arr[i]);
		}
		
	}
}
