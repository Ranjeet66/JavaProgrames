package arrary;
import java.util.Scanner;
public class MaxNumber {
	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int a[] = {7,9,6,8,4,3,1};
   int min = a[0];
   for(int i=1;i<a.length;i++) {
	   if(min>a[i]) {
		   min = a[i];
	   }
   }
   System.out.println(min+" min element is");
	}
}
