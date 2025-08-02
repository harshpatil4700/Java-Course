/*public class PS5Q5 {
    public static void main(String[] args) {
        int n = 5;
        int i =1;
        int facto=1;
        while(i<=n){
            facto *= i;
            i++;
        }
        System.out.println(facto);
    }
}*/

// getting factorial of number entered by user
import java.util.Scanner;
public class PS5Q5andPS5Q6{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("eneter a number whose factorial is to be found: ");
        int n = s.nextInt();
        
        // by while loop
        int i =1;
        int facto=1;
        while(i<=n){
            facto *= i;
            i++;
        }
        System.out.printf("the factorial of %d is: %d",n,facto);
        
        //PS5Q6:-TO FIND FACTORIAL OF A NUMBER by for loop
        System.out.print("\neneter a number whose factorial is to be found: ");
        int n1 = s.nextInt();
        int facto1=1;
        for (int j = 1; j <= n1; j++) {
            facto1 *=j;
        }
        System.out.printf("the factorial of %d is: %d",n1,facto1);
    }
}
