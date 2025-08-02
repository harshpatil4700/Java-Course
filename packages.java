
// 1. import java.util.Random;  this imports the Random class from the java.util package
// 2. import java.util.*;    this imports all the classes of the java.util package
// java.util.Scanner s = new java.util.Scanner(System.in);  this is a way where we use a class without importing it and it should be written in main class 
public class packages {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int a = s.nextInt();
        System.out.println("this takes an input " + a);

    }
}
