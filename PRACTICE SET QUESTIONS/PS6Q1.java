import java.util.Scanner;
public class PS6Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter 5 floats: ");
        float f1 = s.nextFloat();
        float f2 = s.nextFloat();
        float f3 = s.nextFloat();
        float f4 = s.nextFloat();
        float f5 = s.nextFloat();
        
        float [] nums = {f1,f2,f3,f4,f5};
        for(float a : nums){
            System.out.print(a);
            System.out.print(" ");
        }
        float sum = f1+f2+f3+f4+f5;
        System.out.println("\nthe sum of given floats is : " + sum);
    }
}