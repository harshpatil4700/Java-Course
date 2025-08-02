import java.util.Random;
import java.util.Scanner;

class game{
    public int num;
    public int inputnum;
    public int NFG=0;  //nfg=no. of guesses

    game(){
        Random r = new Random();
        this.num= r.nextInt(100);
    }

    void takeUserInput(){
        System.out.print("guess the number: ");
        Scanner s = new Scanner(System.in);
        inputnum=s.nextInt();
    }

    boolean isCorrectNum(){
        NFG++;  // the no. of times we run the pgm nfg will be incremented 
        if (num == inputnum){
            System.out.format("CONGO BRO! You guessed it right! It was %d\n You guessed it in %d attempts",num,NFG);
            return true;
        }
        else if (inputnum<num) {
            System.out.println("lesser than the number! retry");
        }
        else if (inputnum>num) {
            System.out.println("higher than the number! retry");
        }
        return false;
    }
}

public class ex3_guessing_the_number {
    public static void main(String[] args) {
        game g =new game();
        boolean b= false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNum();
        }
    }
}
