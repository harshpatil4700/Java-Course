import java.util.Scanner;

class myexception extends Exception{
    public String toString(){
        return "i am toString()";
    }
    public String getMessage(){
        return " i am getMessage()";
    }
}

public class Exception_class {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a<9){
            try {
                throw new myexception();
                // throw new ArithmeticException("this is an exception");
            } 
            catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);  // on;y e prints the toString() method
                e.printStackTrace();  // tool which prints the throwable along with the other details
            }
        }
    }
}
        
        // if (a<0){   this is for negative dimensions of the any image
        //     try {
        //         throw new ArithmeticException("negative dimensions");
        //     } 
        //     catch (Exception e) {
        //         System.out.println(e.getMessage());
        //         System.out.println(e.toString());
        //         System.out.println(e);
        //     }
        // }