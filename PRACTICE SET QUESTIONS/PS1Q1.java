// PS1Q1: get the sum of three numbers entered by the user
import java.util.Scanner;        // importing scanner class
public class PS1Q1 {               
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int sum = a + b + c;
        System.out.println("sum of three numbers is : " + sum);
    }
}
