
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		
		Ideone obj=new Ideone();
		obj.verify(n,a);
		
	}
	void verify(int n,int[] a)
	{
		 boolean st=false,st1=false;
		 for(int i=0;i<n;i++)
		 {
		 	if(a[i]==12)
		 	st=true;
		 	
		 	if(a[i]==23)
		 	st1=true;
		 }
		 if(st && st1)
		 System.out.print("Contains 12 and 23");
		 else
		 System.out.print("Does not contain 12 and 23");
	}
}
