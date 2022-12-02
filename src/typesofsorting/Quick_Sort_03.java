package typesofsorting;

public class Quick_Sort_03 {

	static void quicksort(int arr[],int low,int high) {
		
		int mid=(low+high)/2;
		int i=low;
		int j=high;
		int pivot=arr[mid];
		
		while(i<=j)
		{
			while(arr[i]<pivot)
			{
				i++;
			}
			while(arr[j]>pivot)
			{
				j--;
			}
			if(i<=j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		
		if(low<j)
			quicksort(arr, low, j);
		if(high>i)
			quicksort(arr, i, high);
	}
	 public static void main(String[] args) {
		
		 int arr[]= {30,20,25,25,45,165,916,3164,56,48,82};
		 
		 System.out.println("Array before sorting");
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
		 
		 System.out.println("Array after sorting");

		 quicksort(arr, 0, arr.length-1);
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
	}
	
}
