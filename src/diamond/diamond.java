package diamond;

import java.util.Scanner;

public class diamond {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("input:");
		int i = scanner.nextInt();
		if (i % 2 == 1) {
			int j = (i - 1) / 2;
			for (; j >= 0; j--) {
				for (int k = 0; k < j; k++) {
					System.out.print(" ");
				}
				for (int m = i - j - 1; m > j; m--)
					System.out.print("*");
				System.out.println("*");
			}
			
			for (int n = 0; n < i / 2; n++) {
				System.out.print(" ");
				for (int q = 0; q < n; q++)
					System.out.print(" ");
				for (int p = i - n * 2 - 4; p >= 0; p--)
					System.out.print("*");
				System.out.println("*");
			}
		}
		else
			System.out.println("error");
	}
}
