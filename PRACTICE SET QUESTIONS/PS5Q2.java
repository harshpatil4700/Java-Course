import java.util.Scanner;
public class PS5Q2 {
    public static void main(String[] args) {
        
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("enter sum of how many first even numbers is to be calculated: ");
        int n = s.nextInt();
        
        for(int i=0;i<n;i++){
            sum = sum +(2*i);
        }
        System.out.print("the sum of first "+n+" even numbers is: ");
        System.out.println(sum);

        System.out.print("enter sum of how many first odd numbers is to be calculated: ");
        int m = s.nextInt();
        int sum1=0;
        for(int j=0;j<n;j++){
            sum1 = sum1+ (2*j+1);
        }
        System.out.println("the sum of first "+m+" even numbers is: ");
        System.out.println(sum1);
    }
}


