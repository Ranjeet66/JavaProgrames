package typeCasting;
import java.util.Scanner;
public class SampleInterest {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int prancipal = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		
		float sampleInterest = prancipal*rate*time/100;
		System.out.println(sampleInterest);
		
	}

}
