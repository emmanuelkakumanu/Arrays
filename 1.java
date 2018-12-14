
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
		ob.add(n,a);
	}
	void add(int m,int[] b)
	{
		int sum=0;
		for(int i=0;i<m;i++)
		{
			sum=sum+b[i];
		}
		System.out.print("sum : "+sum);
	}
}
