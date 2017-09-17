package keywords50;

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
