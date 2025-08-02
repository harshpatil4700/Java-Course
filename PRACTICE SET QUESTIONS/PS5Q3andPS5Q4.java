//PS5Q3:to print multiplication table of a number
import java.util.Scanner;
public class PS5Q3andPS5Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the num whose multiplication table is needed: ");
        int m = s.nextInt();
        System.out.println("the multiplication table of "+m+" is:");
        for(int i= 0;i<=10;i++){
            System.out.printf("%d X %d = %d\n",m,i,m*i);     //here you can also use System.out.println(m + " x " + i + " = " + m*i);
        }
//PS5Q4:to print multiplication table of a number IN A REVERSE ORDER
        System.out.println("enter the num whose multiplication table is needed in reverse order: ");
        int n =s.nextInt();
        for(int j=10;j>=0;j--){
            System.out.printf("%d X %d = %d\n",n,j,n*j);  
        }
    }
}
