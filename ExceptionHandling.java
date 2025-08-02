public class ExceptionHandling {
    public static void main(String[] args) {
        int a =6000;
        int b = 0;
        // int c = a/b;
        // System.out.println("the result is "+ c);  executes and returns an ArithematicException as / by zero and so it can be avoided as:
         
        try {
            int c = a/b;
            System.out.println("the result is "+ c);  // this is executed if no exception is caught(here,if b is not 0)
        } 
        catch (Exception e) {
            System.out.println("we failed to derive. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the pgm"); // hence, f we would not have used try catch block then the below lines would not have been executed
        // as the compiler compiles it line by line and exits it after encountering exception
    }
}
