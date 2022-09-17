package loops;

import java.util.Scanner;

public class DoLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//       int n = 0;
//       do {
//    	   System.out.print("Number is "+n);
//       }while(n!=0);
	       do {
			  int n = sc.nextInt();

	    	   System.out.print("Number is "+n);
	       } while(n!=n);
	}
}
