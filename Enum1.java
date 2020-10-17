
import java.util.Scanner;

enum Test
{
	EVEN,ODD;
}

public class Enum1
{
	public static void main(String args[])
	{
		Test t;
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the number is :: ");
		int a=sc.nextInt();
		if(a%2==0)
			t=Test.EVEN;
		else
			t=Test.ODD;
		switch(a%2)
		{
			case 0: System.out.println("The number is :: "+t.EVEN);
					break;
			case 1: System.out.println("The number is :: "+t.ODD);
					break;
		}
	}
	
}