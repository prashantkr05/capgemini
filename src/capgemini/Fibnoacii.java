package capgemini;

import java.util.Scanner;

public class Fibnoacii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the input");
		int n = sc.nextInt();
		int n1 = 0, n2 = 1;
		int n3;
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < n; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

}
