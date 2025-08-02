import java.util.Scanner; 

public class pq1PERCENTAGE {
    public static void main(String[] args) {
        System.out.println("taking marks of student");
        Scanner s = new Scanner(System.in);
        System.out.println("enter the marks for maths");
        int maths = s.nextInt();
        System.out.println("enter the marks for physics");
        int phy = s.nextInt();
        System.out.println("enter the marks for chem");
        int chem = s.nextInt();
        System.out.println("enter the marks for english");
        int eng = s.nextInt();
        System.out.println("enter the marks for biology");
        int bio = s.nextInt();
       
        System.out.println("marks obtained in maths: " + maths);
        System.out.println("marks obtained in physics: " + phy);
        System.out.println("marks obtained in chemistry: " + chem);
        System.out.println("marks obtained in english: " + eng);
        System.out.println("marks obtained in biology: " + bio);

        int sum = maths + phy + chem + eng + bio;
        System.out.println("the total marks obtianed in all subjects is: " + sum);
        float percentage = sum * 100 / 500;
        System.out.println("the percentage of marks of student is: " + percentage);

    }
    
}
