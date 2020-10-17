import java.util.Scanner;
enum Test
{
	VALID,INVALID;
}
public class Enum2
{
	public static void main(String args[])
	{
		Test t;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number is :: ");
		int a=sc.nextInt();
		int x;
		if(a>0 && a<=100)
		{
			t=Test.VALID;
			x=0;
		}
		else
		{
			t=Test.INVALID;
			x=1;
		}
		switch(x)
		{
			case 0: System.out.println("The number is  :: "+t.VALID);
					break;
			case 1: System.out.println("The number is :: "+t.INVALID);
					break;
		}
	}
}