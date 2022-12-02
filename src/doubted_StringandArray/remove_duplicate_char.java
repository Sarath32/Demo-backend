package doubted_StringandArray;

import javax.swing.plaf.synth.SynthToolTipUI;

public class remove_duplicate_char {

	public static void main(String[] args) {
        
		String a="Welcome to java";
		
		char c[]=a.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					c[j]='0';
				}
			}
			if(c[i]!='0' )
			{
				System.out.print(c[i]);
			}
		}
		
	}

}
