package arrary;

import java.util.Scanner;

public class AverageMarksStudent {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Marks of Student ");
     int n = sc.nextInt();
     int marks[i] = new int[n];
     for(int i=0;i<n;i++) {
    	 marks[i] = sc.nextInt();
     }
     int averageMarks = 0;
     for(int i=0;i<n;i++) {
    	 averageMarks += averageMarks[i];
     }
     averageMarks  /= n;
     System.out.println("The AverageMarks are "+averageMarks );
     
	}
}
}
