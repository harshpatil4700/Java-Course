import java.util.Scanner;

public class switch_case_statements {
    public static void main(String[] args) {
        int age;
        System.out.print("enter your age : ");
        Scanner s = new Scanner (System.in);
        age = s.nextInt();

        switch (age){
            case 18:
                System.out.println("you are going to become an adult");
                break;

            case 23:
                System.out.println("you are going to join a job!");
                break;

            case 30:
                System.out.println("you are going to marry");
                break;

            case 60:
                System.out.println("you are going to retire from a job!");
                break;

            default:
                System.out.println("enjoy ur life dude!");
        }

        // if switch case statements are used without 'break' keyword:-
        int age1;
        System.out.print("enter your age : ");
        Scanner s1 = new Scanner (System.in);
        age1 = s1.nextInt();

        switch (age1){
            case 18:
                System.out.println("you are going to become an adult");
               // break;

            case 23:
                System.out.println("you are going to join a job!");
               // break;

            case 30:
                System.out.println("you are going to marry");
                // break;

            case 60:
                System.out.println("you are going to retire from a job!");
               // break;

            default:
                System.out.println("enjoy ur life dude!");
        //o/p:-It will print all the statements under it bcoz age = 18 is satisfies and has no break keyword so it will not exit the loop and go on executing all the below statements
        }
    }
}
