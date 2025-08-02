import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("0=rock,1=paper,2=scissor");
        System.out.print("\nenter your choice: ");
        int userinput=s.nextInt();

        Random r = new Random();
        int compinput=r.nextInt(3);
        // System.out.println("\nenter your choice: ");
        System.out.println("your choice: "+userinput +" and computer choice: "+compinput);
        if (userinput == compinput){
            System.out.println("draw");
        }
        else if(userinput==0 && compinput==2 || userinput==1 && compinput==0 || userinput==2 && compinput==1){
            System.out.println("congrats! you won");
        }
        else if(userinput>2 || userinput<0){
            System.out.println("Wrong choice entered! Try again");
        }
        else{
            System.out.println("NT!computer won");
        }
        System.out.println(compinput);
    }
}
