package capgemini;

import java.util.Scanner;

public class AverageArray {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size Of an Array");
		  int n=sc.nextInt();
		  int arr[]=new int[5];
		  int sum=0,avg=0;
		  System.out.println("Enter the number");
		  for (int i = 0; i < arr.length; i++) 
		  {
			 arr[i]=sc.nextInt();
			}
            for (int i = 0; i < arr.length; i++)
            {
				sum+=arr[i];
			}
            avg=sum/n;
            System.out.println(avg);
	}

}
