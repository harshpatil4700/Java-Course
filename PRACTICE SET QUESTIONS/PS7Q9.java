import java.util.Scanner;
public class PS7Q9 {
    static double faren(float c){
        return (1.8*c)+32; 
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the celsius temp: ");
        float c=s.nextFloat();
        System.out.print("\nthe temp in farenhite is equal to: " + faren(c) + " degree farenhite");
    }
}
