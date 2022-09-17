package loops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int temp = n;
      int reveresedNumber = 0;
      while(temp>0){
    	  int lastDigit = temp%10;
    	  reveresedNumber = reveresedNumber*10+lastDigit;
    	  temp = temp/10;
      }
      if(reveresedNumber==n) {
      System.out.println("Number is palindrome "+n);
	}else {
		System.out.println("Number is not palindrome "+n);
	  }
	}
 }
