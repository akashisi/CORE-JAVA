class Outer 
{
	int a;
	public  void show()
	{
		System.out.println("We are in show  function of  outer class");
	}
	static class Inner
	{
		public void display()
		{
			System.out.println("We are in display function of INNER class");
		}
	}
	
	
}


class InnerDemo
{
	public static void main(String args [])
	{
			Outer obj=new Outer();
			obj.show();
			Outer.Inner obj1=new Outer.Inner();
			
			obj1.display();
	}
}