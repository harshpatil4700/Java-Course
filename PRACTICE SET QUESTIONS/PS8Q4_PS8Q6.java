import java.util.Scanner;
class rectangle{
    int l;
    int b;
    int area;
    int perim;
    public int getarea(int l,int b){
        int area = l*b;
        return area;
    }
    public int getperim(int l, int b){
        int perim=2*(l+b);
        return perim;
    }
}

class circle{
    int r1;
    int area1;
    double perim1;
    public int getareac(int r){
        area1=r*r;
        return area1;
    }
    public double getperimc(int r){
        perim1=2*3.14*r;
        return perim1;
    }
}

public class PS8Q4_PS8Q6 {
    public static void main(String[] args) {
        // rectangle:
        Scanner s = new Scanner (System.in);
        System.out.print("enter length of the rectangle: ");
        int l = s.nextInt();
        System.out.print("enter breadth of the rectangle: ");
        int b = s.nextInt();
        rectangle r=new rectangle();
        System.out.println("the area of the reactangle is: " + r.getarea(l,b));
        System.out.println("the perimeter of the reactangle is: " + r.getperim(l,b));

        //circle:
        Scanner s1 = new Scanner (System.in);
        System.out.print("enter radius of the circle: ");
        int r1 = s1.nextInt();
        circle c=new circle();
        System.out.println("area of circle: "+c.getareac(r1));
        System.out.println("perimeter of circle: "+c.getperimc(r1));
    }
}
