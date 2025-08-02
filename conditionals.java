// conditionals refer to all the condition statements such as if,else,else if statements 
import java.util.Scanner;
public class conditionals {
    public static void main(String[] args) {

        int age = 18;
        if (age > 18){
            System.out.println("eligible to drive");
        }
        else{
            System.out.println("not eligible to drive");
        }

        // user input:
        Scanner s = new Scanner(System.in);
        System.out.println("enter your age"); 
        int age1 = s.nextInt();
        if (age1 > 18){
            System.out.println("eligible to drive");
        }
        else{
            System.out.println("not eligible to drive");
        }
        // relational operators in java:
        if (age >= 18){
            System.out.println("eligible to drive");
        }
        else{
            System.out.println("not eligible to drive");
        }

        if (age == 18){
            System.out.println("eligible to drive");
        }
        else{
            System.out.println("not eligible to drive");
        }
        // if (age = 18) will give an error because it should be boolean but for int it need to be age ==18 as done above

        boolean cond = (age == 18);
        if (cond){
            System.out.println("eligible to drive");
        }
        else{
            System.out.println("not eligible to drive");   

        System.out.println(18>=18);       // true bcoz satisfies 18 = 18
        System.out.println(18<=20);       
        System.out.println(18!=19);
        }
    }
}




