class A
{
	A()
	{
		System.out.println("We are in constructor of SUPER  class ");
	}
	void show()
	{
		System.out.println("We are in show method of  SUPER class ");
	}
	
}
class B extends A
{
	B()
	{
		System.out.println("We are in constructor of   SUB class ");
	}
	
	void show()
	{
		super.show();
		System.out.println("We are in show  method  of SUB class ");
	}
}
class Overriding
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.show();
	}
}