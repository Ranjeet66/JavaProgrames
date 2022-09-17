package loops;

import java.util.Scanner;

public class Series1 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	float results = 0;
	for(float i=1;i<=n;i++) {
		if(i%2==0) {
			results -= 1/i;
		}else {
			results += 1/i;
		}
	}
	System.out.println(results);
	
}
}
