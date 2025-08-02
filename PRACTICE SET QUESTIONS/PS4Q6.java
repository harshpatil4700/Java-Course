import java.util.Scanner;

public class PS4Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print(" enetr a website: ");
        String website = s.next();
        if (website.endsWith(".org")){
            System.out.println("this is an organizanational website");
        }
        else if (website.endsWith(".com")){
            System.out.println("this is a commercial website");
        }
        else if (website.endsWith(".in")){
            System.out.println("this is an Indian website");
        }
    }
}
