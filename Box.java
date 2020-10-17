class B
{
	double l,b,h;
	B()
	{
		System.out.println("We are in default constructor ");
		l=b=h=-1;
	}
	B(double d)
	{
		System.out.println("We are in single  parameter  constructor ");
		l=b=h=d;
	}
	B(double x,double y,double z)
	{
		System.out.println("We are in three parameter constructor ");
		l=x;
		b=y;
		h=z;
	}
	B(int x,int y,int z)
	{
		System.out.println("We are in integral promotion constructor ");
		l=x;
		b=y;
		h=z;
	}
	double volume()
	{
		return(l*b*h);
	}
}
class Weight extends B
{
	double w;
	Weight(double a,double b,double c,double d)
	{
		l=a;
		this.b=b;
		h=c;
		w=d;
	}
}
class Box
{
	public static void main(String args[])
	{
		//Weight b1=new Weight();
		Weight b2=new Weight(1,2,4,8);
		//Weight b3=new Weight(9.6);
		Weight b4=new Weight(1.9,2,3,7);
		
		System.out.println("Weight  of box b2 = "+b2.w);
		System.out.println("Volume of box b2 = "+b2.volume());
		System.out.println("Weight of box b4 = "+b4.w);
		System.out.println("Volume of box b4 = "+b4.volume());
	}
}