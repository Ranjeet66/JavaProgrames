package arrary;

public class BubbleSort {

	public static void main(String[] args) {
   int a[] = {2,1,8,-3,6,4,12};
   int n = a.length;
   for(int i=0;i<n-1;i++) {
	 boolean sorted = true;
	 for(int j=0;j<n-1;j++) {
		 if(a[j+1]<a[i]) {
			 int temp = a[j+1];
			 a[j+1] = a[i];
			 a[i] = temp;
			 sorted = false;
		 }
	 }
            if(sorted)break;  
              }
   for(int item:a) {
	   System.out.print(item+ " ");
              }
           }
      }
