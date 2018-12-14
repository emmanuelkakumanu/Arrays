
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
		ob.duplicate(n,a);
	}
	void duplicate(int n,int [] a)
	{
		ArrayList <Integer> b=new ArrayList<>();
		int k=0;
		for(int i=0;i<n-1;i++)
		{
			int cnt=0;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
			}
			if(cnt>0)
			{
				b.add(a[i]);
				
			}
		}
		LinkedHashSet<Integer> listToSet = new LinkedHashSet<>(b);
		List<Integer> c = new ArrayList<>(listToSet);
		System.out.print(c);
		
	}
}
