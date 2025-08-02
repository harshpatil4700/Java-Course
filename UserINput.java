import java.util.Scanner;                 // importing scanner class

public class UserInput {
    public static void main(String[] args) {
        System.out.println("taking input from the user"); 
        Scanner s = new Scanner(System.in);
        System.out.println("enter number 1");
        int a = s.nextInt();                                // taking 'a' integer from the user
        System.out.println("enter number 2");
        int b = s.nextInt();                                // taking 'b' integer from the user
        int sum = a + b; 
        System.out.println("the sum of these numbers is");
        System.out.println(sum);                             // sum of the integers a and b which are taken as input from the user
    

        Scanner s1 = new Scanner(System.in);
        System.out.println("enter number 3");
        float c = s1.nextFloat();                                // taking 'c' float(decimal no.) from the user
        System.out.println("enter number 4");
        float d = s.nextFloat();                                // taking 'd' float(decimal no.) from the user
        float product = c * d; 
        System.out.println("the product of these numbers is");
        System.out.println(product);                               // product of the decimal nos.(float) c and d which are taken as input from the user
    
    }
}
