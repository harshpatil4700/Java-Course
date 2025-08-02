public class PS7Q10 {
    static int add(int n){
        if (n>0){
            int sum=0;
            sum = n+add(n-1);
            return sum;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(add(10));
    }
}
