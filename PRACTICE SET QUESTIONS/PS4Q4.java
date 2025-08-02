import java.util.Scanner;
public class PS4Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter a number : ");
        int day = s.nextInt();
        
        switch(day){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursdayay");
            case 5 -> System.out.println("friay");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default-> System.out.println("invalid choice! enter again");
           
        }
    }
    
}
