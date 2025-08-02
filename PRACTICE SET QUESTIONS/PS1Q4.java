// PS1Q4: converting kilometres to miles

import java.util.Scanner;
public class PS1Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("CONVERTING KILOMETRES TO MILES");
        System.out.println("enter the kilometre magnitude"); 
        double km = s.nextFloat();
        double mile = km * 0.621371;
        System.out.println("the mile equivalent of " + km + " km is : " + mile + " miles");
    }
}
