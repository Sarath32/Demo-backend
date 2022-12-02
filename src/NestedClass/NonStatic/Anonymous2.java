package NestedClass.NonStatic;

public class Anonymous2 {

	public static void main(String[] args) {
	
		AnonymousinnerClass j=new AnonymousinnerClass()
				{
		
		public void Anonymous() {
			System.out.println("Print from Anonymous class");
		}
				};
		j.Anonymous();
		
	}

}
