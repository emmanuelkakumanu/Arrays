
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
		int k=s.nextInt();
		Ideone ob=new Ideone();
		ob.remove(n,k,a);
	}
	void remove(int m,int re,int[] b)
	{
		int ri=0;
		for(int i=0;i<m;i++)
		{
			if(b[i]==re)
			{
				ri=i;break;
			}
		}
		for(int j=ri;j<m-1;j++)
		{
			b[j]=b[j+1];
		}
		System.out.print(Arrays.toString(b));
	}
}
