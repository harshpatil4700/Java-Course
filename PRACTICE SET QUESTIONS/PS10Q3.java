class circle{
    public int r;  //radius 
    circle(int a){
        this.r=a;
    }
    public double area(){
        System.out.print("the area of the circle is: ");
        return Math.PI*r*r;
    }
}

class cylinder extends circle{
    public int h;  //height
    cylinder(int r,int h){
        super(r);
        this.h=h;
    }
    public double area(){
        System.out.print("the area of the cylinder is: ");
        return 2*Math.PI*r*(r+h);
    }
    public double volume(){
        System.err.print("the volume of the cylinder is: ");
        return Math.PI*r*r*h;
    }
}

public class PS10Q3 {
    public static void main(String[] args) {
        circle c =new circle(5);
        System.out.println(c.area());
        cylinder cy = new cylinder(10,20);
        System.out.println(cy.area());
        System.out.println(cy.volume());
    }
}
