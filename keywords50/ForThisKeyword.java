package keywords50;

class ForThisKeyword
{
		int i;
	  ForThisKeyword()
	    {
		  System.out.println("19.\tthis keyword");
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
