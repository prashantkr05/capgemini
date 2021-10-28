package capgemini;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
         int n=sc.nextInt();
      //   for(int i=2;i<=n/2;i++) 
        // {
        	 if(n%2==0)
        		 System.out.println(n+" is not a prime number");
        	 else
        		 System.out.println(n+" is a prime number");
        // }
	}

}
