package collectionPrograms;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class AlreadyExitsornot {

	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<String>();
		al.add("java");
		al.add("c++");
		al.add("c");
		al.add("react");
		al.add("c");
		
		if(al.contains("c"))
		{
			System.out.println("The value of c is already exists in ArrayList");
		}
		else
		{
			System.out.println("The value of c is not exists in ArrayList");
		}
	}
}
