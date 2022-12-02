package literalstringmethod.copy;

public class LiteralStringMethods {

	public static void main(String[] args) {
		
		String s="Welcome to core Java";
		String s1="Welcome to Trio Trend";
		String s2="welcome to trio trend";
		String s3="25-06-2025";
		String s4=" 7598 ";
		
		// 1. Equal or Not
		System.out.println("1.The String s1 and s2 are equal ---> "+s1.equals(s2));
		System.out.println("2.The String s1 and s2 are equal ---> "+s1.equalsIgnoreCase(s2));
		
		//2.Index 5th character of string
		System.out.println("3.The 5th Character of the s String is ---> "+s.charAt(5));
		
		//3.Length of the String
		System.out.println("4.The Length of the String s4 is ---> "+s4.length());
		
		//4.Upper and Lower Case
		System.out.println("5."+s2.toUpperCase());
		System.out.println("6."+s.toLowerCase());
		
		//5.concat
		System.out.println("7."+s3.concat(s4));
		
		//6.Join
		System.out.println("8."+String.join(" -",s3,s4));
		System.out.println("9."+s1+" & "+s2);
		
		//7.Indexed Number of first Character 'o'
		System.out.println("10.Indexed number of first character o is ---> "+s2.indexOf('o'));
		
		//8.Indexed Number of Second Character 'o'
		System.out.println("11.Indexed number of second most character of o is ---> "+s2.indexOf('o', 5));
		
		//9.Retrieve of index of word
		System.out.println("12.The index of java in String s is ---> "+s.indexOf("Java"));
		
		//10.Substring
		System.out.println("13."+s.substring(15));
		System.out.println("14."+s.substring(16, 20));
		
		//11.String Contains
		System.out.println("15."+s1.contains("Trend"));
		
		
		//12.To Ascertain blank in the string
		System.out.println("16."+s3.isBlank());
		
		//13.Trim
		System.out.println("17."+s4.trim());
		
		//14.Convert Integer into String
		
		int i = 1893;
		
		String s5= String.valueOf(i);
		System.out.println("18."+s5);
		
		//15.Convert String into integer
	    String s6= "2589";
	    
		int l= Integer.parseInt(s6);
		System.out.println(l);
		
	    //16.split
		
	//1.	
		String s7[]= s3.split("-");
		System.out.println(s7[0]);
		System.out.println(s7[1]);
		System.out.println(s7[2]);
		
	//2.Using For Each
		
		 String s8[]=s3.split("-");
		 for (String str : s8) {
			 
			 System.out.println(str);
			}
	
		 //17.Replace
		 
		 System.out.println("19."+s.replace("Java", "Coimbatore"));
		 
		 //18.Compare to find Greater Value
		 
		 System.out.println("20."+s4.compareTo(s5));
		
		StringBuffer sb= new StringBuffer("Welcome to coimbatore");
		
		System.out.println(sb);
		
		//1.Append
		System.out.println("21."+sb.append(" once more"));
		
		//2.Reverse
		System.out.println("22."+sb.reverse());
		System.out.println("23."+sb.reverse());
		
		//3.insert
		System.out.println("23."+sb.insert(11, "the "));
		
		//4.Delete
		System.out.println("24."+sb.delete(11, 15));
		
		//5.Replace
		System.out.println("25."+sb.replace(8, 10,"the"));
		
		//6.Capacity
		System.out.println("26."+sb.capacity());
		
		
		
		

	}

}
