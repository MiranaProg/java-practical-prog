package keywords50;

interface MyInterface//interface keyword
{
    void myMethod();
  default void  defaultmethod() //default keyword
{
	System.out.println("28.\tdefault keyword... executing defaultmethod() of interface");
}
  
    
}