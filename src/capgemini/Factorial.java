package capgemini;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter The Number");
		   int n=sc.nextInt();
		   int fact=1;
		   int r=n%10;
		   while(r!=0)
		   {
			  fact=fact*r;
			  r--;
			  n=n/10;
		   }
		   	System.out.println(fact);	
	}

}
