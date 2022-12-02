package Accerstion;

import java.util.Scanner;

public class testAccertion {

	public static void main(String[] args) {

       Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number ");
		
		int num=sc.nextInt();
		assert (num==15):"The Number is not 15,kindly check number";
		System.out.println("Your number is "+num);
		
	}

}
