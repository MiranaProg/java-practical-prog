package prog3;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,i=2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		num=sc.nextInt();
		while(i<num)
		{
			if(num%i==0)
			{
				
				
					System.out.println("not prime");
					break;
							
			}
			
			i++;	
		}
		if(num==i)
			System.out.println("prime no");
			
				
	}

}
