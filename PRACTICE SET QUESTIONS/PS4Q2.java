import java.util.Scanner;
public class PS4Q2 {
    public static void main(String[] args) {
       
        Scanner s  = new Scanner (System.in);
        System.out.println("enter the marks obtained in 3 subjects");
        int m1 = s.nextInt();
        int m2 = s.nextInt();
        int m3 = s.nextInt();
        float avg = (m1+m2+m3)/3.0f;
        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("congratulations! you have been promoted");
        }
        else{
            System.out.println("sorry! you are not promoted");
        }
    }
}
