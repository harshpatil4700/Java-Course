// to check if the number entered by the user is greater than given number or not 

import java.util.Scanner;

public class PS2Q3 {
    public static void main(String[] args) {
        int my_num = 10;
        Scanner s = new Scanner (System.in);
        System.out.println("enter a number : ");
        int user_num = s.nextInt();
        System.out.println("number entered by the user is : " + user_num);
        System.out.println(my_num > user_num);
    }
}
