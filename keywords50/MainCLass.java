package keywords50;


class SimpleClass{ 
    //instance variables
	int i1;
	long l1;
	float f1;
	double d1;
	char ch1;
	byte b1;
	boolean bl1;
	public SimpleClass() {
		// TODO Auto-generated constructor stub
		i1=20;
    	 l1=1000000;
    	 f1=7.8f;
    	 d1=4555656.989;
    	 ch1='h';
    	 b1=50;
    	 bl1=true;
	}
    void variabletypes()//instance method1
    {
    	System.out.println("2.\tvoid keyword encountered...as a return type of method specifying, a method will not return any value\n");    	
    	System.out.println("VARIABLE TYPE KEYWORDS\n");
    	System.out.println(" Printing the values of all variable types:-");
    	System.out.println("3.\tint  " +i1);
    	System.out.println("4.\tlong  " +l1);
    	System.out.println("5.\tfloat  " +f1);
    	System.out.println("6.\tdouble  " +d1);
    	System.out.println("7.\tchar  " + ch1);
      	System.out.println("8.\tboolean  " +bl1);
      	System.out.println("9.\tbyte  " +b1);
    }
    
    void Branch_n_looping()    //instance method2
    {
    	char ch='y'; 
    	System.out.println("10.\tdo keyword...start executing do while loop");
    	do {//do keyword
    		System.out.println("11.\tfor keyword...start executing for loop");
    		for(int i=1;i<=2;i++)
    	
    	{
    		if(i==1)//using if keyword
    			System.out.println("12.\tif keyword...executing if statement");
    		else//using else keyword
    			System.out.println("13.\telse keyword...executing else statement");
    		
    		ch='n';
    		
    	}
    		System.out.println("14.\twhile keyword...finished execution of do while loop");
    	}while(ch!='n');//while keyword
    	
    	System.out.println("15.\tswitch keyword...start executing switch case");
    	switch(ch)//switch keyword
    	{
    	case 'n'://case keyword
    		System.out.println("16.\tcase keyword...executing case1.");
    		break;//break keyword
    	case 'y':
    		System.out.println("16.\tcase keyword...executing case2.");
    		break;
    		default://Default keyword
    			System.out.println("17.\tdefault keyword...");
    		
    	}
    }
}

class StaticMemClass //class keyword
{
	static int staticField = 555;    //Static Field
    
    static void staticMethod() //static method 
    {
        //Static method
    	System.out.println("17.\tstatic keyword...start executing static class");
    	System.out.println("\t\texecuting static method");
    	
    	System.out.println("\t\taccessing staticField value :- " + staticField);
    }   

}


class ForThisKeyword
{
		int i;
	  ForThisKeyword()
	    {
		  System.out.println("18.\tthis keyword");
	        System.out.println("\t\tFirst Constructor called through this() ");
	    }
	  
	    ForThisKeyword(int j)
	    {
	        this();    //calling statement to First Constructor
	        System.out.println("\t\tSecond Constructor called");
	    }
	  
	    void methodOne()
	    {
	        System.out.println("\t\tsame class method called through this.methodname()");
	    }
	  
	    void methodTwo()
	    {
	        System.out.println("\t\tAccessing same class field through this.i ...  value: "+this.i);  //Accessing same class field
	        this.methodOne();      //Accessing same class method
	    }
}

final class FinalClass
{
    final int finalVariable = 10;
    
    public FinalClass() {
		// TODO Auto-generated constructor stub
    	System.out.println("19.\tfinal keyword");
    	System.out.println("\t\tstart executng finalclass...can't be extended");
	}
    final void finalMethod()
    {
        //final method
    	System.out.println("\t\tfinal method called..can't be modified/overriden");
    	System.out.println("\t\tfinal variable accessing...value can't be changed value:" +finalVariable);
    }
}

interface MyInterface//interface keyword
{
    void myMethod();
  default void  defaultmethod() //default keyword
{
	System.out.println("27.\tdefault keyword... executing defaultmethod() of interface");
}
  
    
}
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

class ForExceptionKey
{
	//String str;
	void Exceptionmethod()throws NullPointerException
	{
		
		//System.out.println(str.length());//throws keyword will execute by throwing nullpointerexception class here
		System.out.println("29.\tthrows keyword encountered with method name for upcoming NullPointerException in current method");
		  try
	        {
			  for(int i=1;i<=2;i++)
			  {
				  if(i==1){
					  System.out.println("30.\tthrow keyword...throwing NumberFormatException object");
					  throw new NumberFormatException();
				  }
				  else
				  {
					  System.out.println("29.\tcontinue keyword...continuing loop");
					  System.out.println("\t\tno exception caught while continuing");
					  continue;
				  }
			  }
	        }
	        catch(NumberFormatException ex)
	        {
	            System.out.println("31.\tcatch keyword...NumberFormatException caught successfully using catch block");
	        }
		 
	        finally
	        {
	            System.out.println("32.\tfinally keyword...This will be always executed");
	        }
	}
}
public class MainCLass  {

	public static void main(String[] args) {
		System.out.println("50 KEYWORDS IN JAVA.");
		System.out.println("1.\tclass keyword...start executing MainClass");
		SimpleClass sc=new SimpleClass();
		
		sc.variabletypes();
		System.out.println("\nLOOPING AND BRANCHING KEYWORDS\n");
		sc.Branch_n_looping();
		
		StaticMemClass.staticMethod();
		ForThisKeyword th=new ForThisKeyword(40);
		th.methodTwo();
		
		FinalClass f =new FinalClass();
		f.finalMethod();
		
		ForInheritKeyword in=new ForInheritKeyword();
		System.out.println("25.\tpublic keyword...getting publicvar value "+in.Accessmodifiers());
		in.AbstractMethod();
		in.myMethod();
		
		ForExceptionKey ex=new  ForExceptionKey();
		ex.Exceptionmethod();


  
	}

}
