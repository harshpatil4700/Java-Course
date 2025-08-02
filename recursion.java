public class recursion {
    static int facto(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*facto(n-1);
        }
    }

    static int facto_iterative(int n1){
        if(n1==0 || n1==1){
            return 1;
        }
        else{
            int product =1;
            for (int i = 1; i <=n1; i++) {
                product *= i; 
            }
            return product;
        }
    }

    public static void main(String[] args) {
        // factorial by recursion
        System.out.println("the factorial of 5 is: "+facto(5));
        System.out.println("the factorial of 0 or 1 is: "+facto(0));

        // factorial by iterative
        System.out.println("the factorial of 5 is: "+facto_iterative(5));
        System.out.println("the factorial of 0 or 1 is: "+facto_iterative(0));
    }
}
