import java.util.Scanner;

public class Nested_TryCatchBlock {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0]=10;
        marks[1]=20;
        marks[2]=30;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value of index");
        int ind = s.nextInt();
        try {
            System.out.println("searching for the index " + ind);
            try {
                System.out.println("the value at index is: " + marks[ind]);
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("sorry! this index does not exist");
                System.out.println("Exception in nested try catch");
            }
        } 
        catch (Exception e) {
            System.out.println("exception in outer try catch");
        }
    }
}
// here, we do not get exception in the o/p as the exception are handled in nested try catch blocks


// QuickQuiz:this will run the try catch blocks until the array index in inside the bound of array
// import java.util.Scanner;

// public class Nested_TryCatchBlock {
//     public static void main(String[] args) {
//         int [] marks = new int[3];
//         marks[0]=10;
//         marks[1]=20;
//         marks[2]=30;
//         Scanner s = new Scanner(System.in);
//         boolean flag = true;
//         while (flag){
//             System.out.println("enter the value of index");
//             int ind = s.nextInt();
//         try {
//             System.out.println("searching for the index " + ind);
//             try {
//                 System.out.println("the value at index is: " + marks[ind]);
//                 flag = false;
//             } 
//             catch (ArrayIndexOutOfBoundsException e) {
//                 System.out.println("sorry! this index does not exist");
//                 System.out.println("Exception in nested try catch");
//             }
//         } 
//         catch (Exception e) {
//             System.out.println("exception in outer try catch");
//         }
//     }
//     System.out.println("thanks for executing the pgm");    
//     }
// }

