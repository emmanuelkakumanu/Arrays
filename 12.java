
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
		obj.remove(n,a);
		
	}
	void remove(int n,int[] a)
	{
		Arrays.sort(a);
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j]=a[i];
				j++;
			}
		}
		temp[j++]=a[n-1];
		for(int i=0;i<j;i++)
		System.out.println(temp[i]);
	}
}
