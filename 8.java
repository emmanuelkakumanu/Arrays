
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
		
		Ideone ob=new Ideone();
		ob.find(n,a);
	}
	void find(int n,int [] a)
	{
		int min=a[0],max=a[0];
		for(int i=0;i<n;i++)
		{
			if(min>a[i])
			min=a[i];
			
			if(max<a[i])
			max=a[i];
		}
		System.out.println("Min : "+min+"\nMax : "+max);
	}
}
