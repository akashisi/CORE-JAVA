class Student
{
	int roll;
	String name;
	String address;
	char section;
	
	public Student()
	{
		System.out.println("we are in default constructor");
		roll=19008;
		name="Akash";
		address="Lakhimpur";
		section='A';
	}
	
	public Student(int roll,String name,String address,char section)
	{
		System.out.println("we are in parametrised constructor");
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.section=section;
	}
	void getdata()
	{
		System.out.println("we are in getdata() function ");
		System.out.println("ROLL NUMBER IS :: "+roll);
		System.out.println("NAME      IS   :: "+name);
		System.out.println("Address   IS   :: "+address);
		System.out.println("Section   IS   :: "+section);
	}
	
}






public class ConstOver
{
	public static void main(String args[])
	{
		Student st1=new Student();
		Student st2=new Student(1001,"Prakash","Patna",'B');
		
		st1.getdata();
		st2.getdata();
		
	}
}