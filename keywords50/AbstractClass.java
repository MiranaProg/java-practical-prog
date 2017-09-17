package keywords50;

abstract class AbstractClass// abstract class containing abstract methods
{
	protected 
	int protectedvar=40;
	private
	int privatevar=70;
	public
	int publicvar=50;
	
	abstract void AbstractMethod();	
	public AbstractClass() {
		// TODO Auto-generated constructor stub
		System.out.println("20.\tsuper keyword...constructor of abstract class called");
		System.out.println("21.\tabstract keyword...entered in abstract class( can't be instatntiated)");
		System.out.println("22.\tprivate keyword...Accessing private field non inheritable privatevar value " +privatevar);
	}
}
