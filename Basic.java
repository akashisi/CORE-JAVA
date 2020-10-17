import java.util.Scanner;
import java.lang.Math;
class Basic
{
	static int prime(int n)
	{
		int i=0,m;
		m=n;
		for(i=2;i<=(Math.sqrt(n));i++)
		{
			if(n%i==0)
				return(0);
		}
		if(i>(Math.sqrt(n)))
			return(1);
		else
			return(0);
		
		
	}
	
	
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number to check prime :: ");
		
		int x=sc.nextInt();
		
		int p=prime(x);
		if(p==1)
			System.out.println("PRIME NUMBER" );
		else
			System.out.println("NOT PRIME NUMBER ");
		
	}
}