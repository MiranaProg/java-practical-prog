package functionoverriding;

class Base
{
	int i;
	Base(int i)
	{
		this.i=i;
		System.out.println("super class constructor called...");
	}
	
	void display()
	{
		System.out.println("super class display() called");
	}
}

class Derived extends Base
{
	public Derived() {
		// TODO Auto-generated constructor stub
		super(35);
		System.out.println("Sub class constructor called...");
	}
	
	void display()
	{
		System.out.println("sub class desplay() called");
		super.display();
		System.out.println("value of i :" + super.i);
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Derived derived=new Derived();		
		derived.display();

	}

}
