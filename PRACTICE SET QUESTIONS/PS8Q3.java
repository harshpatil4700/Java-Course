import java.util.Scanner;
class square{
    int side; //side of square
    int area;
    int perim;
    public int getside(int s){
        side =s;
        return s;
    }
    public int getarea(int s){
        area =s*s;
        return area;
    }
    public int getperimeter(int s){
        perim = 4*s;
        return perim;
    }
}

public class PS8Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the side of sqaure: ");
        int side = s.nextInt();
        square sq = new square();
        System.out.println("the side of the square is: "+sq.getside(side));
        System.out.println("the area of the square is: "+sq.getarea(side));
        System.out.println("the perimeter of the square is: "+sq.getperimeter(side));
    }
}
