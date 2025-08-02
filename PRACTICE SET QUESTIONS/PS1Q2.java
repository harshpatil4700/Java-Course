// PS1Q2: program to calculate the cgpa of student by taking marks from the user
import java.util.Scanner; 

public class PS1Q2 {
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

        float cgpa = (maths + phy + chem + eng + bio) / 50.0f;
        System.out.println("the cgpa of the student is: " + cgpa);
    }
}

