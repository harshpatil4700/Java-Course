import java.util.Scanner;
public class PS4Q3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("enter your income in LPA: ");
        float tax = 0;
        float inc = s.nextFloat();
        if (inc <= 2.5){
            tax = tax + 0;
        }
        else if (inc > 2.5f && inc <= 5f){
            tax = tax + 0.05f * (inc - 2.5f);
        }
        else if (inc > 5f && inc <= 10f){
            tax = tax + 0.2f * (5.0f - 2.5f);
            tax = tax + 0.05f * (inc - 2.5f);
        }
        else if (inc > 10.0f){
            tax  = tax + 0.3f * (inc - 10.0f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.05f * (5.0f - 2.5f);
        }
        System.out.println("total tax paid by the employee is: " + tax);
    }
}        
