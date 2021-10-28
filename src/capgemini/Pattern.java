package capgemini;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = 0;
			for (int j = 0; j <= i; j++) {
				System.out.print(a + " ");
				a = a + i + 1;
			}
			System.out.println();
		}
	}

}
