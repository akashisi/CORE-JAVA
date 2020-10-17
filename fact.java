class factorial
{
	long result;
	long fa(int n)
	{
		if(n==0)
			return(1);
		return(result=n*fa(n-1));
	}
	
}

public class fact 
{
	public static void main(String args[])
	{
		factorial f=new factorial();
		System.out.println("Factorial of 0 is "+f.fa(0));
		System.out.println("Factorial of 3 is "+f.fa(3));
		System.out.println("Factorial of 5 is "+f.fa(5));
		System.out.println("Factorial of 6 is "+f.fa(6));
		System.out.println("Factorial of 7 is "+f.fa(7));
	}
}
		