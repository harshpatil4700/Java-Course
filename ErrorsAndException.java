import java.util.Scanner;

public class ErrorsAndException {
    public static void main(String[] args) {
        /* 1. Syntax errors:(syantax errors can be resolved by using the bulb)
        int a = 10;   Missing Semicolon (;)
        System.out.println(a+b);   Variable 'b' not declared before use
        String name = 'Harsh";    Quote Missmatch    */

        // 2. Logical errors:
        //print prime nos between 1 to 10
        System.out.println("2");
        for(int i=1;i<5;i++){
            System.out.println(2*i+1);
        } // this will also give 9 which is not a prime no and so the logic is incorrect i.e a LOGICAL ERROR

        // 3. Runtime errors:(attempt to divide by 0)
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        System.out.println("the result of 100 divided by k is: " + 100/k);
        // when user gives 0 as input for k, it throws an exception as divide by zero 

        int a = 10;
        int sum = a+"5";
        System.out.println(sum);
    }
}
