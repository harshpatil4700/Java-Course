// PS1Q5: to check whether the number entered by user is integer or not

/*import java.util.Scanner;
public class PS1Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enetr a number : ");
        boolean a = s.hasNextInt();
        System.out.println(a);
    }
} */
 
// or(2nd way)

import java.util.Scanner;
public class PS1Q5 {
    public static void main(String[] args) {
        System.out.print("enetr a number : ");
        Scanner s = new Scanner(System.in);
        System.out.println(s.hasNextInt());
    }
}