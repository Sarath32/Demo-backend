package nonprimitive;

public class StringMethods1 {

	public static void main(String[] args) {
		
		String s="welcome to core Java";
		String s1="welcome to trio trend";
		String s2="Welcome to core java";
		
		//1.Compare of two Strings
		System.out.println("1.The String s and s1 are equal ---> "+s.equals(s2));
        System.out.println("2.The String s1 and s2 are equal ---> "+s1.equalsIgnoreCase(s2));
        System.out.println("3.The String s and s2 are equal ---> "+s.equalsIgnoreCase(s2));
	
	    //2.Retrieve of 17th Index character
        System.out.println("4.The 17th Indexed Character of s1 is ---> "+s1.charAt(17));
        
        //3.Concat of two Strings
        System.out.println("5."+s+" & "+s2);
        System.out.println("6."+s1.concat(s2));
        
        //4.Length of the Strings
        System.out.println("7.The Length of the s1 is ---> "+s1.length());
        
        //5.Upper Case of the String
        System.out.println("8."+s.toUpperCase());
        
        //6.Lower Case of the String
        System.out.println("9."+s2.toLowerCase());
        
	    //7.Retrieve the index of first "o" character
        System.out.println("10.The First O character in s1 is ---> "+s1.indexOf('o'));
	
        //8.Retrieve the index of second most "o" character
        System.out.println("11.The Second most O character in s1 is ---> "+s1.indexOf('o',5));
        
        //9.Retrieve the index of the word
        System.out.println("12.The index of the word trend in s1 is ---> "+s1.indexOf("trend"));
        
        //10.substring
        System.out.println("13."+s.substring(11));
        System.out.println("14."+s1.substring(11, 15));
        
        //11.String contains
        System.out.println("15.Is that String s1 contain trio ---> "+s1.contains("trio"));
        
        //12.String blank and empty
        System.out.println("16.Is that String s2 is empty ---> "+s2.isEmpty());
        String s3 = " ";
        System.out.println("17.Is that String s3 is empty ---> "+s3.isBlank());
        
        //13.Trim
        String d=" Welcome to Coimbatore ";
        System.out.println("18."+d.trim());
        
        //14.String Join
        System.out.println("19."+String.join(""
        		+ ""
        		+ " & ",s1,s2));
        System.out.println("20."+s1+" & "+s2);
        
        //15.Converting Value from Integer to String
        int i= 1256;
        String s5=String.valueOf(i);
        System.out.println("21."+s5);
        
        //16.Converting Value from String to Integer
        int j=Integer.parseInt(s5);       // only number (Exception of number)
        System.out.println("22."+j);
        
        //17.Split
        String s7="15-03-2027";
        String s6[]=s7.split("-");
        System.out.println(s6[0]);
        System.out.println(s6[1]);
        System.out.println(s6[2]);
        
        //18.Replace
        System.out.println("24."+s7.replace("15", "16"));
        
        //19.Compare for ascertain the greater value
        System.out.println("25."+s1.compareTo(s7));
        System.out.println("26."+s.compareToIgnoreCase(s2));
        
        //20.String Split method using FOR EACH
        String s10="15-03-2027";
        String s11[]=s10.split("-");
       
        
		}
		
       
       
        
	}


