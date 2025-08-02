// to print the sum of numbers occuring in multiplication table of 8 
public class PS5Q9 {
    public static void main(String[] args) {
        int n=8;
        int sum=0;
        for(int i=1;i<=10;i++){
            sum = sum + i*n;   // or use:- sum += n*i;
        }
        System.out.println(sum);   // this command is written outside the loop bcoz it will print the sum at every iteration of the loop
    }
}
