abstract class Book
{
	int Noofpages=0;
	String name;
	
	Book()
	{
		System.out.println("abstract class constructor");
	}
	abstract void details();
	
	static void sell()
	{
		System.out.println("non-abstract sell method of abstract class.");
	}
	void buy()
	{
		System.out.println("buy method of abstract class");
	}
}
class Comics extends Book
{
	int Noofpages=450;
	String name="deadpool";
	Comics()
	{
	   System.out.println("child class constructor");	
	}
	void details()
	{
		System.out.println(name+" "+Noofpages);
	}
	void buy()
	{
		System.out.println("buy method of child class Comics");
	}
	
}
class AbstractDemo
{
	public static void main(String args[])
	{
	Comics obj= new Comics();
	obj.details();
	Book obj1=new Comics();
	obj1.sell();
	
	
	obj1.details();
	obj1.buy();
	obj.buy();
	System.out.println("This is Noofpages variable value of abstract class Book= "+obj1.Noofpages);
	System.out.println("This is Noofpages variable value of child class Comics= "+obj.Noofpages);
	}
	
	
}