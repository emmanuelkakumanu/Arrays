
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
		ob.reverse(n,a);
	}
	void reverse(int n,int [] a)
	{
		int b[]=new int[n];
		int i=0;
		for(int j=n-1;j>=0;j--)
		{
			b[i++]=a[j];
		}
		System.out.print(Arrays.toString(b));
		
	}
}
