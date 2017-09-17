package prog2;

import java.util.Scanner;

public class Factorial {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		int fact=1,i,num;
		char ch='n';
		do 
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		num=sc.nextInt();
		for(i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial is " + fact);
		fact=1;
		System.out.println("wanna perform again...");
		ch=sc.next().charAt(0);
		}while(ch=='y');
	}

}
