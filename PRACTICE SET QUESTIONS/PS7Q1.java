import java.util.Scanner;
public class PS7Q1 {
    static void  mult(int a){
        for (int i=0;i<=10;i++){
            System.out.format("%d X %d = %d\n",a,i,a*i);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the no. whose multiplication table is req: ");
        int a =s.nextInt();
        mult(a);
    }
}
