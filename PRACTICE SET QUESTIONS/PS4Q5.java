import java.util.Scanner;
public class PS4Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("enter a year to be checked : ");
        int yr = s.nextInt();
        int lp_yr = yr % 4;
        if (yr % 4 == 0 && yr % 100!= 0 || yr % 400 ==0){
            System.out.println("it was a leap year");
        }
        else{
            System.out.println("it was not a leap year");
        }
    }
}
