import java.util.Scanner;
public class PS6Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        float [] marks ={68.5f,40.5f,41.0f,58.25f,54.65f};
        float sum =0f;
        for (float a : marks){
            sum = sum +a;
        }
        float avg = sum / marks.length;
        System.out.println("the average of marks is: "+ avg);
    }
}
