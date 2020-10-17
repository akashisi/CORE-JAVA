import java.util.Scanner;

class aaddition
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int num1,num2,sum=0;
		System.out.println("Enter first number :: ");
		num1=input.nextInt();
		System.out.println("Enter second number :: ");
		num2=input.nextInt();
		sum=num1+num2;
		System.out.printf("Sum of two numbers is :: %d%n",sum);
	}
}
		