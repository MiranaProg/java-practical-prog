package keywords50;

final class FinalClass
{
    final int finalVariable = 10;
    
    public FinalClass() {
		// TODO Auto-generated constructor stub
    	System.out.println("20.\tfinal keyword");
    	System.out.println("\t\tstart executng finalclass...can't be extended");
	}
    final void finalMethod()
    {
        //final method
    	System.out.println("\t\tfinal method called..can't be modified/overriden");
    	System.out.println("\t\tfinal variable accessing...value can't be changed value:" +finalVariable);
    }
}
