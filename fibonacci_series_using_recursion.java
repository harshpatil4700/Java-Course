import java.util.Scanner;
public class fibonacci_series_using_recursion {
    static int fibo(int n){

        if (n<=1){
            return n;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the numbers of terms required from fibonacci series: ");
        int n =s.nextInt();
        System.out.print("\nfibonacci series upto "+n+" terms is: ");
        for(int i=0;i<=n;i++){
            System.out.print(fibo(i)+" ");
        }
    }
}
