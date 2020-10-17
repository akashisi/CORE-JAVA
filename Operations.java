class Calculator
{
	public double sum(double a,double b)
	{
		return(a+b);
	}
	public double sum(double a,double b,double c)
	{
		return(a+b+c);
	}
	public double sum(int ...a)
	{
		int sum=0;
		for(int i:a)
		{
			sum=sum+i;
		}
		return(sum);
	}
	
}


public class Operations
{
	public static void main(String args[])
	{
		Calculator obj1=new Calculator();
		Calculator obj2=new Calculator();
		Calculator obj3=new Calculator();
		Calculator obj4=new Calculator();
		Calculator obj5=new Calculator();
		Calculator obj6=new Calculator();
		
		System.out.println("Sum of three double numbers is ::  "+obj1.sum(10.43,12.47,8.10));
		System.out.println("Sum of two double numbers  is  ::  "+obj2.sum(10.43,12.47));
		System.out.println("Sum of three integers      is  ::  "+obj3.sum(10,12,89));
		System.out.println("Sum of four integers       is  ::  "+obj4.sum(10,12,8,98));
		System.out.println("Sum integer & double numbers is::  "+obj5.sum(12,1.98));
		System.out.println("Sum of 12 integers  numbers is ::  "+obj6.sum(10,12,23,45,67,89,76,54,32,12,11));
		
		
	}	
}
