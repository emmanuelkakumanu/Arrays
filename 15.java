
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
		obj.even_odd(n,a);
		
	}
	void even_odd(int n,int[] a)
	{
		int ec=0,oc=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			ec++;
			
			if(a[i]%2==1)
			oc++;

		}
		System.out.print("Count of Even Numbers : "+ec+"\nCount of Odd Numbers : "+oc);
	}
}
