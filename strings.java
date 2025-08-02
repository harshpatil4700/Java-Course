import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
    // different ways to declare an object of string
        String name1;                                  // type 1
        name1 = new String ("harsh");
        System.out.println(name1);

        String name2 = new String ("harsh");   // type 2
        System.out.println(name2);

        String name3 = "harsh";                    // type 3
        System.out.println(name3);
    
    // different ways to print
        System.out.print("Hello! myself ");
        System.out.println(name1);
        System.out.println("welcome to java");

        int a = 6;
        float b = 5.678999f;
        System.out.printf("the value of a is %d and value of b is %f" , a ,b);

        System.out.print("  the output of the system.out.format is : ");
        System.out.format("the value of a is %d and value of b is %f" , a ,b);

    // some methods to modify the float format specifier( %f : %.nf and %m.nf)
        System.out.printf("the value of a is %d and value of b is %.3f " , a ,b);   // .nf float format specifier prints only n numbers after the decimal point
        System.out.printf("the value of a is %d and value of b is %10.4f " , a ,b);    /*  m.nf float format specifier reserves 10 spaces for the number from left to right 
        and leaves the blank spaces as it is from the left side and also .nf prints noly n number after the decimal */
   
    // geting a string from user(scanner method)
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String str1 = s.nextLine();
        System.out.println(str);
        System.out.println(str1);
    }   
}
