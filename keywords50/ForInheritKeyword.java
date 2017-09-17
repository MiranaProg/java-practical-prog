package keywords50;

class ForInheritKeyword extends AbstractClass implements MyInterface
{
public int Accessmodifiers()
{
	System.out.println("23.\tprotected keyword...accessing protected member in child class protectedvar value " + protectedvar);
	System.out.println("24.\treturn keyword... returning publicvalue ");
	return publicvar;
	
}
	public ForInheritKeyword() {
		// TODO Auto-generated constructor stub
		super();
	}
	@Override
	void AbstractMethod() {
		// TODO Auto-generated method stub
		
		System.out.println("26.\textends keyword...executing overriden abstactmethod() extended from abstract class");
		
		
	}

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		defaultmethod();
		System.out.println("28.\timplements keyword...executing abstract mymethod() implemented from interface ");
		
	}
	
}
