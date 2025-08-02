import java.util.Scanner;
public class PS3Q3 {
    public static void main(String[] args) {
        String letter = "dear <|name|> , thanks a lot!";
        letter = letter.replace("<|name|>"  , "harsh");
        System.out.println(letter);

        // OR DIRECTLY SYS OUT 

        System.out.println(letter.replace("<|name|>","harsh"));
        
        // and if ypu need to do it for a user then :
        Scanner s = new Scanner (System.in);
        System.out.println("enter your name: ");
        String user_name = s.next();
        String letter1 = "dear <|name|> , thanks a lot!"; 
        System.out.println(letter1.replace("<|name|>",user_name));
    }    
}
