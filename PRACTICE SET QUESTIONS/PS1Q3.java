// PS1Q3: get the name of user and greet them
import java.util.Scanner;
public class PS1Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next();
        System.out.println("HELLO! " + name + " WELCOME TO JAVA DUDE");
        System.out.println("Hello! "+ sc.next() + " Welcome to java dude"); // another method
    }
}
