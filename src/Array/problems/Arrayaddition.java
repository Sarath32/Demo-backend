package Array.problems;

public class Arrayaddition {
public static void main(String[] args) {
	
	int a[]= {50,20,30,40,51,452,14152};
	int b[]= {20,45,50};
	
	int n=a.length>b.length?a.length:b.length;
	int small=a.length<b.length?a.length:b.length;
	
	
	int c[]=new int[n];
	for(int i=0; i<small;i++)
	{
		c[i]=a[i]+b[i];
	
	}
	for(int i=small; i<n;i++)
	{
		c[i]=a[i];
	}
	
	for(int i=0; i<c.length;i++)
	{
		System.out.println(c[i]);
	}
}
}
