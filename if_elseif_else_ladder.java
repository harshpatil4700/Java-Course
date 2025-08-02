import java.util.Scanner;
public class if_elseif_else_ladder {
    public static void main(String[] args) {
        int age;
        System.out.print("enter your age : ");
        Scanner s = new Scanner (System.in);
        age = s.nextInt();
        if (age > 50){
            System.out.println("you are experienced!");
        }
        else if (age > 40){
            System.out.println("you are semi experienced");
        }
        else if (age>30){
            System.out.println("you are less experienced");
        }
        else{
            System.out.println("you are not experienced");
        }
    }
}
