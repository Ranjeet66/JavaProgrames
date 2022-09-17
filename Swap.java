import java.util.*;  
public class Swap   
{  
    public static void main(String a[])   
    {   
        System.out.println("Enter the value of a and b");  
        Scanner sc = new Scanner(System.in);    
        int a = sc.nextInt();  
        int b = sc.nextInt();  
        System.out.println("before swapping numbers: "+a +" "+ b);   
        a = a+ b;   
        b = a - b;   
        a = a- b;   
        System.out.println("After swapping: "+a +"  " + b);   
    }   
}  