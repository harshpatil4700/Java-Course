import java.util.Scanner;

public class HandlingSpecialException {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0]=10;
        marks[1]=20;
        marks[2]=30;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the array index");
        int ind = s.nextInt();

        System.out.println("eneter the number you want to divide the value with");
        int num = s.nextInt();

        try {
            System.out.println("the value at array index is: " + marks[ind]);
            System.out.println("the value of array-value divided by number is: " + marks[ind]/num);
        } 
        catch (ArithmeticException e) {    // here, this block is executed when the number to divide with is 0 (i.e / by zero exception)
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){  // here, this block is executed when the ind >=3 as array if of size 3 and so it get ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("some Exception occured!");
            System.out.println(e);
        }
    }
}
