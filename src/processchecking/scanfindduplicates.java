package processchecking;

import java.util.Scanner;

public class scanfindduplicates {

	public static void main(String[] args) {

		
		  System.out.println("Enter here :");
		  Scanner sc=new Scanner(System.in); 
		  String s=sc.nextLine();
		 

		String a[] = s.split(",");
		int count;
		for (int i = 0; i < a.length; i++) {
			count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].equalsIgnoreCase(a[j])) {
					count++;
					a[j] = "0";
				}
			}
			if (count > 1 && a[i] != "0") {
				System.out.print(a[i]+" ");
			}

		}
	}

}
