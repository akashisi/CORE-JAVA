import java.util.Scanner;

class B
{
	static int sum(int n,int m)
	{
		return(n+m);
	}
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter two number to ADD :: ");
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		int p=sum(x,y);
		
			System.out.println("SUM = "+p );

		
	}
}