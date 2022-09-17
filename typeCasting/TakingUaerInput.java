package typeCasting;

import java.util.Scanner;

public class TakingUaerInput {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		char letters = sc.nextLine().charAt(0);
		String str = sc.nextLine();
		float decimal =  sc.nextFloat();
		double myDouble = sc.nextDouble();
		System.out.println(number);
		
	}

}
