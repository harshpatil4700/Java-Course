import java.util.Scanner;        // importing scanner class

public class another_methods_for_user_input{
    public static void main(String[] args) {
        System.out.println("taking input from the user"); 
        Scanner s = new Scanner(System.in);
        boolean b1 = s.hasNextInt();       // hasNextInt checks whether the input from user is int data type or not and returns true if i/p is int orelse returns false
        boolean b2 = s.hasNextFloat();     // hasNextFloat checks whether the input from user is float data type or not and returns true if i/p is float orelse returns false
        System.out.println(b1);
        System.out.println(b2);
        String str = s.next();            // next prints the string as it is untill a blank space is encountered
        System.out.println(str);
        String str1 = s.nextLine();       // nextLine prints the complete string as it is along with the blank spaces in between
        System.out.println(str1);
    }
}