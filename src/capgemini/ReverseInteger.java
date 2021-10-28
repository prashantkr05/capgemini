package capgemini;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int rev = 0, temp = n;
		while (n != 0) {
			int r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		if (temp == rev)
			System.out.println(rev + " Reversed Integer");
		else
			System.out.println("not Reversed");
	}

}
