package ExceptionHandling;

public class ExceptionClass {

	public static void main(String[] args) { 
		fun1();
	}
//		try {
////			int a = 5;
////			int b = 0;
////			
////			int c = 5/0;
//			int a[] = new int[5];
//			System.out.println(a[6]);
////			System.out.println(c);
//		}catch(ArithmeticException e) {
//			System.out.println(e.getMessage()+" occured, please check your code.");
////		}catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("Index should be in the range of ) to size of array");
//			
//		}catch(IllegalArgumentException e){
//		System.out.println("check your casting carefully");
//		}finally {
//			System.out.println("Sorry for the Inconvenience");
//		}
//
//              System.out.println("very Important Code");
//            System.out.println("need to run");
	static void fun1() {
		int a = 5;
		int b = 2;
		int c = a/b;
		System.out.println(c);
		
		boolean isDanger = true;
		if(isDanger) {
		throw new ArrayIndexOutOfBoundsException("Danger was Coming");
	     }
      }
     }