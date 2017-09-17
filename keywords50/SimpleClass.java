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
    		System.out.println("17.\tbreak keyword...skip rest of the cases after getting right one");
    		break;
    		default://Default keyword
    			System.out.println("17.\tdefault keyword...");
    		
    	}
    }
}