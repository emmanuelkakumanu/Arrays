
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
		int m=s.nextInt();
		int b[]=new int[m];
		for(int i=0;i<n;i++)
		b[i]=s.nextInt();
		
		List<Integer> c=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(a[i]==b[j])
				c.add(a[i]);
			}
		}
		System.out.print(c);
	}
	
}
