package loops;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int results = 1;
		for (int i = 1; i <= b; i++) {
			results *= a;
		}
		System.out.println(results);
	}
}
