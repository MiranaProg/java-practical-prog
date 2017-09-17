package prog4;

import java.util.Scanner;

class Employee
{
	String name;
	Double salary;
    public int emp_no;
	
     public Employee(int emp_no) {
		// TODO Auto-generated constructor stub
    		this.emp_no=emp_no;
	}
 
	
	

	public void set()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee" +emp_no);
		
		System.out.println("Enter employee name...");
		name=sc.next();
		System.out.println("enter employee salary...");
		salary=sc.nextDouble();
		
	}
	
	public void display() {
				
		System.out.println(emp_no + "\t" + name +"\t"+ salary);		
		
	}
	
	
}
public class ForCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int emp_no=100;
		Employee emp1=new Employee(++emp_no);
		Employee emp2=new Employee(++emp_no);
		emp1.set();
		emp2.set();
		System.out.println("EMPLOYEE_NO.\tEMPLOYEE_NAME\tEMPLOYEE_SALARY");
		emp1.display();
		emp2.display();

	}

}
